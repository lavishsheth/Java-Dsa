public class MethodwithVoid {
public static void main(String args[]){
    int a=5;
    int b=5;

    Add(a,b);
    Add(a,b);
    Add(a,b);

    Add(a,b);
    Add(a,b);
    Add(a,b);
    Add(a,b);
    Add(a,b);
}    

public static void Add(int a,int b){
    int result=a+b;
    System.out.println("ans: "+result);
}
}
