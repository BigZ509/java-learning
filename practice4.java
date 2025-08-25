import java.util.Scanner;

public class practice4{
    public static void main(String[] args){
        
        //String role = "admin";
        //switch (role){
           // case "admin":
           /// System.out.println ("You're an admin");
              //  break;
         //   case "moderator":
               // System.out.println("You're a moderator");
                   // break;
         //   default:
               // System.out.println("You're a guest");



   //            Scanner scanner = new Scanner(System.in); 
   //            System.out.println("Number: ");
   //            int number = scanner.nextInt();

   //            if(number % 5 == 0 && number % 3 == 0)
   //                 System.out.println("FizzBuzz");
    //            else if (number % 5 == 0)
   //                 System.out.print("Fizz");
   //             else if (number % 3 == 0 && number % 3 == 0)
    //                System.out.println("Buzz");

            Scanner scanner = new Scanner(System.in);
            String input = "";
            while (true) {
                System.out.print("Input: ");
                input = scanner.next().toLowerCase();
                if(input.equals("quit"))
                    break;
                System.out.println(input);
                
            }

                   
      

     }
 }
