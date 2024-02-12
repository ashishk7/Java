# **Java HashSet**

A HashSet is a collection of items where every item is unique, and it is found in the java.util package

**Syntax:**

import java.util.HashSet; // Import the HashSet class

HashSet<DataType> setName = new HashSet<Type>();

**Example**

**Create a HashSet object called cars that will store strings:**

import java.util.HashSet; // Import the HashSet class

HashSet<String> cars = new HashSet<String>();

## **Add Items**

The HashSet class has many useful methods. For example, to add items to it, use the add() method:

import java.util.HashSet;

public class Main {
public static void main(String[] args) {
HashSet<String> cars = new HashSet<String>();
cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
cars.add("BMW");
cars.add("Mazda");
System.out.println(cars);
}
}


**Remove Elements**

To remove an item, use the remove() method:

cars.remove("Volvo");

It will remove an element and return true if it is present otherwise it will return False


