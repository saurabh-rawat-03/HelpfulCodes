public class rotate {
    
    public static void main(String[] args) {
        int num = 1234;
        int r=4;
        // int len = num.l
        int d=0;
        int temp=num;
        while(temp!=0){
            temp = temp /10;
            d++;
        }
        // System.out.println(d);


        for(int i=0; i< r; i++){

            int f = (num % 10) * (int) Math.pow(10, d-1);
            int l = num / 10;
1
            num = f+l;
            System.out.println(num);

        }

        
    }
}