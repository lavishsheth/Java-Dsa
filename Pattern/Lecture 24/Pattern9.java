public class Pattern9 {
    public static void main(String args[]){
    for(int row=1;row<=5;row++){
        for(int space=1;space<=5-row;space++){
            System.out.print(" ");
        }

        for(int star1=1;star1<=row;star1++){
            System.out.print("*");
        }

        for(int star2=2;star2<=row;star2++){
            System.out.print("*");
        }

        System.out.println();
    }
    }
}
