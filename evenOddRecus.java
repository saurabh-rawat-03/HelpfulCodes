

public class evenOddRecus {

    public static void main(String[] args){

        // System.setOut(new PrintStream("D:\\VSCODES file\\JAVA\\odEveRes.txt"));
        printode(50);
        
    }

    static void printode(int n){
        if(n == 0){
            return;
        }    
        // if((n%2) == 0){
        //     System.out.println(n + " is Even");
        // }else{
        //     System.out.println(n + " is Odd");
        // }
        // printode((n - 1));
        System.out.println(((n % 2) == 0) ? "Even" : "Odd");
    }
    
}
