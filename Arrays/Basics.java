Arrays in Java
Last Updated : 02 Jan, 2025
Arrays are fundamental structures in Java that allow us to store multiple values of the same type in a single variable. They are useful for storing and managing collections of data. Arrays in Java are objects, which makes them work differently from arrays in C/C++ in terms of memory management.

For primitive arrays, elements are stored in a contiguous memory location. For non-primitive arrays, references are stored at contiguous locations, but the actual objects may be at different locations in memory.

Example:



1
public class Main {
2
    public static void main(String[] args)
3
    {
4
​
5
        // initializing array
6
        int[] arr = { 1, 2, 3, 4, 5 };
7
​
8
        // size of array
9
        int n = arr.length;
10
​
11
        // traversing array
12
        for (int i = 0; i < n; i++)
13
            System.out.print(arr[i] + " ");
14
    }
15
}

Output
1 2 3 4 5 
Basics of Arrays in Java
There are some basic operations we can start with as mentioned below:

1. Array Declaration
To declare an array in Java, use the following syntax:

type[] arrayName;


type: The data type of the array elements (e.g., int, String).
arrayName: The name of the array.
Note: The array is not yet initialized.

2. Create an Array
To create an array, you need to allocate memory for it using the new keyword:

// Creating an array of 5 integers
numbers = new int[5]; 


This statement initializes the numbers array to hold 5 integers. The default value for each element is 0.

3. Access an Element of an Array
We can access array elements using their index, which starts from 0:

// Setting the first element of the array
numbers[0] = 10; 


// Accessing the first element
int firstElement = numbers[0]; 


The first line sets the value of the first element to 10. The second line retrieves the value of the first element.

4. Change an Array Element
To change an element, assign a new value to a specific index:

// Changing the first element to 20
numbers[0] = 20; 


5. Array Length
We can get the length of an array using the length property:

// Getting the length of the array
int length = numbers.length; 


Now, we have completed with basic operations so let us go through the in-depth concepts of Java Arrays, through the diagrams, examples, and explanations.

In-Depth Concepts of Java Array
Following are some important points about Java arrays. 

Array Properties
In Java, all arrays are dynamically allocated.
Arrays may be stored in contiguous memory [consecutive memory locations].
Since arrays are objects in Java, we can find their length using the object property length. This is different from C/C++, where we find length using size of.
A Java array variable can also be declared like other variables with [] after the data type.
The variables in the array are ordered, and each has an index beginning with 0.
Java array can also be used as a static field, a local variable, or a method parameter.
An array can contain primitives (int, char, etc.) and object (or non-primitive) references of a class, depending on the definition of the array. In the case of primitive data types, the actual values might be stored in contiguous memory locations (JVM does not guarantee this behavior). In the case of class objects, the actual objects are stored in a heap segment.

Java Arrays

Note: This storage of arrays helps us randomly access the elements of an array [Support Random Access].


Creating, Initializing, and Accessing an Arrays in Java
For understanding the array we need to understand how it actually works. To understand this follow the flow mentioned below:

Declare
Initialize
Access
i. Declaring an Array
The general form of array declaration is 

Method 1:
type var-name[]; 


Method 2:
type[] var-name;


The element type determines the data type of each element that comprises the array. Like an array of integers, we can also create an array of other primitive data types like char, float, double, etc., or user-defined data types (objects of a class).

Note: It is just how we can create is an array variable, no actual array exists. It merely tells the compiler that this variable (int Array) will hold an array of the integer type.

Now, Let us provide memory storage to this created array.

ii. Initialization an Array in Java
When an array is declared, only a reference of an array is created. The general form of new as it applies to one-dimensional arrays appears as follows: 

var-name = new type [size];


Here, type specifies the type of data being allocated, size determines the number of elements in the array, and var-name is the name of the array variable that is linked to the array. To use new to allocate an array, you must specify the type and number of elements to allocate.

Example: 
// declaring array 
int intArray[];


// allocating memory to array 
intArray = new int[20];   


// combining both statements in one 
int[] intArray = new int[20]; 


Note: The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), or null (for reference types). Do refer to default array values in Java.

Obtaining an array is a two-step process. First, you must declare a variable of the desired array type. Second, you must allocate the memory to hold the array, using new, and assign it to the array variable. Thus, in Java, all arrays are dynamically allocated.

Array Literal in Java
In a situation where the size of the array and variables of the array are already known, array literals can be used. 

// Declaring array literal  
int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 


The length of this array determines the length of the created array.
There is no need to write the new int[] part in the latest versions of Java.
iii. Accessing Java Array Elements using for Loop
Now , we have created an Array with or without the values stored in it. Access becomes an important part to operate over the values mentioned within the array indexes using the points mentioned below:

Each element in the array is accessed via its index.
The index begins with 0 and ends at (total array size)-1.
All the elements of array can be accessed using Java for Loop.
Let us check the syntax of basic for loop to traverse an array:

 // Accessing the elements of the specified array
 for (int i = 0; i < arr.length; i++)
              System.out.println(“Element at index ” + i + ” : “+ arr[i]);


Implementation:


1
// Java program to illustrate creating an array
2
// of integers,  puts some values in the array,
3
// and prints each value to standard output.
4
​
5
class GFG {
6
    public static void main(String[] args)
7
    {
8
        // declares an Array of integers.
9
        int[] arr;
10
​
11
        // allocating memory for 5 integers.
12
        arr = new int[5];
13
​
14
        // initialize the elements of the array
15
        // first to last(fifth) element
16
          arr[0] = 10;
17
        arr[1] = 20;
18
        arr[2] = 30;
19
        arr[3] = 40;
20
        arr[4] = 50;
21
​
22
        // accessing the elements of the specified array
23
        for (int i = 0; i < arr.length; i++)
24
            System.out.println("Element at index "
25
                               + i + " : " + arr[i]);
26
    }
27
}

Output
Element at index 0 : 10
Element at index 1 : 20
Element at index 2 : 30
Element at index 3 : 40
Element at index 4 : 50
Types of Arrays in Java
Java supports different types of arrays:

1. Single-Dimensional Arrays
These are the most common type of arrays, where elements are stored in a linear order.

// A single-dimensional array
int[] singleDimArray = {1, 2, 3, 4, 5}; 


Single Dimensional Array in Java
2. Multi-Dimensional Arrays
Arrays with more than one dimension, such as two-dimensional arrays (matrices).

// A 2D array (matrix)
int[][] multiDimArray = { 
      {1, 2, 3},
     {4, 5, 6},
     {7, 8, 9} }; 


You can also access java arrays using for each loops. 

Arrays of Objects in Java
An array of objects is created like an array of primitive-type data items in the following way. 

Syntax:
Method 1:
ObjectType[] arrName;


Method 2:
ObjectType arrName[]; 


Example of Arrays of Objects
Example 1: Here we are taking a student class and creating an array of Student with five Student objects stored in the array. The Student objects have to be instantiated using the constructor of the Student class, and their references should be assigned to the array elements.



1
// Java program to illustrate creating
2
//  an array of objects
3
​
4
class Student {
5
    public int roll_no;
6
    public String name;
7
  
8
    Student(int roll_no, String name){
9
        this.roll_no = roll_no;
10
        this.name = name;
11
    }
12
}
13
​
14
public class Main {
15
    public static void main(String[] args){
16
      
17
        // declares an Array of Student
18
        Student[] arr;
19
​
20
        // allocating memory for 5 objects of type Student.
21
        arr = new Student[5];
22
​
23
        // initialize the elements of the array
24
        arr[0] = new Student(1, "aman");
25
        arr[1] = new Student(2, "vaibhav");
26
        arr[2] = new Student(3, "shikar");
27
        arr[3] = new Student(4, "dharmesh");
28
        arr[4] = new Student(5, "mohit");
29
​
30
        // accessing the elements of the specified array
31
        for (int i = 0; i < arr.length; i++)
32
            System.out.println("Element at " + i + " : { "
33
                               + arr[i].roll_no + " "
34
                               + arr[i].name+" }");
35
    }
36
}

Output
Element at 0 : { 1 aman }
Element at 1 : { 2 vaibhav }
Element at 2 : { 3 shikar }
Element at 3 : { 4 dharmesh }
Element at 4 : { 5 mohit }
Example 2: An array of objects is also created like



1
// Java program to illustrate creating
2
//  an array of objects
3
  
4
class Student{
5
    public String name;
6
  
7
    Student(String name){
8
        this.name = name;
9
    }
10
      
11
      @Override
12
    public String toString(){
13
        return name;
14
    }
15
}
16
  
17
​
18
public class Main{
19
    public static void main (String[] args){
20
      
21
        // declares an Array and initializing the
22
          // elements of the array
23
        Student[] myStudents = new Student[]{
24
          new Student("Dharma"),new Student("sanvi"),
25
          new Student("Rupa"),new Student("Ajay")
26
        };
27
  
28
        // accessing the elements of the specified array
29
        for(Student m:myStudents){    
30
            System.out.println(m);
31
        }
32
    }
33
}

Output
Dharma
sanvi
Rupa
Ajay
What happens if we try to access elements outside the array size?
JVM throws ArrayIndexOutOfBoundsException to indicate that the array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of an array.

Below code shows what happens if we try to access elements outside the array size:



1
// Code for showing error "ArrayIndexOutOfBoundsException"
2
​
3
public class GFG {
4
    public static void main(String[] args)
5
    {
6
        int[] arr = new int[4];
7
        arr[0] = 10;
8
        arr[1] = 20;
9
        arr[2] = 30;
10
        arr[3] = 40;
11
​
12
        System.out.println(
13
            "Trying to access element outside the size of array");
14
        System.out.println(arr[5]);
15
    }
16
}
Output

Trying to access element outside the size of array
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
at GFG.main(GFG.java:13)
Multidimensional Arrays in Java
Multidimensional arrays are arrays of arrays with each element of the array holding the reference of other arrays. These are also known as Jagged Arrays. A multidimensional array is created by appending one set of square brackets ([]) per dimension. 

Syntax:
There are 2 methods to declare Java Multidimensional Arrays as mentioned below:

// Method 1
datatype [][] arrayrefvariable;


// Method 2
datatype arrayrefvariable[][];


Multi-Dimensional Array
Declaration:
// 2D array or matrix
int[][] intArray = new int[10][20]; 


// 3D array
int[][][] intArray = new int[10][20][10]; 


Java Multidimensional Arrays Examples
Example 1: Let us start with basic two dimensional Array declared and initialized.



1
// Java Program to demonstrate
2
// Multidimensional Array
3
import java.io.*;
4
​
5
class GFG {
6
    public static void main(String[] args){
7
      
8
        // Two Dimensional Array 
9
          // Declared and Initialized
10
          int[][] arr = new int[3][3];
11
        
12
​
13
        // Number of Rows
14
        System.out.println("Rows : " + arr.length);
15
      
16
        // Number of Columns
17
        System.out.println("Columns : " + arr[0].length);
18
    }
19
}

Output
Rows:3
Columns:3
Example 2: Now, after declaring and initializing the array we will check how to Traverse the Multidimensional Array using for loop.



1
// Java Program to Multidimensional Array
2
​
3
// Driver Class
4
public class multiDimensional {
5
      // main function
6
    public static void main(String args[])
7
    {
8
        // declaring and initializing 2D array
9
        int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };
10
​
11
        // printing 2D array
12
        for (int i = 0; i < 3; i++) {
13
            for (int j = 0; j < 3; j++)
14
                System.out.print(arr[i][j] + " ");
15
​
16
            System.out.println();
17
        }
18
    }
19
}

Output
2 7 9 
3 6 1 
7 4 2 
Passing Arrays to Methods
Like variables, we can also pass arrays to methods. For example, the below program passes the array to method sum to calculate the sum of the array’s values.



1
// Java program to demonstrate
2
// passing of array to method
3
​
4
public class Test {
5
    // Driver method
6
    public static void main(String args[])
7
    {
8
        int arr[] = { 3, 1, 2, 5, 4 };
9
​
10
        // passing array to method m1
11
        sum(arr);
12
    }
13
​
14
    public static void sum(int[] arr)
15
    {
16
        // getting sum of array values
17
        int sum = 0;
18
​
19
        for (int i = 0; i < arr.length; i++)
20
            sum += arr[i];
21
​
22
        System.out.println("sum of array values : " + sum);
23
    }
24
}

Output
sum of array values : 15

Returning Arrays from Methods
As usual, a method can also return an array. For example, the below program returns an array from method m1. 



1
// Java program to demonstrate
2
// return of array from method
3
​
4
class Test {
5
    // Driver method
6
    public static void main(String args[])
7
    {
8
        int arr[] = m1();
9
​
10
        for (int i = 0; i < arr.length; i++)
11
            System.out.print(arr[i] + " ");
12
    }
13
​
14
    public static int[] m1()
15
    {
16
        // returning  array
17
        return new int[] { 1, 2, 3 };
18
    }
19
}

Output
1 2 3 
Java Array Members
Now, as you know that arrays are objects of a class, and a direct superclass of arrays is a class Object.

The members of an array type are all of the following: 

The public final field length contains the number of components of the array. Length may be positive or zero.
All the members are inherited from class Object; the only method of Object that is not inherited is its clone method.
The public method clone() overrides the clone method in class Object and throws no checked exceptions.
Arrays Types and Their Allowed Element Types
Array Types	Allowed Element Types
Primitive Type Arrays	Any type which can be implicitly promoted to declared type.
Object Type Arrays	Either declared type objects or it’s child class objects.
Abstract Class Type Arrays	Its child-class objects are allowed.
Interface Type Arrays	Its implementation class objects are allowed.
Cloning Arrays in Java
1. Cloning of Single-Dimensional Array
When you clone a single-dimensional array, such as Object[], a shallow copy is performed. This means that the new array contains references to the original array’s elements rather than copies of the objects themselves. A deep copy occurs only with arrays containing primitive data types, where the actual values are copied.




Below is the implementation of the above method:


1
// Java program to demonstrate
2
// cloning of one-dimensional arrays
3
​
4
class Test {
5
    public static void main(String args[])
6
    {
7
        int intArray[] = { 1, 2, 3 };
8
​
9
        int cloneArray[] = intArray.clone();
10
​
11
        // will print false as shallow copy is created
12
        System.out.println(intArray == cloneArray);
13
​
14
        for (int i = 0; i < cloneArray.length; i++) {
15
            System.out.print(cloneArray[i] + " ");
16
        }
17
    }
18
}

Output
false
1 2 3 
2. Cloning Multidimensional Array
A clone of a multi-dimensional array (like Object[][]) is a “shallow copy,” however, which is to say that it creates only a single new array with each element array a reference to an original element array, but subarrays are shared. 


Below is the implementation of the above method:



1
// Java program to demonstrate
2
// cloning of multi-dimensional arrays
3
​
4
class Test {
5
    public static void main(String args[])
6
    {
7
        int intArray[][] = { { 1, 2, 3 }, { 4, 5 } };
8
​
9
        int cloneArray[][] = intArray.clone();
10
​
11
        // will print false
12
        System.out.println(intArray == cloneArray);
13
​
14
        // will print true as shallow copy is created
15
        // i.e. sub-arrays are shared
16
        System.out.println(intArray[0] == cloneArray[0]);
17
        System.out.println(intArray[1] == cloneArray[1]);
18
    }
19
}

Output
false
true
true
Advantages of Java Arrays
Efficient Access: Accessing an element by its index is fast and has constant time complexity, O(1).
Memory Management: Arrays have fixed size, which makes memory management straightforward and predictable.
Data Organization: Arrays help organize data in a structured manner, making it easier to manage related elements.
Disadvantages of Java Arrays
Fixed Size: Once an array is created, its size cannot be changed, which can lead to memory waste if the size is overestimated or insufficient storage if underestimated.
Type Homogeneity: Arrays can only store elements of the same data type, which may require additional handling for mixed types of data.
Insertion and Deletion: Inserting or deleting elements, especially in the middle of an array, can be costly as it may require shifting elements.
Must Read:
Jagged Array in Java
For-each loop in Java
Arrays class in Java
Frequently Asked Questions – Java Arrays
How can we initialize an array in Java?
Arrays in Java can be initialized in several ways:


Static Initialization: int[] arr = {1, 2, 3};
Dynamic Initialization: int[] arr = new int[5];
Initialization with a loop: for (int i = 0; i < arr.length; i++) { arr[i] = i + 1; }
Can we use an array of primitive types in Java?
Yes, Java supports arrays of primitive types such as int, char, boolean, etc., as well as arrays of objects.


How are multidimensional arrays represented in Java?
Multidimensional arrays in Java are represented as arrays of arrays. For example, a two-dimensional array is declared as int[][] array, and it is effectively an array where each element is another array.


Can we change the size of an array after it is created in Java?
No, the size of an array in Java cannot be changed once it is initialized. Arrays are fixed-size. To work with a dynamically sized collection, consider using classes from the java.util package, such as ArrayList.


Can we specify the size of an array as long in Java?
No, we cannot specify the size of an array as long. The size of an array must be specified as an int. If a larger size is required, it must be handled using collections or other data structures.


What is the direct superclass of an array in Java?
The direct superclass of an array in Java is Object . Arrays inherit methods from the Object class, including toString(), equals(), and hashCode(). 


Which interfaces are implemented by arrays in Java?
All arrays in Java implement two interfaces:


Cloneable: Allows the array to be cloned using the clone() method.
java.io.Serializable: Enables arrays to be serialized.
