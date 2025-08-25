//First line is alwaays class with file name//

import java.text.NumberFormat;

public class pratice1{
    public static void main(String[]args){
         //imlecit casting
         //byte can be short short can be int int can be long can be float float can be double

         //  double x = 1.1;

         // double y = x + 2; //2.0

         // this an example of explecit casting
         //  int y= (int)x + 2;

        // this takes a string and become an int
         // String x = "1";
        //Integer.parseint()

         //  int y = Integer.parseInt(x) + 2;

        //int result = Math.round(1.1F);
        // int result =(int) Math.ceil(1.1F);

         //Math.max return greater value between 2 intergers

         //  int result = (int)(Math.random() * 100) ;

         // NumberFormat percent = NumberFormat.getPercentInstance(); or

    
          String result = NumberFormat.getPercentInstance().format(0.1);
          


        System.out.println(result);
        //ystem.out.println(y);
        

    }
}