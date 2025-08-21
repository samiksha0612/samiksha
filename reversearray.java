import java.io.*;
public class reversearray{
public static void main(String args[]){
int a[]={2,1,7,8,5,0,4};
int temp;
for (int i=0;i<a.length;i++){
for (int j=i+1;j<a.length;j++){
if(a[i]<a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
System.out.println(a[i]);
}
}
}