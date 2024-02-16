import java.util.*;

public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        String rev = "";
        int temp=num;
        int d=0;
        while(temp != 0){
            rev = rev + (temp %10);
            temp = temp /10;
            d++;


        }

        // for(int i=0; i<d; i++){
        //     rev = rev + (num %10);
        //     num = num/10;
        // }

        System.out.println(rev);
    }
    
}
