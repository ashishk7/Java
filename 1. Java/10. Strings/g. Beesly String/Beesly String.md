# Problem Description
Mr. Jim likes playing with strings a lot, so Mrs. Pam gifted him a string A which has some very unique magical powers. The string consists of lowercase latin letters 'p','a' and 'm' only.

In one wish, Mr Jim can perform one of the following operations:

* Remove exactly one occurrence of 'p' and exactly one occurrence of 'm', from anywhere inside string A.

* Remove exactly one occurrence of 'a' and exactly one occurrence of 'm', from anywhere inside string A.

Now Mr. Jim wants to know if after some number of wishes is it possible to make string A empty.

**Return 1** if it is possible to make string A empty after some number of operations otherwise **Return 0**.


## Problem Constraints
```java
1 ≤ |A| ≤ 10^5
```

## Input Format
```java
The first argument is a string, A.
```


## Output Format
```java
Return 1, if it is possible to make string A empty. Otherwise return 0.
```


## Example Input
### Input 1:
```java
A = "mpampamm"    
A = "pampampam"
```

## Example Output
### Output 1:
```java
1
0
```

## Example Explanation
### Explanation 1:
```java
We can reduce the string to null in the following sequence of steps:
1) mpampamm : initial state
2) mampam   : removing 2nd and 8th character
3) mpam     : removing 1st and 2nd character
4) am       : removing 1st and 2nd character
5)          : removing 1st and 2nd character
```
So the answer is 1.

### Explanation 2:
```java
It is not possible to empty the string using any sequence of steps.
```