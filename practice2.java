import java.text.NumberFormat;
import java.util.Scanner;

public class practice2 {
    public static void main(String[]args){
        
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("name: ");
        //String name = scanner.nextLine();
        //System.out.println("You are " +  name);

        // This creates a constant that doesnt change

        final byte Month_In_Year = 12;
        final byte PERCENT = 100;

        //function to get input

        Scanner scanner = new Scanner(System.in);

        //get the input store it in principal which is a interger


        System.out.print("Principal ");
        int Principal = Scanner.nextInt();

        // get the annual interst rate pass it on to a float then divide to get the monthly

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / Month_In_Year ;

        /*This function ask for period which is amount of years store it into a byte
        /*  then store the amount of payments in a int */


        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayment = years * Month_In_Year;

        Double mortgage = Principal
                        *(monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment ) - 1);
        

        
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format();
        
        System.out.println("Mortage: " + mortgageFormatted);









    }
}