import java.util.Scanner;

public class rotate {
    
    public static void main(String[] args) {
        int num = 12345;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rotation n: ");
        int r= sc.nextInt();
        int d=0;
        int temp=num;
        while(temp!=0){
            temp = temp /10;
            d++;
        }
        if(r < 0){

            while(r < 0){

                r = r + d;

            }
            System.out.println("Repeating at: " + r);
        }

        
        if(r == 0){
            System.out.println("At Rotation 0: " +num);
            
        }else{
            for(int i=0; i< r; i++){

                System.out.println("Rotation no.: " + (i + 1));
                int f = (num % 10) * (int) Math.pow(10, d-1);
                int l = num / 10;

                num = f+l;
                System.out.println(num);
                if(i>=d){
                    System.out.println("Repeating at: " + ((i % d)+1));
                }
            }
        }

        sc.close();
        
    }
}
