public class patternDigSqr {

    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i == 0 || i == 4 || j == 0 || j == 4 || (i == j) || (i) == 4-j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
