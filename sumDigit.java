import java.util.*;

public class sumDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int temp = num;
        int d=0;

        while(temp != 0){
            temp = temp / 10;
            d++;
        }

        int eSum=0;
        int oSum=0;
        for(int i=1; i<=d; i++){
            if(i % 2 ==0){
                eSum = eSum + (num % 10);
                // num = num / 10;
            }
            else{
                oSum = oSum + (num % 10);
                // num = num / 10;
            }
            num = num / 10;
        }

        System.out.println("Odd sum: " + oSum);
        System.out.println("Even sum: " + eSum);

        sc.close();
    
    }
    
}
