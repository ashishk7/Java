# Java Strings
Strings are used for storing text.

A ```String``` variable contains a collection of characters surrounded by double quotes:
### Example
Create a variable of type String and assign it a value:
```java
String greeting = "Hello";
```
## String Length
A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method:

### Example
```java
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());
```
## More String Methods
There are many string methods available, for example toUpperCase() and toLowerCase():
### Example
```java
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"
```
## Finding a Character in a String
The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
### Example
```java
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7
```
>[!Note]
>Java counts positions from zero.
>0 is the first position in a string, 1 is the second, 2 is the third ...

## Complete String Reference
The String class has a set of built-in methods that you can use on strings.


| Method                      | Description  |  Return Type |
|-----------------------------|---|---|
| charAt() |Returns the character at the specified index (position)|char|
| codePointAt()               |Returns the Unicode of the character at the specified index|int|
| codePointBefore()           |Returns the Unicode of the character before the specified index|int|
| codePointCount()            |Returns the number of Unicode values found in a string.|int|
| compareTo()                 |Compares two strings lexicographically|int|
| compareToIgnoreCase()       |Compares two strings lexicographically, ignoring case differences|int|
| concat()                    |Appends a string to the end of another string|String|
| contains()                  |Checks whether a string contains a sequence of characters|boolean|
| contentEquals()             |Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer|boolean|
| copyValueOf()               |Returns a String that represents the characters of the character array|String|
| endsWith()                  |Checks whether a string ends with the specified character(s)|boolean|
| equals()                    |Compares two strings. Returns true if the strings are equal, and false if not|boolean|
| equalsIgnoreCase()          |Compares two strings, ignoring case considerations|boolean|
| format()                    |Returns a formatted string using the specified locale, format string, and arguments|String|
| getBytes()                  |Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array|byte[]|
| getChars()                  |Copies characters from a string to an array of chars|void|
| hashCode()                  |Returns the hash code of a string|int|
| indexOf()                   |Returns the position of the first found occurrence of specified characters in a string|int|
| intern()                    |Returns the canonical representation for the string object|String|
| isEmpty()                   |Checks whether a string is empty or not|boolean|
| lastIndexOf()               |Returns the position of the last found occurrence of specified characters in a string|int|
| length()                    |Returns the length of a specified string|int|
| matches()                   |Searches a string for a match against a regular expression, and returns the matches|boolean|
| offsetByCodePoints()        |Returns the index within this String that is offset from the given index by codePointOffset code points|int|
| regionMatches()             |Tests if two string regions are equal|boolean|
| replace()                   |Searches a string for a specified value, and returns a new string where the specified values are replaced|String|
| replaceFirst()              |Replaces the first occurrence of a substring that matches the given regular expression with the given replacement|String|
| replaceAll()                |Replaces each substring of this string that matches the given regular expression with the given replacement|String|
| split()                     |Splits a string into an array of substrings|String[]|
| startsWith()                |Checks whether a string starts with specified characters|boolean|
| subSequence()               |Returns a new character sequence that is a subsequence of this sequence|CharSequence|
| substring()                 |Returns a new string which is the substring of a specified string|String|
| toCharArray()               |Converts this string to a new character array|char[]|
| toLowerCase()               |Converts a string to lower case letters|String|
| toString()                  |Returns the value of a String object|String|
| toUpperCase()               |Converts a string to upper case letters|String|
| trim()                      |Removes whitespace from both ends of a string|String|
| valueOf()                   |Returns the string representation of the specified value|String|


## Java String charAt() Method
Return the first character (0) of a string:
```java
String myStr = "Hello";
char result = myStr.charAt(0);
System.out.println(result);
```
### Definition and Usage
The ```charAt()``` method returns the character at the specified index in a string.

The index of the first character is 0, the second character is 1, and so on.

### Syntax
```java
public char charAt(int index)
```
### Parameter Values

|Parameter   |Description  |
|---|---|
| index  |An int value representing the index of the character to return |

### Technical Details

|Returns:  |A char value at the specified index of this string.The first char value is at index 0  |
|---|---|
| **Throws:** |IndexOutOfBoundsException - if index is negative or not less than the length of the specified string |


## Java String codePointAt() Method
The `codePointAt()` method returns the Unicode value of the character at the specified index in a string.

The index of the first character is 0, the second character is 1, and so on.

### Syntax
```java
public int codePointAt(int index)
```
### Parameter Values

|Parameter  |Description  |
|---|---|
|index  |An int value, representing the index of the character to return|

### Technical Details

|Returns:  |An int value, representing the Unicode value of the character at the index|
|---|---|
| **Throws:** |`IndexOutOfBoundsException` - if index is negative or not less than the length of the specified string |
|Java Version:|	1.5|


## Java String codePointBefore() Method
### Example
Return the Unicode of the first character in a string (the Unicode value of "H" is 72):
```java
String myStr = "Hello";
int result = myStr.codePointBefore(1);
System.out.println(result);
```
### Definition and Usage
The codePointBefore() method returns the Unicode value of the character before the specified index in a string.

The index of the first character is 1, the second character is 2, and so on.

>[!Note]
>The value 0 will generate an error, as this is a negative number (out of reach).
### Syntax
```java
public int codePointBefore(int index)
```
### Parameter Values

|Parameter  |Description  |
|---|---|
|index  |An int value, representing the index following the Unicode that should be returned|

### Technical Details

|Returns:  |An int value, representing the Unicode value of the character at the index|
|---|---|
| **Throws:** |`IndexOutOfBoundsException` - if index is negative or not less than the length of the specified string |
|Java Version:|	1.5|


## Java String codePointCount() Method
### Example
Return the number of Unicode values found in a string:

```java
String myStr = "Hello";
int result = myStr.codePointCount(0, 5);
System.out.println(result);
```
### Definition and Usage
The `codePointCount()` method returns the number of Unicode values found in a string.

Use the startIndex and endIndex parameters to specify where to begin and end the search.

The index of the first character is 0, the second character is 1, and so on.

### Syntax
```java
public int codePointCount(int startIndex, int endIndex)
```
### Parameter Values

| Parameter  |Description  |
|------------|---|
| startIndex |An `int` value, representing the index to the first character in the string|
| endtIndex  |	An `int` value, representing the index after the last character in the string|

### Technical Details

|Returns:  |An int value, representing the number of Unicode values found in a string|
|---|---|
| **Throws:** |`IndexOutOfBoundsException` - if startIndex is negative, or endindex is larger than the length of the string, or startIndex is larger than endIndex|
|Java Version:|	1.5|



## Java String compareTo() Method
### Example
Compare two strings:
```java
String myStr1 = "Hello";
String myStr2 = "Hello";
System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal
```
### Definition and Usage
The `compareTo()` method compares two strings lexicographically.

The comparison is based on the Unicode value of each character in the strings.

The method returns 0 if the string is equal to the other string. A value less than 0 is returned if the string is less than the other string (less characters) and a value greater than 0 if the string is greater than the other string (more characters).

>[!Tip]
> Use compareToIgnoreCase() to compare two strings lexicographyically, ignoring lower case and upper case differences.
>[!Tip]
> Use the equals() method to compare two strings without consideration of Unicode values.

### Syntax
```java
public int compareTo(String string2)
public int compareTo(Object object)
```
### Parameter Values

| Parameter  |Description  |
|------------|---|
| string2 |A `String`, representing the other string to be compared|
| object |An `Object`, representing an object to be compared|

### Technical Details
**Returns:**
```java
An int value: 0 if the string is equal to the other string.
< 0 if the string is lexicographically less than the other string
> 0 if the string is lexicographically greater than the other string (more characters)
```

## Java String compareToIgnoreCase() Method
### Example
Compare two strings, ignoring lower case and upper case differences:

```java
String myStr1 = "HELLO";
String myStr2 = "hello";
System.out.println(myStr1.compareToIgnoreCase(myStr2));
```
### Definition and Usage
The `compareToIgnoreCase()` method compares two strings lexicographically, ignoring lower case and upper case differences.

The comparison is based on the Unicode value of each character in the string converted to lower case.

The method returns 0 if the string is equal to the other string, ignoring case differences. A value less than 0 is returned if the string is less than the other string (less characters) and a value greater than 0 if the string is greater than the other string (more characters).
### Syntax
```java
public int compareToIgnoreCase(String string2)
```
### Parameter Values

| Parameter |Description  |
|-----------|---|
| string2   |A String, representing the other string to be compared|

### Technical Details
**Returns:**
```java
An int value: 0 if the string is equal to the other string, ignoring case differences.
< 0 if the string is lexicographically less than the other string
> 0 if the string is lexicographically greater than the other string (more characters)
```


## Java String concat() Method
### Example
Concatenate two strings:

```java
String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));
```
### Definition and Usage
The `concat()` method appends (concatenate) a string to the end of another string.


### Syntax
```java
public String concat(String string2)
```
### Parameter Values

| Parameter |Description  |
|-----------|---|
| string2   |A String, representing the string that should be appended to the other string|

### Technical Details
**Returns:**
```java
A String, representing the text of the combined strings
```


## Java String contains() Method
### Example
Find out if a string contains a sequence of characters:

```java
String myStr = "Hello";
System.out.println(myStr.contains("Hel"));   // true
System.out.println(myStr.contains("e"));     // true
System.out.println(myStr.contains("Hi"));    // false
```
### Definition and Usage
The `contains()` method checks whether a string contains a sequence of characters.

Returns `true` if the characters exist and `false` if not.

### Syntax
```java
public boolean contains(CharSequence chars)
```
### Parameter Values

| Parameter |Description  |
|-----------|---|
| CharSequence chars  |The characters to be searched for|

### Technical Details
**Returns:**
```java
A boolean, indicating whether a sequence of characters exist in the specified string:
true - sequence of characters exists
false - sequence of characters do not exist
```
Throws:
```java
NullPointerException - if the returned value is null
```




## Java String contentEquals() Method
### Example
Find out if a string contains a sequence of characters:

```java
String myStr = "Hello";
System.out.println(myStr.contains("Hel"));   // true
System.out.println(myStr.contains("e"));     // false
System.out.println(myStr.contains("Hi"));    // false
```
### Definition and Usage
The `contentEquals()` method searches a string to find out if it contains the exact same sequence of characters in the specified string or StringBuffer.

Returns `true` if the characters exist and `false` if not.
### Syntax
There are 2 `contentEquals()` methods:
```java
public boolean contentEquals(StringBuffer chars)
public boolean contentEquals(CharSequence chars)
```
### Parameter Values

| Parameter |Description  |
|-----------|---|
| StringBuffer chars  |The StringBuffer to be searched for|
|CharSequence chars|The sequence of characters to be searched for|

>[!Tip]
> The StringBuffer class is like a String, only it can be modified, found in the java.lang package. 
> The CharSequence interface is a readable sequence of char values, found in the java.lang package.

### Technical Details
**Returns:**
```java
A boolean, indicating whether the exact same sequence of characters exist in the specified string (or StringBuffer)
true - sequence of characters exists
false - sequence of characters do not exis
```




## copyValueOf()
## endsWith()
## equals()
## equalsIgnoreCase()
## format()
## getBytes()
## getChars()
## hashCode()
## indexOf()
## intern()
## isEmpty()
## lastIndexOf()
## length()
## matches()
## offsetByCodePoints()
## regionMatches()
## replace()
## replaceFirst()
## replaceAll()
## split()
## startsWith()
## subSequence()
## substring()
## toCharArray()
## toLowerCase()
## toString()
## toUpperCase()
## trim()
## valueOf()


https://www.w3schools.com/java/java_ref_string.asp
