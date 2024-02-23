public class ptrnEight {

    public static void main(String[] args) {
        // int col =5;
        // int row = 9;
        // for(int i = 0; i<row; i++){
        //     for(int j =0; j<col; j++){
        //         if(i == j){
        //             System.out.print(" ");
        //         }else{
        //             if((i == 0 || i == 4 || i == 8) && (j == 0 || j == 4)){ 
        //                 System.out.print(" ");
        //             }else if(((i == 0 && j == 1 || j == 2 || j == 3) || (i == 4 && j == 1 || j == 2 || j == 3) || (i == 8 && (j == 1 || j == 4 || j == 8)))){
        //                 System.out.print("*");
        //             }
        //         }
        //     }
        //     System.out.println();
        // }


        int size = 7;
        for(int i=1; i < size * 2; i++){
            for(int j=1; j <= size; j++){
                if((i == 1 || i == (2 * size) - 1 || i == size) && (j == 1 || j == size)){
                    System.out.print(" ");
                }else if(i == 1 || i == (2 * size) - 1 || i == size || j == 1 || j == size){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    
}
