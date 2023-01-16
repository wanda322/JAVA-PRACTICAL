import java.io.*; 
class multpleexcep { 
public static void main(String args[]) throws IOException { 
int a,b,res; 
DataInputStream ds=new DataInputStream(System.in); 
System.out.println("Enter the value of a and b");
try 
{ 
a=Integer.parseInt(ds.readLine()); 
b=Integer.parseInt(ds.readLine()); 
res=a/b; 
System.out.println("result is "+res); 
} 
catch(ArithmeticException ae) 
{ 
System.out.println("divide by zero error"); 
} 
catch(NumberFormatException nfe) 
{ 
System.out.println("Invalid no error"); 
} 
finally 
{ 
System.out.println("This is finally block"); 
} 
} 
}
