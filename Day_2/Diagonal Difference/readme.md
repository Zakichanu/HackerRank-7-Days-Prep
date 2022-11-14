# Diagonal difference

Given a square matrix, calculate the absolute difference between the sums of its diagonals.

## Example

Given the following matrix:

```shell
1 2 3
4 5 6
9 8 9
```

The left-to-right diagonal = `1 + 5 + 9 = 15`. The right to left diagonal = `3 + 5 + 9 = 17`. Their absolute difference is `|15 - 17| = 2`.

## Function Description

Complete the `diagonalDifference` function. It must return an integer representing the absolute diagonal difference.

`diagonalDifference` has the following parameter(s):

- `arr`: an array of array of integers .

## Input Format

The first line contains a single integer, `n`, the number of rows and columns in the square matrix `arr`.

Each of the next `n` lines describes a row, `arr[i]`, and consists of `n` space-separated integers `arr[i][j]`.

## Constraints

- `-100 <= arr[i][j] <= 100`

## Output Format

Print the absolute difference between the sums of the matrix's two diagonals as a single integer.

## Sample Input

```shell
3
11 2 4
4 5 6
10 8 -12
```

## Sample Output

```shell
15
```
