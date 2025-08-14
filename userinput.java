import java.io.*;
import java.util.Scanner;
public class userinput{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("Enter a name");
String name=obj.next();
System.out.println("name is:" +name);
}
}