/* *****************************************************************************
 *  Name:              Jeffrey Chan
 *  Coursera User ID:  2jeffreychan@gmail.com
 *  Last modified:     4/3/2022
 **************************************************************************** */

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    private static final byte OPEN = 1;
    private static final byte BOT = 2;
    private static final byte TOP = BOT << 1;


    private byte[] states;
    private int openSites;
    private final WeightedQuickUnionUF wquf;
    private final int n;
    private boolean p;


    public Percolation(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N must be > 0.");
        }
        this.n = n;
        states = new byte[n * n];
        wquf = new WeightedQuickUnionUF(n * n);
        p = false;
        openSites = 0;
    }

    public void open(int row, int col) {
        if (!onGrid(row, col)) {
            throw new IllegalArgumentException("Row or Col Index is out of bounds.");
        }

        if (isOpen(row, col)) {
            return;
        }

        int index = flatIndex(row, col);

        states[index] = OPEN;
        openSites++;

        int root = connect(row, col);

        if (states[root] > (TOP | BOT)) {
            p = true;
        }
    }

    public boolean isOpen(int row, int col) {
        if (!onGrid(row, col)) {
            throw new IllegalArgumentException("Row or Col Index is out of bounds.");
        }
        return (states[flatIndex(row, col)] > 0);
    }

    public boolean isFull(int row, int col) {
        if (!onGrid(row, col)) {
            throw new IllegalArgumentException("Row or Col Index is out of bounds.");
        }
        return ((states[wquf.find(flatIndex(row, col))] & TOP) == TOP);
    }

    public int numberOfOpenSites() {
        return openSites;
    }

    public boolean percolates() {
        return p;
    }

    private int flatIndex(int row, int col) {
        return n * (row - 1) + (col - 1);
    }

    private boolean onGrid(int row, int col) {
        return (row >= 1 && row <= n && col >= 1 && col <= n);
    }

    private int connect(int row, int col) {
        int index = flatIndex(row, col);
        int root = wquf.find(index);
        int up = flatIndex(Math.max(row - 1, 1), col);
        int down = flatIndex(Math.min(row + 1, n), col);
        int left = flatIndex(row, Math.max(col - 1, 1));
        int right = flatIndex(row, Math.min(col + 1, n));

        if (row == 1) {
            states[root] = (byte) (states[root] | TOP);
        }

        if (row == n) {
            states[root] = (byte) (states[root] | BOT);
        }

        byte uState = union(up, index, root);
        byte dState = union(down, index, root);
        byte lState = union(left, index, root);
        byte rState = union(right, index, root);
        int newRoot = wquf.find(index);
        states[newRoot] = (byte) (states[root] | states[newRoot] | uState | dState | lState
                | rState);
        return newRoot;
    }

    private byte union(int adj, int index, int root) {
        if (adj != index && states[adj] != 0) {
            int adjRoot = wquf.find(adj);
            wquf.union(adj, index);
            return states[adjRoot];
        }
        else {
            return states[root];
        }
    }
}
