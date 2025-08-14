import java.io.*;
public class student{
int data=90;
public static int age=40;
public int add(){
int a=50;
return a;
}
public static void main(String args[]){
student s1= new student();
s1.add();
System.out.println(s1.add());
System.out.println(s1.data);
System.out.println("by class name:" +student.age);
}
}