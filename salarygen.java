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
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class salarygen {
    static Locale locale;

    static String salFormat(double sal){

        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        String temp = nf.format(sal);
        return temp;

    }

    static void printDate(){
        Date dt = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        String temp = df.format(dt);

        System.out.println("The current date is : " + temp);
    }

    static void input(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User Name: ");
        String name = sc.nextLine();

        System.out.print("Enter User ID: ");
        int id = sc.nextInt();
        
        System.out.print("Enter User Basic Salary: ");
        double basicSal = sc.nextFloat();

        System.out.println("Press 1 for English\nPress 2 for Hindi");
        int ch = sc.nextInt();

        if(ch == 1){
            locale = new Locale("en", "US");
        }else if(ch == 2){
            locale = new Locale("hi", "in");
        }else{
            locale = new Locale("en", "US");
        }   

        sc.close();
        
        calculate(id, name, basicSal);

    }

    static void calculate(int id, String name, double basicSal){

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

        print(id, name, basicSal, hra, ta, da, ma, pf, tax, grossSal);


    }

    static void print(int id, String name, double basicSal, double hra, double ta, double da, double ma, double pf, double tax, double grossSal){

        System.out.println("\n\n------Employee Salary Slip------");
        printDate();
        
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        
        System.out.println("Basic Salary: " + salFormat(basicSal));
        System.out.println("Increment\t\t\tDecrement");
        System.out.println("HRA = " + salFormat(hra) + "\t\t\t"+"TAX = " + salFormat(tax));
        System.out.println("TA = " + salFormat(ta) + "\t\t\t" + "PF = "+ salFormat(pf));
        System.out.println("DA = " + salFormat(da));
        System.out.println("MA = " + salFormat(ma));
        System.out.println();
        System.out.println(); 

        System.out.println("\nGross Salary = " + salFormat(grossSal));

    }

    public static void main(String[] args) {
        
        input();

    }

    // void static printData(){

    }
     
