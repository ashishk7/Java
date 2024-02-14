# Problem Description
Given **2** arrays of integers **A** and **B**
Return a **2D** array of integers such that i-th row of the array contains list of values in **A** such that **A[j]%B[i]==0** in **A** in sequential order


## Problem Constraints
```java
1 <= |A| <= 10^3

1 <= |B| <= 10^3

1 <= A[i] <= 10^5

1 <= B[i] <= 10^5
```


## Input Format
```java
The two arguments A and B are array of integers.
```


## Output Format
```java
Return a 2D array of integers.
```


## Example Input
### Input 1:
```java
A = [1, 2, 3, 4]
B = [1, 2]
```

### Input 2:
```java
A = [2, 5, 9, 3, 8]
B = [3, 2]
```

## Example Output
### Output 1:
```java
[ [1, 2, 3, 4 ], [ 2, 4] ]
```
### Output 2:
```java
[ [9, 3 ], [ 2, 8] ]
```

## Example Explanation
### For Input 1:
```java
The elements that are multiples of 1 are [1, 2, 3, 4] and elements
that are multiples of 2 are [2, 4].
```
### For Input 2:
```java
The elements that are multiples of 3 are [9, 3] and elements
that are multiples of 2 are [2, 8].
```
