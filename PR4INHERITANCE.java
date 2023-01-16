import java.util.*; 
class bank 
{ 
protected String name; 
protected int acc_no; 
protected String type; 
protected boolean cheque; 
protected float penalty; 
protected float min_balance; 
protected float balance; 
protected float interest; 
} 
class current_acc extends bank { 
public void read() { 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter Name,account no.,penalty,minimum balance and opening 
balance of the current account holder:"); 
name=sc.next(); 
acc_no=sc.nextInt(); 
penalty=sc.nextInt(); 
min_balance=sc.nextInt(); 
balance=sc.nextInt(); 
type="Current"; 
cheque=true; 
interest=0; 
} 
public void deposit(float x) 
{ 
balance+=x; 
} 
public void display() { 
System.out.println("Account Details:\nName:"+name+"\nAccount no:"+acc_no 
+"\nBalance:"+balance+"\nCheque book facility:"+cheque); 
} 
public void withdraw(float x) { 
balance-=x; 
} 
public void minimum() { 
if(balance<min_balance) 
balance-=penalty; 
System.out.println("Panalty imposed"); 
} } 
class savings_acc extends bank { 
public void read() { 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter Name,account no.,interest rate and opening balance of the 
savings account holder:"); 
name=sc.next(); 
acc_no=sc.nextInt(); 
penalty=0; 
min_balance=0; 
interest=sc.nextFloat(); 
balance=sc.nextInt(); 
type="Savings"; 
cheque=false; 
} 
public void deposit(float x) { 
balance+=x; 
} 
public void display() { 
System.out.println("Account Details:\nName:"+name+"\nAccount no:"+acc_no 
+"\nBalance:"+balance+"\nCheque book facility:"+cheque); 
} 
public void withdraw(float x) { 
balance-=x; 
} 
public void interestAdd() { 
balance=balance+balance*interest; 
System.out.println("Interest Added"); 
} 
} 
class account { 
public static void main(String[] args)throws Exception { 
int n,i; 
current_acc c =new current_acc(); 
c.read(); 
c.deposit(10000); 
c.withdraw(2000); 
c.display(); 
savings_acc s =new savings_acc(); 
s.read(); 
s.deposit(10000); 
s.withdraw(2000); 
s.display(); 
} 
}
