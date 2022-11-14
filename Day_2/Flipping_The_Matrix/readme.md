# Flipping the matrix

Sean invented a game involving a `2n x 2n` matrix where each cell of the matrix contains an integer. He can reverse any of its rows or columns any number of times. The goal of the game is to maximize the sum of the elements in the  submatrix located in the upper-left quadrant of the matrix.

Given the initial configurations for `q` matrices, help Sean reverse the rows and columns of each matrix in the best possible way so that the sum of the elements in the matrix's upper-left quadrant is maximal.

## Example

``matrix=[[1,2][3,4]]``

```shell
1 2
3 4
```

It is `2 x 2` matrix. We can reverse the first row and the second column to get the following:

```shell
2 1
4 3
```

And now reverse the column 0:

```shell
4 2
1 3
```

The maximal sum is 4

**Note** : This a complicated exercice to explain, but it's not that complicated to solve. You can follow this [video](https://www.youtube.com/watch?v=4rin1enhuQQ) till the minute `4:27`, it explains it very well. Don't go further for the challenge, it's not necessary.
