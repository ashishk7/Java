### Q1. Find the number of times below code runs where N is a perfect square

```java
for i -> 1 to N

if(i * i == N)

return i
```
### Options
```java
a. N
```
```java
b. N/2
```
```java
c. sqrt(N) 
```
```java
d. logN
```
---
### Q2. The sum of n natural numbers is :
### Options
```java
a. (n*(n+1))/2 
```
```java
b. (n*(n-1))/2
```
```java
c. (n+1)/2
```
```java
d. (n*(n+1)*(2*n+1))/6
```
---
### Q3. How many iterations will take place?

```java
int func(int n){
    int s = 0;
    for(int i = 1 ; i <= 100 ; i++){
        s = s + i;
    }
    return s;
}
```
### Options
```java
a. 100 
```
```java
b. 99
```
```java
c. 98
```
```java
d. 101
```
---

### Q4. Find the number of iterations in the following code snippet:

```java
int ans = 0;
for (int i = 0; i < n; i++)
        {
ans += i * i;
}
```
### Options
```java
a. n^2
```
```java
b. n 
```
```java
c. n-1
```
```java
d. n+1
```
---
### Q5. What will be the total number of iterations in the following code?

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j <= i; j++) {
        print(i + j);
    }
}
```
### Options
```java
a. n^2
```
```java
b. n
```
```java
c. n*(n+1) / 2 
```
```java
d. n*(n-1) / 2
```
---
### Q6. How many elements are there between [135, 246] (inclusive of them) ?
### Options
```java
a. 111
```
```java
b. 112 
```
```java
c. 113
```
```java
d. 114
```
---
### Q7. Find the total number of iterations in the following code:

```java
void solve(int N, int M)
{
    int count = 0;
    for (int i = 1; i <= N; i++)
    {
        if (N % i == 0)
            count++;
    }

    for (int i = 1; i <= M; i++)
    {
        if (M % i == 0)
            count++;
    }
    print count;
}
```
### Options
```java
a. N
```
```java
b. N+M 
```
```java
c. M
```
```java
d. N/2 + M/2
```
---

### Answers:
`Q1. c`
`Q2. a`
`Q3. a`
`Q4. b`
`Q5. c`
`Q6. b`
`Q7. b`

---
