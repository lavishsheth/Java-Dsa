import java.util.Scanner;
class Dowhileloop{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter your value: ");
    int n= sc.nextInt();

    do{
        System.out.println(n);
        n--;
        if(n==0){
            n=11;
        }
    }while(n<10);
    }
}