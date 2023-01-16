import java.util.*; 
class fib extends Thread 
{ 
int a=0,b=1,c=0; 
public void run() 
{ 
System.out.println("fibonnacci series is"); 
System.out.println(a+" "+b); 
while((a+b)<50) 
{ 
c=a+b; 
System.out.println(c); 
try 
{ 
Thread.sleep(100); 
} 
catch(Exception e) 
{ 
} 
a=b; 
b=c; 
} } } 
class primeno extends Thread { 
public void run() { 
int i,n=2; 
while(n<=50) { 
i=2; 
while(n%i!=0) { 
i++; 
} 
if(n==i) { 
System.out.println("Prime no:"+i); 
} 
n++; 
try 
{ 
Thread.sleep(100); 
} 
catch(Exception e) 
{ 
} 
} 
} 
} 
class threadprogram 
{ 
public static void main(String[] args)throws Exception 
{ 
int n,i; 
fib f =new fib(); 
Thread t1=new Thread(f); 
primeno p =new primeno(); 
Thread t2=new Thread(p); 
t1.start(); 
t2.start(); 
} 
}
