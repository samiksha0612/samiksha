import java.io.*;
public class maxnumber{
public static void main(String args[]){
int arr[]={5,0,6,7,8,9,2};
int maxnum=arr[0];
for(int i=0;i<arr.length;i++){
if(arr[i]>maxnum){
maxnum=arr[i];
}
}
System.out.println("maximum number is " + maxnum);
}
}