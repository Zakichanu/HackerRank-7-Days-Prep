# Median

## Problem

The median of a list of numbers is essentially its middle element after sorting. The same number ofelements occur after it as before. Given a list of numbers with an odd number of elements, find the [median](https://en.wikipedia.org/wiki/Median)?

## Example

```arr = [5, 3, 1, 2, 4]```

Sorted list is ```arr = [1, 2, 3, 4, 5]``` The middle element is the median 3.

## Function Description

Complete the findMedian function in the editor below.

findMedian has the following parameter(s):

* int arr[n]: an unsorted array of integers

## Returns

* int: the median of the array

## Input Format

The first line contains the integer, n, the size of arr. The second line contains n space-separated integers arr[i].

## Constraints

* 1 <= n <= 1000001

* 1 <= arr[i] <= 10^9

## Sample Input 0

```

7
0 1 2 4 6 5 3
```

## Sample Output 0

```
3
```

## Explanation 0

The sorted arr = [0, 1, 2, 3, 4, 5, 6]. It's middle element is at arr[3] and the median is 3.