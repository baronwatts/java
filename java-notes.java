/*
Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible. It is intended to let application developers "write once, run anywhere" (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of computer architecture. 


1. object is an instance of class that has state and behavior
2. class - creates object and defines different data types and methods. Class doesn't consume space because it onlye creates and defines objects.
3. OOP is designed to help keep code organized as projects grow. - (hides/encapsulate data)
4. procedural is basically step by step code and is not organized in any particular order. (global data that can be acces anywhere in the codebase)




procedural disadvantage = functions with alot of parameters
advantage of oop = fewer perameters because they are defined in an object or class

ENCAPULATION- PROTECTING code from random access ( data and functions into single unit called objects)

ABSTRACTION -  Code that doesn't affect anything outside their containing object.
(hide details and complexity and only show the essentials) - makes the interface simplier and reduce the impact of change.  
No leakage. 
You can delete methods and change parameters but it won't impact the rest of the applications code.

INHERITANCE -  elimantes redundant code

POLYMORPHASISM - writing the same methods that act differently depending on the TYPE of object you are referencing
poly - many
morph - forms
gets rid of long if else and case statements (refactor)







*/


 public class Dog {
   String breed;
   int age;
   String color;

   void barking() {

   }

   void hungry() {

   }

   void sleeping() {

   }

}

/*
A class is a blueprint from which individual objects are created.
The code above is a sample of a class Dog with attributes and behavior. 

4. Constructor -  Used to create and define objects, methods, and data types with no return type

	Constructor : 

	    A constructor is used to initialize the state of an object. 
	    A constructor must not have a return type. 
	    The constructor is invoked implicitly. 
	    The Java compiler provides a default constructor if you don't have any constructor in a class. 
	    The constructor name must be same as the class name. 

	Method : 

	    A method is used to expose the behavior of an object. 
	    A method must have a return type. 
	    The method is invoked explicitly.
	    The method is not provided by the compiler in any case. 
	    The method name may or may not be same as class name. 


5. Types of constructors
	-Default Constructor
	-Parameterized Constructor

6.  super() = default contructor

7.	No-Argument Constructor
*/

	public Bicycle() {
	    gear = 1;
	    cadence = 10;
	    speed = 0;
	}

	Bicycle yourBike = new Bicycle(); //invokes the no-argument constructor to create a new Bicycle object called yourBike. 


/*
8. Parameterized Constructor

A constructor which has a specific number of parameters is called a parameterized constructor. 

The parameterized constructor is used to provide different values to the distinct objects. However, you can provide the same values also. 
*/

class Student4{  
    int id;  
    String name;

    //created the constructor of Student class that have two parameters
    Student4(int i,String n){  
    	id = i;  
    	name = n;  
    }  

    void display(){
    	System.out.println(id+" "+name);
    }  

    public static void main(String args[]){  
    	Student4 s1 = new Student4(111,"Karan");  
    	Student4 s2 = new Student4(222,"Aryan");   
    	s1.display();  
    	s2.display();  
   }  

}  


/*
9. Constructor overloading - more than one contrucotr in a class that accepts different parameters
*/

class Student5{  
    int id;  
    String name;  
    int age;  

    //creating two argument constructor  
    Student5(int i,String n){  
    	id = i;  
    	name = n;  
    }  

    //creating three argument constructor  
    Student5(int i,String n,int a){  
    	id = i;  
    	name = n;  
    	age=a;  
    }  

    void display(){
    	System.out.println(id+" "+name+" "+age);
    }  

   
    public static void main(String args[]){  
    	Student5 s1 = new Student5(111,"Karan");  
    	Student5 s2 = new Student5(222,"Aryan",25);  
    	s1.display();  
    	s2.display();  
   }  

}  


/*
9. Inheritance 
	- acquires all the properties and behaviors of a parent object. 
	- can create new classes that are built upon existing classes.
	- inheritance represents the IS-A relationship which is also known as a parent-child relationship
	- can reuse
	- For Method Overriding (so runtime polymorphism can be achieved).

10. 

	Class: A class is a group of objects which have common properties.
	Sub Class/Child Class: Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class. 
	Super Class/Parent Class: Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.

11. 
*/

	class Subclass-name extends Superclass-name {  
		//methods and fields added here 
	}

	/*
	The extends keyword indicates that you are making a new class that derives from an existing class. The meaning of "extends" is to increase the functionality.
	*/


/*
12.
*/ 
	class Employee{  
	 	float salary = 40000;  
	}  

	//Programmer IS-A Employee. It means that Programmer is a type of Employee. 
	class Programmer extends Employee{  
	 	int bonus=10000;  
	 	public static void main(String args[]){  
	   		Programmer p=new Programmer();  
	   		System.out.println("Programmer salary is:"+p.salary);  
	   		System.out.println("Bonus of Programmer is:"+p.bonus);  
		}  
	} 


/*
13. Inheritance - gives access to variables and methods of one class to another. (can only extend one other class)
	 -single
	 -multilevel
	 -hierarchical


14. SINGLE INHERITANCE
*/


	class Animal{  
		void eat(){
			System.out.println("eating...");
		}  
	}



	class Dog extends Animal{  
		//Single Inheritance
		void bark(){
			System.out.println("barking...");
		}  
	}  



	class TestInheritance{  
		public static void main(String args[]){  
			Dog d = new Dog();  
			d.bark();  
			d.eat();  
		}	
	}




/*
15. MULTILEVEL INHERITANCE
*/

	class Animal{  
		void eat(){
			System.out.println("eating...");
		}  
	}  



	class Dog extends Animal{  
		//Level 1 - Inheritance
		void bark(){
			System.out.println("barking...");
		}  
	}



	class BabyDog extends Dog{  
		//Level 2 - Inheritance
		void weep(){
			System.out.println("weeping...");
		}  
	}


	class TestInheritance2{  
		public static void main(String args[]){  
			BabyDog d = new BabyDog();  
			d.weep();  
			d.bark();  
			d.eat();  
		}
	} 



/*
15. HIERARCHICAL INHERITANCE
*/

	class Animal{  
		void eat(){
			System.out.println("eating...");
		}  
	}  



	class Dog extends Animal{  
		// Hierarchical Inheritance
		void bark(){
			System.out.println("barking...");
		}  
	}  



	class Cat extends Animal{  
		// Hierarchical Inheritance
		void meow(){
			System.out.println("meowing...");
		}  
	}  



	class TestInheritance3{  
		public static void main(String args[]){  
			Cat c = new Cat();  
			c.meow();  
			c.eat();  
			//c.bark(); //Error
		}
	}



/*
To reduce the complexity and simplify the language, multiple inheritance is not supported in java. 
multiple ex)
*/

public class A extends B extends C{
	
}

/*
Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.

Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. So whether you have same method or different, there will be compile time error.
*/

class A{  
	void msg(){
		System.out.println("Hello");
	}  
}  


class B{  
	void msg(){
		System.out.println("Welcome");
	}  
}  


class C extends A,B{  
	//suppose if it were  
	 public static void main(String args[]){  
	   C obj=new C();  
	   obj.msg();  //Now which msg() method would be invoked?, There are no extends!
	}  
}  



/*
16. Acesss modifier changes permission levels of a class


17. abstract classes exist to be extended, they can not be instantiated
*/

package game;
public abstract class GameObject{

	//this method must be implemented by any class that extends GameObject
	public abstract void draw();

	public static void main(String[] args){
		GameObject player = new Player();
		//player.draw();

		GameObject menu = new Menu();
		//menu.draw();

		//add player and menu to the gamepbjects array

		GameObject[] gameobjects = new GameObject[2];//sets the size of the array to 2 slots
		gameobjects[0] = player;
		gameobjects[1] = menu;

		//loop through the array and call the draw method
		for(GameObject : gameObjects){
			obj.draw();
		}
		//GameObject myObject = new GameObject();
		
	}
}


/*
18.For Loop
*/

 	String[] stringArray = {"Random","Words","Here"};

	for(String word : stringArray){
		System.out.println(word);
	}


/*
19. Copy Array
*/

	import java.util.Arrays;
	public class Main{
	    public static void main(String args[]){
	        // initializing an array original
	        int[] org = new int[] {1, 2 ,3};
	  
	        System.out.println("Original Array");
	        for (int i = 0; i < org.length; i++)
	            System.out.print(org[i] + " ");
	  
	        // copying array org to copy
	        int[] copy = Arrays.copyOf(org, 5);
	  
	        // Changing some elements of copy
	        copy[3] = 11;
	        copy[4] = 55;
	  
	        System.out.println("\nNew array copy after modifications:");
	        for (int i = 0; i < copy.length; i++)
	            System.out.print(copy[i] + " ");
	    }
	}


/*	
	Compiler Output:
	Original Array
	1 2 3 
	New array copy after modifications:
	1 2 3 11 55 
*/



/*
20.
*/ 
	String[] cloneOfArray = Arrays.copyOf(stringArray, 3);
	System.out.println( Arrays.toString(cloneOfArrays) );
	System.out.println( Arrays.binarySearch(cloneOfArray, "Random") );


/*
21.

	A Point representing a location in (x,y) coordinate space, specified in integer precision.
	https://docs.oracle.com/javase/8/docs/api/index.html?java/awt/Point.html

	The Java compiler differentiate the constructors on the number and the type of the arguments. It knows to call the constructor in the CLASS that requires a Point argument follwed by two intergers.
*/ 

	Public class Rectangle{
		public int width = 0;
		public int height = 0;
		public Point origin;//(orgin = x,y)

		//four constructors
		public Rectangle(){
			origin = new Point(0,0);
		}

		public Rectangle(Point p){
			origin = p;
		}

		public Rectangle(int w, int h){
			origin = new Point(0,0);
			width = w;
			height = h;
		}

		public Rectangle(Point p, int w, int h){
			origin = p;
			width = w;
			height = h;
		}

		//a method for moving the rectangle
		public void move(int x, int y){
			origin.x = x;
			origin.y = y;
		}

		//a method for computing the area of the rectangle
		public int getArea(){
			return width * height;
		}

	}



/*
22.
*/ 
	public class Puppy{
		public Puppy(String name){
			System.out.println("Passed Name is :" + name);
		}
		public static void main(String []args){
			Puppy myPuppy = new Puppy("tommy");
		}
	}



/*
23.
*/ 
	class Time{
		int hour, minute;
		double second;

		public Time(){
			this.hour = 0;
			this.minute = 0;
			this.second = 0.0;
		}

		public Time(int hour, int minute, double second){
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}

		public static void main(String[] args){
			//one way to create and initialize a Time object
			Time t1 = new Time();
			t1.hour = 11;
			t1.minute = 8;
			t1.second = 3.14159;
			System.out.println (t1);

			//another way to do the same thing
			Time t2 = new Time(11,8,3.14159);
			System.out.println(t2);
		}
	}


/*
24. Case Statement
*/

	int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;
	switch(randomNumber){
		case 8:
			System.out.println("Favorite character set back");
			break;

		case 10:
		case 11:
		case 12:
			System.out.println("Favorite character set back");
			break;

		default:
			System.out.println();
			break;
	}






	public class Test {
	   public static void main(String args[]) {

	      // char grade = args[0].charAt(0);
	      char grade = 'C';


	      switch(grade) {
	         case 'A' :
	            System.out.println("Excellent!"); 
	            break;
	         case 'B' :
	         case 'C' :
	            System.out.println("Well done");
	            break;
	         case 'D' :
	            System.out.println("You passed");
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	         default :
	            System.out.println("Invalid grade");
	      }

	      System.out.println("Your grade is " + grade);

	   }

	}





/*
25.
*/ 
	protected static String printNumbers(int maxNumbers){
		int i = 1;
		while( i < (maxNumbers / 2) ){
			System.out.println(i);
			i++;

			if( i==(maxNumbers/2) ) break;
		}
	}



/*
26. Polymorphism - parent class reference is used to refer to a child class object.
	Any Java object that can pass more than one IS-A test is considered to be polymorphic. In Java, all Java objects are polymorphic since any object will pass the IS-A test for their own type and for the class Object.
*/


/*
27. Method Overloading - a class that has multiple methods with the same name but different parameters. Method overloading is not 		possible by changing the return type of the method.
		2 ways to do it.
		- By changing number of arguments
    	- By changing the data type
*/


    class Adder{  
		static int add(int a, int b){return a+b;}  // 2 arguments of int data type
		static double add(double a, double b){return a+b;}  // 2 arguments of double data type 
	}  

	class TestOverloading2{  
		public static void main(String[] args){  
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(12.3,12.6));  
	}} 


/*28. 
	Overloading the main() method in Java
	//You can have any number of main methods in a class by method overloading. But JVM calls main() method which receives string array as arguments only. 
*/


	class TestOverloading4{  
		public static void main(String[] args){System.out.println("main with String[]");}  
		public static void main(String args){System.out.println("main with String");}  
		public static void main(){System.out.println("main without args");}  
	}  


/*
29. Method Overriding
	Usage : 

    Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
    Method overriding is used for runtime polymorphism

	Rules : 

    The method must have the same name as in the parent class
    The method must have the same parameter as in the parent class.
    There must be an IS-A relationship (inheritance).


    Static method cannot be overridden. It is because the static method is bound with class whereas instance method is bound with an object. Static belongs to the class area, and an instance belongs to the heap area. 
*/





class ABC{
   //Overridden method. Static methods CANNOT be overidden
   public void disp(){
     System.out.println("disp() method of parent class");
   }     
}

class Demo extends ABC{
   
   //defined the disp() method in the subclass as defined in the parent class but it has some specific implementation. The name and parameter list of the methods are the same, and there is IS-A relationship between the classes.

   public void disp(){
     System.out.println("disp() method of Child class");
   }

   public void newMethod(){
      System.out.println("new method of child class");
   }

   public static void main( String args[]) {

 
  ABC obj = new ABC();
  obj.disp();
  ABC obj2 = new Demo(); // Covariance with reference types
  obj2.disp();

   }
}


/*
30. Encapsulation
	-data hiding
	-private
	-setters
	-getters
	-Java Bean
	- can make read-only or write-only

    Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines. 
    We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it. 
    The Java Bean class is the example of a fully encapsulated class. 

    Setter & Getter
*/

    package com.revature;  
	public class Student{  

		//private data member  
		private String name;  

		//getter method for name  (READ-ONLY)
		public String getName(){  
			return name;  
		}  

		//setter method for name  
		public void setName(String name){  
			this.name=name  
		}  
	}


/*
A Java class to test the encapsulated class. 
*/ 

package com.revature;  
class Test{  

	public static void main(String[] args){  

		//creating instance of the encapsulated class  
		Student s = new Student();  

		//setting value in the name member  (WRITE-ONLY)
		s.setName("vijay");  

		//getting value of the name member  
		System.out.println(s.getName());  
	}  
}



/*
	31. Access Modifiers - changes permission levels other classes have to a method or variable
	-private = no class is able to access. Only (this/itself) field can have acces. Most restricted.
    -default = subclasses only have access if only in same package
    -protected = only available to subclasses and (this/itself) classes. subclasses can be in any package. Classes in same package too.
    -public = all classes in any package can execute this method

    private and protected are not available on the class level.
    classes only support public and default.
    methods and variables support all access modifiers.
    *Recommended to use the most restricted acces level*
    	-private variables
    	-public access methods

    Private - only instances have access to private.
	

	non-access modifiers 
	 -static 
	 -abstract 
	 -synchronized
	 -native
	 -volatile 
	 -transient 



32. Access Modifiers with Method Overriding
*/

	class A{  
		protected void msg(){
			System.out.println("Hello java");
		}  
	}  

		  

	public class Simple extends A{  
		void msg(){
			System.out.println("Hello java");
		} // Error because Class Simple method msg() is more restrictive that Class A method msg() 

		 public static void main(String args[]){  
		   Simple obj = new Simple();  
		   obj.msg();  
		 }  
	}


/*
33. Abstraction lets you focus on what the object does instead of how it does it. (hiding details)

34. Generalization is the process of extracting shared characteristics from two or more classes, and combining them into a generalized 	   superclass. Shared characteristics can be attributes, associations, or methods. 

35. Specialization means creating new subclasses from an existing class. If it turns out that certain attributes, associations, or 		methods only apply to some of the objects of the class, a subclass can be created.

36. Abstract Class cannot be instantiated. It needs to be extended and its method implemented. There are 2 ways to achieve abstraction.
		-Abstract class (0 to 100%)
		-Interface (100%)
*/



	abstract class Bike{   
  		abstract void run();
	}  


	class Honda4 extends Bike{  
		void run(){
			System.out.println("running safely");
		}  

		public static void main(String args[]){  
		 	Bike obj = new Honda4();  
		 	obj.run();  
		}  
	} 


/*
	37. Interface - a collection of abstract methods.
	- A class can implement multiple interfaces
	- Interfaces extends other(multiple) interfaces
	- interfaces cannot extend classes, and do not implement other interfaces. It is implemented by a class.
	- a class describes the attributes and behaviors of an object. And an interface contains behaviors that a class implements
	- cannot instantiate an interface
	- does not contain any constructors
	- methods in an interface are abstract
	- cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final
	- A class can implement more than one interface at a time.
    - A class can extend only one class, but implement many interfaces.
    - An interface can extend another interface, in a similar way as a class can extend another class.
*/


	//File name : MammalInt.java
	public class MammalInt implements Animal {
	   public void eat() {
	      System.out.println("Mammal eats");
	   }

	   public void travel() {
	      System.out.println("Mammal travels");
	   } 

	   public int noOfLegs() {
	      return 0;
	   }

	   public static void main(String args[]) {
	      MammalInt m = new MammalInt();
	      m.eat();
	      m.travel();
	   }

	} 




/*
	38. Extending Interfaces


	An interface can extend another interface in the same way that a class can extend another class. The extends keyword is used to extend an interface, and the child interface inherits the methods of the parent interface. 

	The Hockey interface has four methods, but it inherits two from Sports. Thus, a class that implements Hockey needs to implement all six methods. Similarly, a class that implements Football needs to define the three methods from Football and the two methods from Sports.
*/

	// Filename: Sports.java
	public interface Sports {
	   public void setHomeTeam(String name);
	   public void setVisitingTeam(String name);
	}


	// Filename: Football.java
	public interface Football extends Sports {
	   public void homeTeamScored(int points);
	   public void visitingTeamScored(int points);
	   public void endOfQuarter(int quarter);
	}


	// Filename: Hockey.java
	public interface Hockey extends Sports {
	   public void homeGoalScored();
	   public void visitingGoalScored();
	   public void endOfPeriod(int period);
	   public void overtimePeriod(int ot);
	}



/*
	39.Extending Multiple Interfaces

	A Java class can only extend one parent class. Multiple inheritance is not allowed. Interfaces are not classes, however, and an interface can extend more than one parent interface.

	The extends keyword is used once, and the parent interfaces are declared in a comma-separated list.

	EX) public interface Hockey extends Sports, Event




40. Static 
	- marks an item as a member of the class
	- methods and variables labeled static are available without having to create objects of that class type
	- main is labeled static (don't have to create an instance of it)

41. Final
	- can't change it's value (variables)
	- if METHOD is marked w/final then code in subclasses cannot override
	- if CLASS is marked w/final then another class can't extend it
	- can be placed before or after the access modifier
	- final variable that have no value it is called blank final variable or uninitialized final variable
	- It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only.
*/

	
	//final variable
	class Bike9{  
		final int speedlimit = 90;//final variable  
	 	void run(){  
	  		speedlimit = 400;  // Compile Time Error (Cant change final variable value)
	 	}  

		public static void main(String args[]){  
		 	Bike9 obj = new  Bike9();  
		 	obj.run();  
		}  

	}//end of class 





	//final method
	class Bike{  
		final void run(){
			System.out.println("running");
		}  
	}  

		     

	class Honda extends Bike{  
	   void run(){
	   		System.out.println("running safely with 100kmph"); // Compile Time Error (Cant override final method)
	   	}  
	     
	   public static void main(String args[]){  
	   		Honda honda = new Honda();  
	   		honda.run();  
	   }  
	} 




	//final class
	final class Bike{}  

  
	// Compile Time Error (Cant extend final class)
	class Honda1 extends Bike{  
	  void run(){
	  	System.out.println("running safely with 100kmph");
	  }  

	  public static void main(String args[]){  
	  	Honda1 honda = new Honda1();  
	  	honda.run();  
	  }  

	} 












/*
	42. While Loop
*/

	public class Test {
	   public static void main(String args[]) {
	      int x = 10;

	      while( x < 20 ) {
	         System.out.print("value of x : " + x );
	         x++;
	         System.out.print("\n");
	      }
	   }
	}



/*
	43. For Loop
*/

	public class Test {
	   public static void main(String args[]) {

	      for(int x = 10; x < 20; x = x + 1) {
	         System.out.print("value of x : " + x );
	         System.out.print("\n");
	      }
	   }
	}


	//Java 5 enhanced loop
	public class Test {
	   public static void main(String args[]) {
	      int [] numbers = {10, 20, 30, 40, 50};

	      for(int x : numbers ) {
	         System.out.print( x );
	         System.out.print(",");
	      }

	      System.out.print("\n");

	      String [] names = {"James", "Larry", "Tom", "Lacy"};

	      for( String name : names ) {
	         System.out.print( name );
	         System.out.print(",");
	      }
	   }
	}





/*
	44. Do While Loop
*/


	public class Test {
	   public static void main(String args[]) {
	      int x = 10;
	      do {
	         System.out.print("value of x : " + x );
	         x++;
	         System.out.print("\n");
	      }while( x < 20 );
	   }
	}


/*
	45. Super - used to refer immediate parent class object. Whenever you create the instance of subclass, an instance of parent class is 	  created implicitly which is referred by super reference variable.
	- can be used to invoke immediate parent class method
	- can be used to invoke immediate parent class constructor
*/


	// refer parent class instance variable
	class Animal{  
		String color = "white";  
	}  

	class Dog extends Animal{  
		String color = "black";  

		void printColor(){  
			System.out.println(color);  //prints color of Dog class  
			System.out.println(super.color);  //prints color of Animal class  
		}  
	}  

	class TestSuper1{  
		public static void main(String args[]){  
			Dog d = new Dog();  
			d.printColor();  
		}
	} 



	// invoke parent class method
	class Animal{  
		void eat(){
			System.out.println("eating...");
		}  
	}  


	class Dog extends Animal{  
		void eat(){
			System.out.println("eating bread...");
		}  

		void bark(){
			System.out.println("barking...");
		}  

		void work(){  
			super.eat();  // Calling the parent class eat() method using super keyword
			bark();  
		}  
	}  



	class TestSuper2{  
		public static void main(String args[]){  
			Dog d = new Dog();  
			d.work();  
		}
	}



	// invoke parent class constructor
	// While using "super" keyword to access the parent class constructor, remember that it has to be in the first line within the 	    subclass constructor. 

	class Animal{  
		Animal(){
			System.out.println("animal is created");
		}  
	}  


	class Dog extends Animal{  
		Dog(){  
			super(); // using super keyword to access the parent class constructor. 
			System.out.println("dog is created");  
		}  
	}  


	class TestSuper3{  
		public static void main(String args[]){  
			Dog d = new Dog();  
		}
	} 

					


/*
	46.  static - used for memory management (makes your program memory efficient)
		- belongs to the class than an instance of the class
		- can apply to variables, methods, blocks and nested class 
*/


//Java Program to demonstrate the use of static variable  

class Student{  
   int rollno;//instance variable  
   String name;  
   static String college ="ITS"; //static variable  

   //constructor  
   Student(int r, String n){  
	   rollno = r;  
	   name = n;  
   }  

   //method to display the values  
   void display (){
   		System.out.println(rollno+" "+name+" "+college);
   	}  
}  



//Test class to show the values of objects  

public class TestStaticVariable1{  
	public static void main(String args[]){  
		Student s1 = new Student(111,"Karan");  
		Student s2 = new Student(222,"Aryan");  

		//we can change the college of all objects by the single line of code  

		//Student.college = "BBDIT";  
		s1.display();  
		s2.display();  
 	}  
}  





/*
	47.
*/


//create string
public class StringDemo {
   public static void main(String args[]) {
      char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
      String helloString = new String(helloArray);  
      System.out.println( helloString );
   }
}


//string length
public class StringDemo {
   public static void main(String args[]) {
      String palindrome = "Dot saw I was Tod";
      int len = palindrome.length(); // Using the length method
      System.out.println( "String Length is : " + len );
   }
}


//concatenate
"My Name is".concat("Zara");

"Hello," + " world" + "!"

public class StringDemo {
   public static void main(String args[]) {
      String string1 = "saw I was ";
      System.out.println("Dot " + string1 + "Tod");
   }
}

/*
	char charAt(int index)  - Returns the character at the specified index. 
	int compareTo(Object o)  - Compares this String to another Object. 
	String concat(String str)  - Concatenates the specified string to the end of this string. 
	boolean equals(Object anObject) - Compares this string to the specified object. 
	boolean equalsIgnoreCase(String anotherString) - Compares this String to another String, ignoring case considerations. 
*/


/*
	48. Packages - a group of similar types of classes, interfaces and sub-packages. 
		-built-in package ( lang, awt, javax, swing, net, io, util, sql etc.)
		-user-defined package

	Advantages of Packages
		-to categorize the classes and interfaces so that they can be easily maintained.
		-provides access protection.
		-removes naming collision.

	Accessing a package from other packages
		-import package.*;
    	-import package.classname;
    	-fully qualified name.
*/



/*
	49. Using packagename.* 
		-If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages. 
		-The import keyword is used to make the classes and interface of another package accessible to the current package
*/


		//save by A.java  
		package pack;  

		public class A{  
		  public void msg(){System.out.println("Hello");}  
		}  


		//save by B.java  
		package mypack;  
		import pack.A;  //Importing class A from packagename pack which gives us access to only A.

		  
		class B{  
		  public static void main(String args[]){  
		   A obj = new A();  
		   obj.msg();  
		  }  
		}  




/*50. 
	Using packagename.classname
		-only declared class of this package will be accessible
*/

		//save by A.java  
		package pack;  

		public class A{  
		  public void msg(){System.out.println("Hello");}  
		}  


		//save by B.java  
		package mypack;  
		import pack.A;  //Importing class A from packagename pack which gives us access to only A.

		  
		class B{  
		 	public static void main(String args[]){  
		   		A obj = new A();  
		   		obj.msg();  
		  	}  
		}  




/*
	51. Using fully qualified name
		- only declared class of this package will be accessible. Now there is no need to import. But you need to use fully qualified 	name every time when you are accessing the class or interface.
		- used when two packages have same class name e.g. java.util and java.sql packages contain Date class.
*/


		//save by A.java  
		package pack;  

		public class A{  
		  public void msg(){System.out.println("Hello");}  
		}  


		//save by B.java  
		package mypack;  

		class B{  
		 	public static void main(String args[]){  
		   		pack.A obj = new pack.A(); // using fully qualified name  
		   		obj.msg();  
		  	}  
		} 



/*
	52. Exception - is an object that wraps an error event that occurred within a method.
		- Checked Exceptions - compiler looks for and checks the error and application won't run until it's fixed
    	- Unchecked Exceptions -  compiler does not enforce (check) that you handle them explicitly. (Errors and RuntimeExceptions)
    	- Errors - ignored at the time of compilation
*/


    	//Checked
    	//If the file does not exist an exception is thrown. That exception is called as FileNotFoundException
    	import java.io.File;

		import java.io.FileReader;
		public class FilenotFoundDemo {
		   public static void main(String args[]) {  
		      File file = new File("E://file.txt");
		      FileReader fr = new FileReader(file); 
		  }
		}



		//unchecked
		//If you have declared an array of size 5 in your program, and trying to call the 6th element of the array then an ArrayIndexOutOfBoundsException occurs. 

		public class Unchecked_Demo {
		   public static void main(String args[]) {
		      int num[] = {1, 2, 3, 4};
		      System.out.println(num[5]);
		   }
		}




/*
	53. Catching Exceptions - Code within a try/catch block is referred to as protected code.
		The following is an array declared with 2 elements. Then the code tries to access the 3rd element of the array which throws an exception. 
*/

	
	// File Name : ExcepTest.java
	import java.io.*;
	public class ExcepTest {
	   public static void main(String args[]) {
	      try {
	         int a[] = new int[2]; // Size 2
	         System.out.println("Access element three :" + a[3]); // Accessing 3rd element

	      } catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("Exception thrown  :" + e);
	      }

	      System.out.println("Out of the block");
	   }
	}



/*	54. Throw
	-throws is used to postpone the handling of a checked exception and throw is used to invoke an exception explicitly. 
	-One can throw an exception, either a newly instantiated one or an exception that you just caught, by using the throw keyword.
	- can throw the erros to he JVM and allow the application to run
*/

	import java.io.*;
	public class className {
	   public void deposit(double amount) throws RemoteException {

	      // Method implementation
	      throw new RemoteException();

	   }

	   // Remainder of class definition

	} 


/*
	55. Finally Block - allows you to run any cleanup-type statements that you want to execute, no matter what happens in the protected code.
*/


public class ExcepTest {
   public static void main(String args[]) {
      int a[] = new int[2]; // Size 2
      try {
         System.out.println("Access element three :" + a[3]); // Accessing 3rd element
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      }finally { // Always executed no matter what!
         a[0] = 6;
         System.out.println("First element value: " + a[0]);
         System.out.println("The finally statement is executed");
      }
   }
}

/*
	Output : 
	Exception thrown  :java.lang.ArrayIndexOutOfBoundsException: 3
	First element value: 6
	The finally statement is executed
*/



/*
	56. Array - We can store only the fixed size of elements in the array. It doesn't grow its size at runtime. To solve this problem, collection framework is used in Java which grows automatically
*/

class Testarray{  
	public static void main(String args[]){  
		int a[]=new int[5];  //declaration and instantiation  
		a[0]=10;  //initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  

		//traversing array  

		for(int i=0;i<a.length;i++)  //length is the property of array  
		System.out.println(a[i]);  

	}
}  



/*
	57. List, Set, Map

	Array
	- reserves meory so theri contents are adjacent
	- array sizes are fixed
	- arrays are access by their index
	- memory is reserved

	list/vector
	- dynamically grow in size (flexibility)
	- memory is not reserved at initialization
	- often just wrappers around arrays

	when array gets full they create a new one and copies the original arrays into the new one (DOUBLES IN SIZE WHEN FULL)


	linked list
	- no index
	- not a wrapper for an array
	- made up of nodes (a wrapper for the actual element, with a link to the next element)
	- knows the memory address of it's neighbors
	- don't have to be adjacent in memory

	disadvantage
	- have to search the entire list
	- when adding /removing elements it has to stitch together it's neighboring elements

	map/dictionary
	- collection of nodes
	- not aware of any other
	- each node wraps the element, and tracks an assigned key for that element
	- must return a node when a key is supplied




*/

import java.util.*; // All the classes and interfaces are part of the util package

public class CollectionsDemo {
   public static void main(String[] args) {

      // ArrayList 
      List a1 = new ArrayList();
      a1.add("Zara");
      a1.add("Mahnaz");
      a1.add("Ayan");
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1);

      // LinkedList
      List l1 = new LinkedList();
      l1.add("Zara");
      l1.add("Mahnaz");
      l1.add("Ayan");
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + l1);

      // HashSet
      Set s1 = new HashSet(); 
      s1.add("Zara");
      s1.add("Mahnaz");
      s1.add("Ayan");
      System.out.println();
      System.out.println(" Set Elements");
      System.out.print("\t" + s1);

      // HashMap
      Map m1 = new HashMap(); 
      m1.put("Zara", "8");
      m1.put("Mahnaz", "31");
      m1.put("Ayan", "12");
      m1.put("Daisy", "14");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
   }

}



/*

SQL (structured Query Language)
 - Managed by ANSI (American National Standards Institute)
 - Databases often implement the SQL standard differently, or add to it
 - RDMS (Relational dtabase management system) - Oracle Database, SCI Base, Microsoft Sequel Server, IBM DB2, MySQL


58. SQL Statements  (Query)

DDL - Data Definition Language - CREATE, ALTER, DROP (Defines database structure or Scheme)
DML - Data Manipulation Language - SELECT, INSERT, UPDATE, DELETE (manages data within tables) **CRUD**
TCL - Transaction Control Language - SAVEPOINT, ROLLBACK, COMMIT (manages how DML statements are executed)
		- A group of SQL statements executed together. Either all will be exectued or none will.

DCL - Data Control Language - GRANT, REVOKE



59. Joins - combines the result of two tables

    INNER JOIN (return only records from both tables that match a condition)
    LEFT JOIN (compares first & second table)
    RIGHT JOIN (compares second and first table)
    FULL JOIN (return all records form both tables)


60. Relational Database
	- uses tables
	- columns (properties of each record) name, age, ect
	- rows (itself is a record) Person



61. Column datatypes
	VARCHAR: text data of variable length
	INTEGER: 32-bit, signed whole numbers
	SMALLINT: 16-bit, signed whole numbers
	NUMBER(n,d): Decimal numbers with limited significant figures  (5,2) stores up to 5 whole numbers and 2 decimal places
	FLOAT: floating-point numbers
	DATE: A day/month/year record (different form a timestamp)
	TIMESTAMP: A combination of a date and timne
	NULL: row value is empty and contains no data


62. Table constraint - column attributes that restrict data
		- Primary Key: column whos values uniquely identify each row (social security number)
		- Composite Key: Two or more columns acting together as a primary key
		- Foreign Key: a column in one table that references a column in another table (Makes it relationable)
		- Unique Key: a column whose values must be unique in each row (email addresses)
		- Not null: the column must have a value in each row
		- check: the column values misyt meet some criteria (example: minimal length requirement)
*/
