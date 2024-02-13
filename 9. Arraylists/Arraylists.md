
# Java ArrayList


The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:

## Example

Create an ArrayList object called cars that will store strings:
```java
import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
```
## Add Items

The ArrayList class has many useful methods. For example, to add elements to the ArrayList, use the add() method:
```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```
## Access an Item
To access an element in the ```ArrayList```, use the ```get()``` method and refer to the index number:
```java
cars.get(0);
```

## Change an Item
To modify an element, use the ```set()``` method and refer to the index number:
```java
cars.set(0, "Opel");
```
## Remove an Item
To remove an element, use the ```remove()``` method and refer to the index number:
```java
cars.remove(0);
```
To remove all the elements in the ArrayList, use the clear() method:
```java
cars.clear();
```
## ArrayList Size
To find out how many elements an ArrayList have, use the ```size``` method:
```java
cars.size();
```

## Loop Through an ArrayList
Loop through the elements of an ```ArrayList``` with a ```for``` loop, and use the ```size()``` method to specify how many times the loop should run:
```java
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
  }
}
```
You can also loop through an ```ArrayList``` with the ```for-each``` loop:
```java
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
```
## Other Types
Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of type "String". Remember that a String in Java is an object (not a primitive type). To use other types, such as int, you must specify an equivalent wrapper class: ```Integer```. For other primitive types, use: ```Boolean``` for boolean, ```Character``` for char, ```Double``` for double, etc:

### Example
```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}
```
## Sort an ArrayList
nother useful class in the ```java.util``` package is the ```Collections``` class, which include the ```sort()``` method for sorting lists alphabetically or numerically:

### Example
Sort an ArrayList of Strings:
```java
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Collections.sort(cars);  // Sort cars
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
```
### Example
Sort an ArrayList of Integers:
```java
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);

    Collections.sort(myNumbers);  // Sort myNumbers

    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}
```