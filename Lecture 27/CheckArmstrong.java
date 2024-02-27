import java.util.Scanner;

public class CheckArmstrong {
public static void main(String args[]){
Scanner sc= new Scanner(System.in);

System.out.println("enter your number to check it is an armstrong or not: ");
int number = sc.nextInt();
int copy=number;
int result=0;

while(copy>0){
    int reminder=copy%10;
    result=result+reminder*reminder*reminder;
    copy=copy/10;
}

if(number==result){
    System.out.println("It is an armstrong number: "+number+"="+result);
}
else{
    System.out.println("It is not armstrong number: "+number+"="+result);
}
}    
}
