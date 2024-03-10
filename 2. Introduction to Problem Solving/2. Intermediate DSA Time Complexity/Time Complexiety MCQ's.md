# Time Complexiety

### Q1. What is the time complexity of the following code snippet?

```java
for(int i = 1 ; i <= n ; i+=2){
print(i);
}
```
### Options
```java
a. O(n^3)
```
```java
b. O(n^2)
```
```java
c. O(n)
```
```java
d. O(logn)
```
---


### Q2. What is the time complexity of the following code snippet?

```java
void solve(int N, int M){
    for(int i = 1 ; i <= N ; i++){
        if(N % i == 0)
            print(i);
    }
    for(int i = 1 ; i <= M ; i++){
        if(M % i == 0)
            print(i);
    }
}
```
### Options
```java
a. O(N)
```
```java
b. O(M)
```
```java
c. O(N+M)
```
```java
d. O(NM)
```
---

### Q3. What is the time complexity of the following code snippet?

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
a. O(n)
```
```java
b. O(n^2)
```
```java
c. O(s)
```
```java
d. O(1)
```
---


### Q4. What is the time complexity of the following code snippet?

```java
for(int i = 0 ; i < n ; i++){
    for(int j = 0 ; j <= i ; j++){
        print(i+j);
    }
}
```
### Options
```java
a. O(n^2)
```
```java
b. O(n)
```
```java
c. O(nlogn)
```
```java
d. O(n^3)
```
---



### Q5. What is the time complexity of the following code snippet?

```java
for(int i = 1 ; i <= n ; i*=2){
    for(int j = 1 ; j <= n ; j++){
        print(i + j);
    }
}
```
### Options
```java
a. O(n^2)
```
```java
b. O(n)
```
```java
c. O(nlogn)
```
```java
d. O(n^3)
```
---

