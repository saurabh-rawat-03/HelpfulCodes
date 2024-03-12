public class armStrRecu {

    static int len(int num){

        int i=0;
        if(num == 0){
            return 0;
        }
        i++;
        return len(num / 10) + i;
    }

    static int pow(int base, int expo){

        int res=base;
        if(expo == 0){
            return 1;
        }

        return res * pow(base, expo-1);
       
    }

    static int armst(int num, int len, int sum){
        int last = num % 10;
        // num  = num / 10;
        if(num == 0){
            return 0;
        }       
        sum = sum + pow(last, len);
        num = num/10;
        armst(num, len, sum);
        
        return sum;

    }

    public static void main(String[] args) {

        int num = 153;
        int leng = len(num);
        int res = armst(num, leng, 0);
        System.out.println(res);
        System.out.print(num);
        if(num == res)
        {
            System.out.println(" is ArmStrong");
        }else{
            System.out.println(" is not Armstrong");
        }
        

        
    }


    
}
