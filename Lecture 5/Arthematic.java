class Arthematic{
public static void main(String args[]){
    //Addition
    int a=1;
    int b=2;
    int ans=0;

    ans=a+b;

    System.out.println("Additon: "+ans);

    // subtract
    ans=a-b;
    System.out.println("sub: "+ans);

    //multiply
    ans=a*b;

    System.out.println("mul: "+ans);

    //divide
    int c=4;
    int d=2;
    int res=c/d;
    System.out.println("div: "+res);

    //reminder // modulo
    c=5;
    d=2;
    res=c%d;
    System.out.println("modulo: "+res);

    // pre increment //++a
    int e=1;
    int f=0;
    f=++e;

    System.out.println(f);
    System.out.println(e);

    // post increment //a++
    int g=1;
    int h=0;
    h=g++;

    System.out.println(h);
    System.out.println(g);


    // pre decrement //--a
    int l=2;
    int k=0;
    k=--l;

    System.out.println("value of k"+k);
    System.out.println("value of l:"+l);

    // post decrement //a--
    int y=1;
    int z=0;
    z=y--;

    System.out.println("value of z: "+z);
    System.out.println("value of y: "+y);
}
}