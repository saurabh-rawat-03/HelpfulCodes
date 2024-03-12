public class powerResc {

    public static void main(String[] args) {
        int base = 2, expo=3;
        int res = pow(base, expo);
        System.out.println(res);
    }

    static int pow(int base, int expo){

        int res=base;
        if(expo == 0){
            return 1;
        }
        return res * pow(base, expo-1);
       
    }
    
}
