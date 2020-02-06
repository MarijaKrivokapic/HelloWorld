package main.helloworld;

import java.util.Scanner;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello World");
        System.out.println ("Marija Krivokapic");
        
        //int age = 5;
        
        //if (age >= 18) {
            //System.out.println("Osoba je punoletna.");
   // } else {
   //         System.out.println("Osoba je maloletna.");
     //   }
        
        //System.out.print("Unesite broj godina: ");
        //Scanner input = new Scanner (System.in);
        //int userAge= input.nextInt();
        
        //System.out.println("Korisnik je uneo " + userAge);
    
        //if (userAge >= 18) {
          //  System.out.print("Osoba je punoletna.");
    //} else {
      //      System.out.print("Osoba je maloletna.");
        //}
      
    //    System.out.print("Unesite broj godina osobe: ");
      //  input = new Scanner (System.in);
       // int personAge= input.nextInt();
        
       // if (personAge <= 0 && personAge > 150){
         //    System.out.print("Invalid");}
           //  else if (personAge > 0 && personAge <= 5){
          //   System.out.print("Baby");
   // } else if (personAge <=11){
     //       System.out.print("Kid");
       // }else if (personAge <=17){
     //   System.out.print("Teen");
       // }else if (personAge >=18){
         //       System.out.print("Adult");}
    

        System.out.println("White loop 1:");
        
        int x = 5;
        while (x < 10) {
            System.out.println(x);
                    x = x + 1;
                    // x++;
        }
        
      System.out.println("While loop 2:");
      
        x = 5;
        while ( x > 0) {
            System.out.println(x);
                x = x - 1;
                // x--;
        }
        
        
      System.out.println( "DO While loop:");
      x = 20;
      do {
        System.out.println(x);
        x--;
     } while (x > 15);

        
      System.out.println( "For loop 1:");
      
      for (int i = 50; i < 60; i++) {
          System.out.println(i);
      }
      
      System.out.println( "For loop 2:");
      
      for (int t = 30; t >= 20; t--) {
          System.out.println(t);
      }
      
      for (int i = 0; i < 10; i++){
          for (int j = 0; j < 10; j++){
              System.out.println("*");
          }  
      }
      
   //1.zadatak kvadrat
   System.out.println( "KVADRAT");
      for (int i = 0; i < 10; i++){
          for (int j = 0; j < 10; j++){
              System.out.print("*");
          } 
          System.out.println();
      }
      
  //2.ZADATAK UPISATI KOORDINATE 0-9 I 0-9
   System.out.println( "KOORDINATE 1:");
      for (int i = 0; i < 10; i++){
          for (int j = 0; j < 10; j++){
              System.out.print(i + "-" + j + " ");
          } 
          System.out.println();
      }
  
 //3. ZADATAK UPIATI KOORDINATE 1-10
  System.out.println( "KOORDINATE 2:");
      for (int i = 1; i <= 10; i++){
          for (int j = 1; j <= 10; j++){
              System.out.print( "(" + i + "," + j + ")");
          } 
          System.out.println();
      }
    }
}

