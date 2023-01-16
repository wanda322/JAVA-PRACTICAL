import java.io.*; 
class symm 
{ 
static boolean sym(int a[][]) { 
int i,j; 
boolean flag=true; 
for( i=0;i<3;i++) 
for( j=i+1;j<3;j++) 
if(a[i][j]!=a[j][i]) 
flag=false; 
return(flag); 
} 
public static void main(String args[])throws Exception { 
int i,j; 
int a[][]= new int [3][3]; 
DataInputStream obj =new DataInputStream(System.in); 
System.out.println("Enter the elements 0f array A"); 
for(i=0;i<3;i++) 
for(j=0;j<3;j++) { 
a[i][j]=Integer.parseInt(obj.readLine()); 
} 
if(sym(a)) 
System.out.println("Matrix is symmetrical in nature"); 
else 
System.out.println("Matrix is nonsymmetrical in nature"); 
} }
