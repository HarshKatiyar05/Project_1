import java.util.Scanner ;
public class Temperatue_convertor_project {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in) ;
    boolean b = true ;
    while (b) {
        
      System.out.println("Click 1 for Covert temperature Celsius to fahrenheit  ");
      System.out.println("Click 2 for Covert temperature fahrenheit to Celsius  ");
      System.out.println("Click 3 for Covert temperature Celsius to Kelvin      ");
      System.out.println("Click 4 for Covert temperature Kelvin to  Celsius     ");
      System.out.println("Click 5 for Covert temperature fahrenheit to Kelvin   ");
      System.out.println("Click 6 for Covert temperature Kelvin to fahrenheit   ");
      System.out.println("Click 7 for Exit ") ;
      System.out.print("Enter your Choice ") ;
      
       
      int choice = sc.nextInt() ;

      switch(choice ){
       case 1:{
         System.out.print( "Enter Celsius ");
          double C = sc.nextDouble() ;
          double f = (C*9/5)+32 ;
         System.out.println("fahrenheit --> "+ " " + f+"f ") ;    
       }
       break; 

       case 2:{
         System.out.print( "Enter fahrenheit ");
          double f = sc.nextDouble() ;
          double C = (f-32)*5/9 ;
         System.out.println("Celcius --> "+ " " + C+"c ") ;    
       }
       break ;


       case 3:{
         System.out.print( "Enter Celsius ");
          double C = sc.nextDouble() ;
          double k = C+273.15 ;
         System.out.println("Kelvin--> "+ " " + k+"k ") ;    
       }
        break ;

       case 4:{
         System.out.print( "Enter Kelvin ");
          double K = sc.nextDouble() ;
          double C = K-273.15 ;
         System.out.println("Celsius --> "+ " " + C+"C ") ;    
       }
       break ;

       case 5:{
         System.out.print( "Enter Fahrenheit ");
          double F = sc.nextDouble() ;
          double K = (F-32)*5/9+273.15 ;
         System.out.println("Kelvin --> "+ " " + K+"k ") ;    
       }
       break ;

       case 6:{
         System.out.print( "Enter Kelvin ");
          double K = sc.nextDouble() ;
          double f = (K-273.15)* 9/5+32 ;
         System.out.println("Fahrenhiet --> "+ " " + f+"f ") ;    
       }
       break ;
       case 7:{
        System.out.println("Thank you for using temperature convertor ") ;
         b =false ;
       } 
       break ;
       default:{
        System.out.println("Your Invalid Choice") ;
        System.out.println("Please Select the Valic Choice ") ;
       }
       break  ;

      } 


    }
  }
}
