class Person { 
final int id=111; 
void message() { 
System.out.println("Welcome to java programming"); 
} 
Person() { 
System.out.println("Person class Constructor"); } 
final void putdata() { 
System.out.println("Happy new year"); } 
} 
final class Student extends Person { 
Student() { 
super();
System.out.println("Student class Constructor"); 
} 
void message() { 
System.out.println("Technologies"); } 
void display() { 
super.message(); 
message(); 
System.out.println("Student Id: "+super.id); } 
} 
class finsup { 
public static void main(String[] args) { 
Student s = new Student(); 
s.display(); 
s.putdata(); 
} }
