//first you create the the folder named forest put the tiger file into thaat folder
Tiger.java 
package forest; 
import java.util.*; 
public class Tiger 
{ 
public void getDetails(String nickName, int weight) 
{ 
System.out.println("Tiger nick name is " + nickName); 
System.out.println("Tiger weight is " + weight); 
} 
} 
//animal file take ouside the folder and run animal.java
Animal.java 
import forest.Tiger; 
public class Animal 
{ 
public static void main(String args[]) 
{ 
Tiger t1 = new Tiger (); 
t1.getDetails("Everest", 50); 
}