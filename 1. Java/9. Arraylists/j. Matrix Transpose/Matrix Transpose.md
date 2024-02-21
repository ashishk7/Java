# Problem Description
Given a **2D** integer array **A**, return the transpose of **A**.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.


## Problem Constraints
```java
1 <= A.size() <= 1000

1 <= A[i].size() <= 1000

1 <= A[i][j] <= 1000
```


## Input Format
```java
First argument is a 2D matrix of integers.
```


## Output Format
```java
You have to return the Transpose of this 2D matrix.
```


## Example Input
### Input 1:

```java
A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
```

### Input 2:
```java
A = [[1, 2],[1, 2],[1, 2]]
```

## Example Output
### Output 1:
```java
[[1, 4, 7], [2, 5, 8], [3, 6, 9]]
```

### Output 2:
```java
[[1, 1, 1], [2, 2, 2]]
```

## Example Explanation
### Explanation 1:
```java
Clearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].
```
### Explanation 2:
```java
After transposing the matrix, A becomes [[1, 1, 1], [2, 2, 2]]
```
