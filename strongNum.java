public class strongNum {

    public static void main(String[] args) {
        int n=145; 
        int temp = n;
        int d=0;
        while(temp != 0){
            temp = temp / 10;
            d++;
        }

        temp = n;
        int sum = 0;
        for(int i=0; i<d; i++){
            int dig = temp % 10;
            sum = sum + fact(dig);
            temp = temp / 10;
        }

        if (sum == n){
            System.out.println(n + " is a strong number");
        }else{
            System.out.println(n + " is not an strong number");
        }
    }

    static int fact(int num){

        int f = 1;
        while(num != 1){
            f = f * num;
            num--;
        }

        return f;

    }
    
}
