import java.util.Scanner;
public class Floatcheck {
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter number");
   float s=sc.nextFloat();
 
   float result=Check(s);
   System.out.println("result is: "+result);
 }   

 public static Float Check(float s){
  if(s==(float)2.1){
    return s;
  }
  return (float)1.1;
 }
}
