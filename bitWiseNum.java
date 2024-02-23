public class bitWiseNum {

    public static void main(String[] args) {
        int n= 4;

        if( (n ^ 1) == (n+1) ){
            System.out.println("using ^: " + n + " is even");
        }else{
            System.out.println(("using ^: " + n + " is odd"));
        }

        if((n | 1) == (n+1)){
            System.out.println("using |: " + n + " is even");
        }else{
            System.out.println("using |: " + n + " is odd");
        }

        if((n & 1) == 0){
            System.out.println("using &: " + n + " is even");
        }else{
            System.out.println("using &: " + n + " is odd");
        }
    }
    
}
