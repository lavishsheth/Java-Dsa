class NestedLoops {
public static void main(String args[]){
    // 1 2 3 4 5 
    // 1 2 3 4 5
    // 1 2 3 4 5
    // 1 2 3 4 5 
    // 1 2 3 4 5

    //program begins:
    //outer for loop:
    for(int i=1;i<=5;i++){
        //inner for loop:
        for(int j=1;j<=5;j++){
            System.out.print(j+" ");
        }
        System.out.println();

    }
}    
}
