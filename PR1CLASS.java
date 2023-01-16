import java.io.*;
class Student{
 int rollno;
 String name;
 void insertdata(int r, String n) {
 rollno=r;
 name=n;
 }
 void getdata()throws Exception {
 DataInputStream R1 =new DataInputStream(System.in);
 System.out.println("Enter roll no");
 rollno=Integer.parseInt(R1.readLine());
 System.out.println("name");
 name=R1.readLine();
 }
 void displayInformation() {
 System.out.println(rollno+" "+name);
 }}
class studentmain{
 public static void main(String args[])throws Exception{
 Student s1=new Student();
 Student s2=new Student();
 s1.insertdata(1,"Sachin");
 s2.getdata();
 s1.displayInformation();
 s2.displayInformation();
 }
}
