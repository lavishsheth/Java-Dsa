import java.util.Scanner;
public class Check {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the value:");    
int a= sc.nextInt();

boolean result=Check1(a);
System.out.println("ans is: "+result);

int b=10;
boolean result1= Check1(b);
System.out.println("ans is: "+result1);
}    

public static Boolean Check1(int a){
    if(a%2==0){
        return true;
    }
    return false;
}
}
