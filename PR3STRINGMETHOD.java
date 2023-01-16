import java.util.*; 
public class strmethods 
{ 
public static void main(String args[]) 
{ 
String str= new String(); 
String temp= new String(); 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the value of str"); 
str=sc.next(); 
int x= str.length(); 
System.out.println("Length of the String str is " + x); 
temp=str.toUpperCase(); 
System.out.println("temp string="+temp); 
temp=temp.toLowerCase(); 
System.out.println("temp string="+temp); 
temp= str.substring(2,10); 
System.out.println("temp string="+temp); 
} 
}
