import java.util.Scanner;
class CheckPalindrome{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the number you want to check: ");
    int number=sc.nextInt();
    int copy = number;
    int result=0;

    while(copy>0){
        int reminder = copy%10;
        result=result*10+reminder;
        copy=copy/10;
    }

    if(number==result){
        System.out.println("It is an palindrome Number: "+number+"=="+result);
    }
    else{
        System.out.println("It is not palindrome Number: "+number+"=="+result);
    }
    }
}