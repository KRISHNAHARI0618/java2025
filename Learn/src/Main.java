public class Main extends methodRide {

    static String My_Name;
    static float MY_age;

    public void setName(String n,Float p){
        this.MY_age = p;
        this.My_Name = n;

    }

    public void getName(){
        System.out.println("Employee Name is : "+ this.My_Name);
        System.out.println("Emplyees Age is  : "+ this.MY_age);

    }

    public static void main(String[] args) {

        Main onj = new Main();


        System.out.println("Hello, World!");
        Main obj = new Main();
        obj.a = 20;
        obj.b = 30;

        obj.sub();
        obj.sum();

        obj.setName("Peddireddy",25.5f);
        obj.getName();

        student obj1 = new student();
        obj1.name = "preddireddy";
        obj1.id = 24;
        obj1.printStudent();


        EnacpsulationClass objenc = new EnacpsulationClass();

        objenc.setEmpid(200);
        objenc.setEname("peddireddy");
       int number = objenc.getEmpid();
        String name = objenc.getName();

        B b = new B();
        b.subtraction();
        b.addition();

        methodRide objRide = new methodRide();
        objRide.func(10);
        objRide.func();
    }

    private int a;

    private int b;

    public void sum(){
        System.out.println(a+b);
    }

    public void sub(){
        System.out.println(a-b);
    }
}

class student{
    int id ;
    String name;

    public void printStudent(){
        System.out.println("Name : "+ name);
        System.out.println("Id : "+ id);
    }
}


class EnacpsulationClass{

    private int empid;
    private String ename;

    public void setEmpid(int Employeeid){
        this.empid = Employeeid;
    }

    public int getEmpid(){
        return empid;
    }

    public void setEname(String name){
        this.ename = name;
    }
    public String getName(){
        return ename;
    }
}

class A{
    public void addition(){
        System.out.println("Calling A Method ...");
    }
}

class B extends A {

    public void subtraction(){
        System.out.println("Calling B Method ... ");
    }
}

class methodLoad{
    int a=30;
    public void func(){
        System.out.println("Calling Method  .... ");
    }

    public void func(int a){
        System.out.println(" Calling Over Loading ... "+ a);
    }

}
class methodRide extends methodLoad{

    int a;

    public void func(int a){
//        this.a = super.a;
        System.out.println(" Calling Over Riding Method ... "+ super.a);
    }
}

/*

OOP's Concepts:
- Implement the real world problems
- inheritance , hiding , polymorphism
- Bind Together the data and functions
- So That no other functons can bind that data except that function


Class Objects Constructors and methods

Class:
- user defined blue-print
- Using Class we can create an objects
- Represents the set of properties or methods that are common to all objects of same type

Class Contains Three Components :
- Access Modifiers
- Class name : with capital letter
- Body


Objects :
- Basic Unit of a Object oriented programming that represents real life entities
- A typical java program creates a many objects which as you know interact by invoking methods

Objects has Four Main Components
- State
- Behaviour
- Identity
- Method


Method:
- Collection of statements
- returns specific result to the caller
- It can be declared with or without arguments depending on the requirements
- Can Take input values perform actions and return a result

Four Pillars of OOP's:
- Abstraction
- Inheritance
- Polymorphism
- Encapsulation

Abstraction:
- Essential details are displayed to the user
- Non-essential units are not displayed to the user
- In Java abstraction is achieved by interface and abstract classes
- we can achieve 100 % abstract using interfaces.

abstract class example:

abstract class GFG{
    abstract void add();
    abstract void mul();
    abstract void di();
}

Encapsulation:
- wrapping up of data under a single unit
- Data Hiding and encapsulation can be used inter changeable
- Encapsulation can be achieved by declaring all the variable as private and writing the public methods
- in the class to get and set the values of the variables
- Uses Setters and getters methods to access the private variables in a class

Inheritance:
- Important Pillar of OOP concepts
- one class is allowed to inherit the features of another class
- using extends keyword
- Inheritance is also "is-a" relationship

Super class:
- The class whose features are inherited is known as Inheritance

Sub Class:
- The class which inherits other class is called the subclass

Reusability:

Polymorphism
- One method with multiple parameters
- entities with the same name and multiple parameters

There are two types of polymorphism:
- Run time polymorphism --> Method overriding
    same method name and multiple parameters
- compile time polymorphism --> Method Over Loading
same method name and same parameters --> with different values


Class will not take a memory and object will take a memory

- User defined blue-print or prototype
- class is a group of variables and different data types and group or methods
- A Class in java can contain
    - Data Member
    - Method
    - Constructor
    - Nested Class
    - Interface
- Class declaration in java:
access-modifier class <class-name> {
data member
method
constructor
nested class
interface
}

Objects contain:
- state
- behaviour
- identity




 */