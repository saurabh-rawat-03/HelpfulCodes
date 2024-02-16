// Q find lagest of 4 number

import java.util.*;

public class greaterNum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Input num 1: ");
        int a = input.nextInt();
        System.out.print("Input num 2: ");
        int b = input.nextInt();
        System.out.print("Input num 3: ");
        int c = input.nextInt();


        if(a > b){
            if(a>c){
                System.out.println(a + " is the biggest number");
            }else{
                System.out.println(c + " is the biggest number");
            }
        }else{
            if(b>c){
                System.out.println(b + " is the biggest number");
            }else{
                System.out.println(c + " is the biggest number");
            }
        }

        input.close();

    }
    
}
