class Pattern8{
    public static void main(String args[]){
        for(int row =1;row<=5;row++){
            for(int space=1;space<=row-1;space++){
                System.out.print(" ");
            }

            for(int col=5;col>=row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}