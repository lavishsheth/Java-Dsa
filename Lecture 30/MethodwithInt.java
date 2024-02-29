import java.util.Scanner;
public class MethodwithInt {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of var1: ");
    int var1=sc.nextInt();
    System.out.println("Enter value of var2: ");
    int var2=sc.nextInt();

    int result=Add(var1,var2);

    System.out.println("ans is: "+result);

    int result2=Add(var1,var2);

    System.out.println("ans is: "+result2);

    int result3=Add(var1,var2);

    System.out.println("ans is: "+result3);
    }

    public static int Add(int a,int b){
     int result=a+b;
     return result;
    }
}
