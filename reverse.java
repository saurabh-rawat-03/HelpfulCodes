import java.util.*;

public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        String rev = "";
        int temp=num;
        while(temp != 0){
            rev = rev + (temp %10);
            temp = temp /10;
    
        }
        System.out.println(rev);
        sc.close();
    }
    
}
