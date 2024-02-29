import java.util.Scanner;
public class Stringcheck {
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter string");
   String s=sc.next();

   String result=Check(s);
   System.out.println("result is: "+result);
 }   

 public static String Check(String s){
    if(s.equals("lavish")){
        String k="this is correct string";
        return k;
    }
    return "this is not a matching string";
 }
}
