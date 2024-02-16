public class armStr {

    public static void main(String[] args) {
        int n=1634; 
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
            sum = sum + (int) Math.pow(dig, d);
            temp = temp / 10;
        }

        if (sum == n){
            System.out.println(n + " is a armstrong number");
        }else{
            System.out.println(n + " is not an armstrong number");
        }
    }
    
}
