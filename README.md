# Assignment Submission Results

## ASSESSMENT SUMMARY

Compilation:  PASSED<br>
API:          PASSED<br>

SpotBugs:     PASSED<br>
PMD:          PASSED<br>
Checkstyle:   PASSED<br>

Correctness:  38/38 tests passed<br>
Memory:       9/8 tests passed<br>
Timing:       20/20 tests passed<br>

Aggregate score: 101.25%<br>
[ Compilation: 5%, API: 5%, Style: 0%, Correctness: 60%, Timing: 10%, Memory: 20% ]<br>


## ASSESSMENT DETAILS

The following files were submitted:
----------------------------------
2.3K Apr  3 09:41 Percolation.class<br>
3.4K Apr  3 09:41 Percolation.java<br>
2.4K Apr  3 09:41 PercolationStats.class<br>
2.3K Apr  3 09:41 PercolationStats.java<br>

# COMPILING                                                                    

% javac Percolation.java

% javac PercolationStats.java

================================================================

Checking the APIs of your programs.

Percolation:

PercolationStats:

================================================================

## CHECKING STYLE AND COMMON BUG PATTERNS                                       

% spotbugs *.class

================================================================

% pmd .

================================================================

% checkstyle *.java

% custom checkstyle checks for Percolation.java

% custom checkstyle checks for PercolationStats.java

================================================================

## TESTING CORRECTNESS

Testing correctness of Percolation<br>
Running 21 total tests.

Tests 1 through 7 create a Percolation object using your code, then repeatedly
open sites by calling open(). After each call to open(), it checks the return
values of isOpen(), percolates(), numberOfOpenSites(), and isFull() in that order.
Tests 12 through 15 create a Percolation object using your code, then repeatedly
call the methods open(), isOpen(), isFull(), percolates(), and, numberOfOpenSites()
in random order with probabilities p = (p1, p2, p3, p4, p5). The tests stop
immediately after the system percolates.

Tests 18 through 21 test backwash.

Except as noted, a site is opened at most once.

Test 1: open predetermined list of sites using file inputs
  * filename = input6.txt
  * filename = input8.txt
  * filename = input8-no.txt
  * filename = input10-no.txt
  * filename = greeting57.txt
  * filename = heart25.txt
<br>==> passed

Test 2: open random sites until the system percolates
  * n = 3
  * n = 5
  * n = 10
  * n = 10
  * n = 20
  * n = 20
  * n = 50
  * n = 50
<br>==> passed

Test 3: open predetermined sites for n = 1 and n = 2 (corner case test)
  * filename = input1.txt
  * filename = input1-no.txt
  * filename = input2.txt
  * filename = input2-no.txt
<br>==> passed

Test 4: check predetermined sites with long percolating path
  * filename = snake13.txt
  * filename = snake101.txt
<br>==> passed

Test 5: open every site
  * filename = input5.txt
<br>==> passed

Test 6: open random sites until the system percolates,
        allowing open() to be called on a site more than once
  * n = 3
  * n = 5
  * n = 10
  * n = 10
  * n = 20
  * n = 20
  * n = 50
  * n = 50
<br>==> passed

Test 7: open random sites with large n
  * n = 250
  * n = 500
  * n = 1000
  * n = 2000
<br>==> passed

Test 8: call methods with invalid arguments
  * n = 10, (row, col) = (-1, 5)
  * n = 10, (row, col) = (11, 5)
  * n = 10, (row, col) = (0, 5)
  * n = 10, (row, col) = (5, -1)
  * n = 10, (row, col) = (5, 11)
  * n = 10, (row, col) = (5, 0)
  * n = 10, (row, col) = (-2147483648, -2147483648)
  * n = 10, (row, col) = (2147483647, 2147483647)
<br>==> passed

Test 9: call constructor with invalid argument
  * n = -10
  * n = -1
  * n = 0
<br>==> passed

Test 10: create multiple Percolation objects at the same time
        (to make sure you didn't store data in static variables)
<br>==> passed

Test 11: open predetermined list of sites using file inputs,
         but permute the order in which methods are called
  * filename = input8.txt;  order =     isFull(),     isOpen(), percolates()
  * filename = input8.txt;  order =     isFull(), percolates(),     isOpen()
  * filename = input8.txt;  order =     isOpen(),     isFull(), percolates()
  * filename = input8.txt;  order =     isOpen(), percolates(),     isFull()
  * filename = input8.txt;  order = percolates(),     isOpen(),     isFull()
  * filename = input8.txt;  order = percolates(),     isFull(),     isOpen()
<br>==> passed

Test 12: call open(), isOpen(), and numberOfOpenSites()
         in random order until just before system percolates
  * n = 3, trials = 40, p = (0.4, 0.4, 0.0, 0.0, 0.3)
  * n = 5, trials = 20, p = (0.4, 0.4, 0.0, 0.0, 0.3)
  * n = 7, trials = 10, p = (0.4, 0.4, 0.0, 0.0, 0.3)
  * n = 10, trials = 5, p = (0.4, 0.4, 0.0, 0.0, 0.3)
  * n = 20, trials = 2, p = (0.4, 0.4, 0.0, 0.0, 0.3)
  * n = 50, trials = 1, p = (0.4, 0.4, 0.0, 0.0, 0.3)
<br>==> passed

Test 13: call open() and percolates() in random order until just before system percolates
  * n = 3, trials = 40, p = (0.5, 0.0, 0.0, 0.5, 0.0)
  * n = 5, trials = 20, p = (0.5, 0.0, 0.0, 0.5, 0.0)
  * n = 7, trials = 10, p = (0.5, 0.0, 0.0, 0.5, 0.0)
  * n = 10, trials = 5, p = (0.5, 0.0, 0.0, 0.5, 0.0)
  * n = 20, trials = 2, p = (0.5, 0.0, 0.0, 0.5, 0.0)
  * n = 50, trials = 1, p = (0.5, 0.0, 0.0, 0.5, 0.0)
<br>==> passed

Test 14: call open() and isFull() in random order until just before system percolates
  * n = 3, trials = 40, p = (0.5, 0.0, 0.5, 0.0, 0.0)
  * n = 5, trials = 20, p = (0.5, 0.0, 0.5, 0.0, 0.0)
  * n = 7, trials = 10, p = (0.5, 0.0, 0.5, 0.0, 0.0)
  * n = 10, trials = 5, p = (0.5, 0.0, 0.5, 0.0, 0.0)
  * n = 20, trials = 2, p = (0.5, 0.0, 0.5, 0.0, 0.0)
  * n = 50, trials = 1, p = (0.5, 0.0, 0.5, 0.0, 0.0)
<br>==> passed

Test 15: call all methods in random order until just before system percolates
  * n = 3, trials = 40, p = (0.2, 0.2, 0.2, 0.2, 0.2)
  * n = 5, trials = 20, p = (0.2, 0.2, 0.2, 0.2, 0.2)
  * n = 7, trials = 10, p = (0.2, 0.2, 0.2, 0.2, 0.2)
  * n = 10, trials = 5, p = (0.2, 0.2, 0.2, 0.2, 0.2)
  * n = 20, trials = 2, p = (0.2, 0.2, 0.2, 0.2, 0.2)
  * n = 50, trials = 1, p = (0.2, 0.2, 0.2, 0.2, 0.2)
<br>==> passed

Test 16: call all methods in random order until almost all sites are open
         (with inputs not prone to backwash)
  * n = 3
  * n = 5
  * n = 7
  * n = 10
  * n = 20
  * n = 50
<br>==> passed

Test 17: substitute WeightedQuickUnionUF data type that sets root nondeterministically;
         call all methods in random order until almost all sites are open
         (with inputs not prone to backwash)
  * n = 3
  * n = 5
  * n = 7
  * n = 10
  * n = 20
  * n = 50
<br>==> passed

Test 18: check for backwash with predetermined sites
  * filename = input20.txt
  * filename = input10.txt
  * filename = input50.txt
  * filename = jerry47.txt
  * filename = sedgewick60.txt
  * filename = wayne98.txt
<br>==> passed

Test 19: check for backwash with predetermined sites that have
         multiple percolating paths
  * filename = input3.txt
  * filename = input4.txt
  * filename = input7.txt
<br>==> passed

Test 20: call all methods in random order until all sites are open
         (these inputs are prone to backwash)
  * n = 3
  * n = 5
  * n = 7
  * n = 10
  * n = 20
  * n = 50
<br>==> passed

Test 21: substitute WeightedQuickUnionUF data type that sets root nondeterministically;
         call all methods in random order until all sites are open
         (these inputs are prone to backwash)
  * n = 3
  * n = 5
  * n = 7
  * n = 10
  * n = 20
  * n = 50
<br>==> passed


Total: 21/21 tests passed!


================================================================

## TESTING CORRECTNESS (substituting reference Percolation)


Testing correctness of PercolationStats<br>
Running 17 total tests.

Test 1: check formatting of output of main()
  % java-algs4 PercolationStats 20 10<br>
  mean                    = 0.5867500000000001<br>
  stddev                  = 0.042525319255448016<br>
  95% confidence interval = [0.5603925340536859, 0.6131074659463143]<br>
<br>
  % java-algs4 PercolationStats 200 100<br>
  mean                    = 0.5933505000000001<br>
  stddev                  = 0.009250340547921747<br>
  95% confidence interval = [0.5915374332526074, 0.5951635667473928]<br>
<br>
==> passed

Test 2: check that methods in PercolationStats do not print to standard output
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
<br>==> passed

Test 3: check that mean() returns value in expected range
  * n =   2, trials = 10000
  * n =   5, trials = 10000
  * n =  10, trials = 10000
  * n =  25, trials = 10000
<br>==> passed

Test 4: check that stddev() returns value in expected range
  * n =   2, trials = 10000
  * n =   5, trials = 10000
  * n =  10, trials = 10000
  * n =  25, trials = 10000
<br>==> passed

Test 5: check that PercolationStats constructor creates
        trials Percolation objects, each of size n-by-n
  * n =  15, trials =  15
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
<br>==> passed

Test 6: check that PercolationStats.main() creates
        trials Percolation objects, each of size n-by-n
  * n =  15, trials =  15
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
<br>==> passed

Test 7: check that PercolationStats calls open() until system percolates
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
<br>==> passed

Test 8: check that PercolationStats does not call open() after system percolates
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
<br>==> passed

Test 9: check that mean() is consistent with the number of intercepted calls to open()
        on blocked sites
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
<br>==> passed

Test 10: check that stddev() is consistent with the number of intercepted calls to open()
         on blocked sites
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
<br>==> passed

Test 11: check that confidenceLo() and confidenceHigh() are consistent with mean() and stddev()
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
<br>==> passed

Test 12: check that exception is thrown if either n or trials is out of bounds
  * n = -23, trials =  42
  * n =  23, trials =   0
  * n = -42, trials =   0
  * n =  42, trials =  -1
  * n = -2147483648, trials = -2147483648
<br>==> passed

Test 13: create two PercolationStats objects at the same time and check mean()
         (to make sure you didn't store data in static variables)
  * n1 =  50, trials1 =  10, n2 =  50, trials2 =   5
  * n1 =  50, trials1 =   5, n2 =  50, trials2 =  10
  * n1 =  50, trials1 =  10, n2 =  25, trials2 =  10
  * n1 =  25, trials1 =  10, n2 =  50, trials2 =  10
  * n1 =  50, trials1 =  10, n2 =  15, trials2 = 100
  * n1 =  15, trials1 = 100, n2 =  50, trials2 =  10
<br>==> passed

Test 14: check that the methods return the same value, regardless of
         the order in which they are called
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
<br>==> passed

Test 15: check that no calls to StdRandom.setSeed()
  * n = 20, trials = 10
  * n = 20, trials = 10
  * n = 40, trials = 10
  * n = 80, trials = 10
<br>==> passed

Test 16: check distribution of number of sites opened until percolation
  * n = 2, trials = 100000
  * n = 3, trials = 100000
  * n = 4, trials = 100000
<br>==> passed

Test 17: check that each site is opened the expected number of times
  * n = 2, trials = 100000
  * n = 3, trials = 100000
  * n = 4, trials = 100000
<br>==> passed


Total: 17/17 tests passed!


================================================================

## MEMORY (substituting reference Percolation)

Analyzing memory of PercolationStats<br>
Running 4 total tests.

Test 1a-1d: check memory usage as a function of T trials for n = 100
            (max allowed: 8*T + 128 bytes)

|        |   T | bytes |
|:------:|:---:|:-----:|
| passed |  16 |   184 |
| passed |  32 |   312 |
| passed |  64 |   568 |
| passed | 128 |  1080 |

==> 4/4 tests passed

Estimated student memory = 8.00 T + 56.00   (R^2 = 1.000)

Total: 4/4 tests passed!

================================================================


## TIMING (substituting reference Percolation)

Timing PercolationStats<br>
Running 4 total tests.

Test 1: Call PercolationStats constructor and instance methods and
        count calls to StdStats.mean() and StdStats.stddev().
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
<br>==> passed

Test 2: Call PercolationStats constructor and instance methods and
        count calls to methods in StdRandom.
  * n = 20, trials = 10
  * n = 20, trials = 10
  * n = 40, trials = 10
  * n = 80, trials = 10
<br>==> passed

Test 3: Call PercolationStats constructor and instance methods and
        count calls to methods in Percolation.
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
<br>==> passed

Test 4: Call PercolationStats constructor and instance methods with trials = 3
        and values of n that go up by a multiplicative factor of sqrt(2).
        The test passes when n reaches 2,896.

     The approximate order-of-growth is n ^ (log ratio)

         n  seconds log ratio
     ------------------------
       724     0.16       2.7
      1024     0.42       2.7
      1448     1.17       3.0
      2048     2.94       2.7
      2896     7.05       2.5
==> passed

Total: 4/4 tests passed!

================================================================

## MEMORY

Analyzing memory of Percolation<br>
Running 4 total tests.

Test 1a-1d: check that total memory <= 17 n^2 + 128 n + 1024 bytes

|        |    n |   bytes |
|:------:|:----:|:-------:|
| passed |   64 |   37032 |
| passed |  256 |  589992 |
| passed |  512 | 2359464 |
| passed | 1024 | 9437352 |
       
==> 4/4 tests passed

Estimated student memory = 9.00 n^2 + 0.00 n + 168.00   (R^2 = 1.000)

Test 2 (bonus): check that total memory <= 11 n^2 + 128 n + 1024 bytes

==> passed

Total: 5/4 tests passed!

================================================================

## TIMING

Timing Percolation<br>
Running 16 total tests.

Test 1a-1e: Creates an n-by-n percolation system; open sites at random until
            the system percolates, interleaving calls to percolates() and open().
            Count calls to connected(), union() and find().

|        |    n |   union() | 2 * connected()<br>+ find() | constructor |
|:------:|:----:|:---------:|:---------------------------:|:-----------:|
| passed |   16 |       143 |                         415 |           1 |
| passed |   32 |       775 |                        2057 |           1 |
| passed |   64 |      3003 |                        8033 |           1 |
| passed |  128 |     11203 |                       30447 |           1 |
| passed |  256 |     45713 |                      123387 |           1 |
| passed |  512 |    187570 |                      501542 |           1 |
| passed | 1024 |    748285 |                     2001735 |           1 |
      
==> 7/7 tests passed

If one of the values in the table violates the performance limits
the factor by which you failed the test appears in parentheses.
For example, (9.6x) in the union() column indicates that it uses
9.6x too many calls.

Tests 2a-2f: Check whether the number of calls to union(), connected(), and find()
             is a constant per call to open(), isOpen(), isFull(), and percolates().
             The table shows the maximum number of union() and find() calls made
             during a single call to open(), isOpen(), isFull(), and percolates().
             One call to connected() counts as two calls to find().

|        |   n   |  per open() | per isOpen() |  per isFull() |  per percolates() |
|:------:|:-----:|:-----------:|:------------:|:-------------:|:-----------------:|
| passed |   16  |      6      |      0       |       1       |         0         |
| passed |   32  |      6      |      0       |       1       |         0         |
| passed |   64  |      6      |      0       |       1       |         0         |
| passed |  128  |      6      |      0       |       1       |         0         |
| passed |  256  |      6      |      0       |       1       |         0         |
| passed |  512  |      6      |      0       |       1       |         0         |
| passed | 1024  |      6      |      0       |       1       |         0         |

==> 7/7 tests passed



Running time (in seconds) depends on the machine on which the script runs.


Test 3: Create an n-by-n percolation system; interleave calls to percolates()
        and open() until the system percolates. The values of n go up by a
        factor of sqrt(2). The test is passed if n >= 4096 in under 10 seconds.

     The approximate order-of-growth is n ^ (log ratio)

                        log   union-find     log
         n  seconds   ratio   operations   ratio
     -------------------------------------------
      1024     0.11     2.6      3473333     2.0
      1448     0.30     2.9      6949403     2.0
      2048     0.75     2.7     13870327     2.0
      2896     1.93     2.7     27560814     2.0
      4096     4.21     2.2     55403616     2.0
==> passed



Test 4: Create an n-by-n percolation system; interleave calls to open(),
        percolates(), isOpen(), isFull(), and numberOfOpenSites() until.
        the system percolates. The values of n go up by a factor of sqrt(2).
        The test is passed if n >= 4096 in under 10 seconds.

                        log   union-find     log
         n  seconds   ratio   operations   ratio
     -------------------------------------------
      1024     0.12     1.9      4071567     2.0
      1448     0.33     3.0      8221053     2.0
      2048     0.82     2.6     16257783     2.0
      2896     2.12     2.7     32495121     2.0
      4096     4.70     2.3     64908732     2.0
==> passed


Total: 16/16 tests passed!


================================================================



