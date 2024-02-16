import java.util.*;

public class primeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int f=0;
        int i=1;
        while(i <= (num)){
            if((num % i) == 0){
                f++;
            }
            i++;
        }

        if(f <=2 ){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
        sc.close();
    }    
}
