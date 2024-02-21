# Problem Description

You are given a character string A, having length N and an integer ASCII code B.

You have to tell the leftmost occurrence of the character having ASCII code equal to B, in A or report that it does not exist.

| Letters | ASCII Codes |
|---------|-------------|
| a to z  | 097 to 122  |

## Problem Constraints
```java
1 <= N <= 105

A[i] ∈ ['a'-'z']

97 <= B <= 122
```


## Input Format
```java
First argument is a character string A.

Second argument is an integer B.
```


## Output Format
```java
If there exists an occurrence, return the leftmost index(0 - based), else return -1.
```


## Example Input

### Input 1:
```java
A = "aabbcc"
B = 98
Input 2:
```
```java
A = "abc"
B = 100
```

## Example Output

### Output 1:

```java
2
```
### Output 2:
```java
-1
```

## Example Explanation

### Explanation 1:
```java
Character having ASCII code equal to 98 = 'b'
Leftmost index of character 'b' in "aabbcc" is 2.
```
### Explanation 2:
```java
Character having ASCII code equal to 100 = 'd'
Character 'd' is not present in "abc".
```