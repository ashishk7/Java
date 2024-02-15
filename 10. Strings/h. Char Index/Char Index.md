# Problem Description
Shivam has a string A of size N containing only lowercase characters. He will update the string by inserting a number after every char which will be the index of that char.

For E.g.: if string is azd then it will be updated as a1z26d4 since index of a is 1, of z is 26 and of d is 4.

You have to tell how the string will look like afterwards,



## Problem Constraints
```java
1 <= A.size() <= 1000

a <= A[i] <= z
```


## Input Format
```java
First argument is string A.
```


## Output Format
```java
You have to return an string as per the question.
```


## Example Input
### Input 1:
```java
ashish
```

## Example Output
### Output 1:
```java
a1s19h8i9s19h8
```

## Example Explanation
### Explanation 1:

```
javaClearly after putting all the chars index in "ashish" it will become "a1s19h8i9s19h8".
```