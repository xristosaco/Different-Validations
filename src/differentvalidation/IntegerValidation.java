/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package differentvalidation;

import java.util.Scanner;

/**
 *
 * @author xristos
 */
public class IntegerValidation {
    Scanner io= new Scanner(System.in);
   
    
    public int validationInt(int num1,int num2){
         boolean successFull;
         
         do{
             
       System.out.println("Enter first number");
       if(io.hasNextInt()){
        num1=io.nextInt();
        
        successFull=true;
      
       } else {
           System.out.println("That is not integer number. Try again");
           successFull = false;
           io.next();
       }
         }while (!(successFull));
       
       do{
             
       System.out.println("Enter second number");
       if(io.hasNextInt()){
        num1=io.nextInt();
        
        successFull=true;
      
       } else {
           System.out.println("That is not integer number. Try again");
           successFull = false;
           io.next();
       }
       }while (!(successFull));
           io.close();  
          int sum=num1+num2;
           System.out.println("Sum is :"+sum);
        return 0;
       
       }
}
       
         

       
       

   
   
    

