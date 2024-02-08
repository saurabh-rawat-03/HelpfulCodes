/*
 * input id, name, basic salary
 * hra 50% of bs
 * ta 30
 * da 25
 * ma 20
 * tax sal< 5lks == 0
 *      sal>5 & < 7 = 10%
 *      sal >7 & <10 =15%
 *      sal > 10 = 20%
 * 
 */

 import java.util.Scanner;
public class salarygen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User Name: ");
        String name = sc.nextLine();

        System.out.print("Enter User ID: ");
        int id = sc.nextInt();
        
        System.out.print("Enter User Basic Salary: ");
        double basicSal = sc.nextFloat();
        

        double hra, ta, da, ma, tax=0;

        hra = (0.3 * basicSal);
        ta = basicSal * (0.3);
        da = basicSal * (0.25);
        ma = basicSal * (0.2);

        double grossSal = hra + ta + da + ma + basicSal;


        if(basicSal <= 500000){
            tax = 0;
        }else if(basicSal >500000 && basicSal <= 700000){
            tax = basicSal * (0.1);
        }else if(basicSal > 700000 && basicSal <= 1000000){
            tax = basicSal * (0.15);
        }else{
            tax = basicSal * (0.2);
        }

        grossSal = grossSal - tax;
        double pf = basicSal * (0.1);
        grossSal = grossSal - pf;
        

        System.out.println("------Employee Salary Slip------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSal);
        System.out.println("HRA = " + hra);
        System.out.println("TA = " + ta);
        System.out.println("DA = " + da);
        System.out.println("MA = " + ma);
        System.out.println("PF = "+pf);
        System.out.println("TAX = " + tax); 

        System.out.println("\n Gross Salary = " + grossSal);

    }
    
}
