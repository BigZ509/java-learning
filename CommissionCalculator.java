// package cop2805;
public class CommissionCalculator{

    public static void main(String[] args){


        //This the main loop that starts at 1,000 and go up by 1,000 is <=20,000

        for(int sales = 1000; sales <=20000; sales+= 1000){

            //Store income in a double and make it equal to the return value of the other method

            double income = computeIncome(sales);

            // create readable string printing sales and income
            
            System.out.println("Sales: $" + sales + "Income: $" + income);
        }
    }

    public static double computeIncome(double sales) {

        // this has income set to 5000 and doesnt change  you just add the commision to income

      double totalIncome = 5000;
        
        if(sales <=5000){
             totalIncome+= sales * 0.08;
        }
        else if(sales <= 10000){
              totalIncome +=sales * 0.10;
        }else {

                // total income becomes first 5k at 8% + next 5k at 10% + plus amount over 10k at 12%

            totalIncome += (5000 * 0.08) + (5000 * 0.10) + (sales - 10000)* 0.12;
            }

        return totalIncome;

    }
}