/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.newnocom;
import java.util.Scanner;
/**
 *
 * @author CL3-PC30
 */
public class Newnocom {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
       
         System.out.println("[1] = Snacks");
         System.out.println("[2] = Drinks");
        
        
        System.out.println("Enter your choice: ");
        int ch1 = input.nextInt();
        
        if (ch1==1)
        {
             System.out.println("[1] = Piatos [17 Pesos]");
             System.out.println("[2] = Nova [18 Pesos");
             System.out.println("Enter your choice: ");
             int ch2 = input.nextInt();
            
            if (ch2==1)
            {
                 System.out.println("Piatos 17 Pesos");
                   int pia, nov;
                   pia = 17;
                   nov = 18;
                   
                   System.out.println("Would you like to order drinks? [1] - Yes [2] - No");
                   int ch3 = input.nextInt();
                   
                   if (ch3==1)
                   {
                        System.out.println("Drinks");
                        System.out.println("[1] = Coke 15 Pesos");
                        System.out.println("[2] = Water 10 Pesos");
                   
                   
                        System.out.println("Enter the drinks of your choice: ");
                        int ch4 = input.nextInt();
                        int coke, water;
                        coke = 15;
                        water = 10;
                        
                        if (ch4==1)
                        {
                            System.out.println("Coke 15 Pesos");
                            int tot;
                            tot = pia + coke;
                            System.out.println("Total is " + tot );
                            System.out.println("Enter your cash");
                            int cash = input.nextInt();
                            
                            while(cash<tot)
                            {
                            System.out.println("Try again");
                            System.out.println("Enter your cash");
                            cash = input.nextInt();
                            }
                            
                            if(cash>=tot)
                            {
                                int chng;
                                chng = cash - tot;
                                System.out.println("Change is: "+chng);
                            }
                        }
                        //pia and water
                        else if (ch4==2)
                        {
                            System.out.println("Water 10 Pesos");
                            int tot;
                            tot = pia + water;
                            System.out.println("Total is " + tot );
                            System.out.println("Enter your cash");
                            int cash = input.nextInt();
                            
                            while(cash<tot)
                            {
                            System.out.println("Try again");
                            System.out.println("Enter your cash");
                            cash = input.nextInt();
                            }
                            
                            if(cash>=tot)
                            {
                                int chng;
                                chng = cash - tot;
                                System.out.println("Change is: "+chng);
                            }
                        }
                       
                   }
                   else if (ch3==2)
                   {
                     System.out.println("Piatos 17 Pesos");
                            int tot;
                            tot = pia;
                            System.out.println("Total is " + tot );
                            System.out.println("Enter your cash");
                            int cash = input.nextInt();
                            
                            while(cash<tot)
                            {
                            System.out.println("Try again");
                            System.out.println("Enter your cash");
                            cash = input.nextInt();
                            }
                            
                            if(cash>=tot)
                            {
                                int chng;
                                chng = cash - tot;
                                System.out.println("Change is: "+chng);
                            }
                   }
                   else{
                                System.out.println("invalid Input");
                                int tot;
                                tot = pia ;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                        }  

                   
     
            }
            //nova
            else if (ch2==2)
            {
                System.out.println("Nova 18 Pesos");
                   int pia, nov;
                   pia = 17;
                   nov = 18;
                   
                   System.out.println("Would you like to order drinks? [1] - Yes [2] - No");
                   int ch3 = input.nextInt();
                   
                   if (ch3==1)
                   {
                        System.out.println("Drinks");
                        System.out.println("[1] = Coke 15 Pesos");
                        System.out.println("[2] = Water 10 Pesos");
                   
                   
                        System.out.println("Enter the drinks of your choice: ");
                        int ch4 = input.nextInt();
                        int coke, water;
                        coke = 15;
                        water = 10;
                        
                        if (ch4==1)
                        {
                            System.out.println("Coke 15 Pesos");
                            int tot;
                            tot = nov + coke;
                            System.out.println("Total is " + tot );
                            System.out.println("Enter your cash");
                            int cash = input.nextInt();
                            
                            while(cash<tot)
                            {
                            System.out.println("Try again");
                            System.out.println("Enter your cash");
                            cash = input.nextInt();
                            }
                            
                            if(cash>=tot)
                            {
                                int chng;
                                chng = cash - tot;
                                System.out.println("Change is: "+chng);
                            }
                        }
                        //nova and water
                        else if (ch4==2)
                        {
                            System.out.println("Water 10 Pesos");
                            int tot;
                            tot = nov + water;
                            System.out.println("Total is " + tot );
                            System.out.println("Enter your cash");
                            int cash = input.nextInt();
                            
                            while(cash<tot)
                            {
                            System.out.println("Try again");
                            System.out.println("Enter your cash");
                            cash = input.nextInt();
                            }
                            
                            if(cash>=tot)
                            {
                                int chng;
                                chng = cash - tot;
                                System.out.println("Change is: "+chng);
                            }
                        }
                      
                   }
                   
                   else if (ch3==2)
                   {
                       System.out.println("Nova 18 Pesos");
                            int tot;
                            tot = nov;
                            System.out.println("Total is " + tot );
                            System.out.println("Enter your cash");
                            int cash = input.nextInt();
                            
                            while(cash<tot)
                            {
                            System.out.println("Try again");
                            System.out.println("Enter your cash");
                            cash = input.nextInt();
                            }
                            
                            if(cash>=tot)
                            {
                                int chng;
                                chng = cash - tot;
                                System.out.println("Change is: "+chng);
                            }
                   }
                   else{
                                System.out.println("invalid Input");
                                int tot;
                                tot = nov;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                
                                
                                }
 
            }
        }
        //drinks
        else if (ch1==2)
                {
                     System.out.println("[1] = Coke [15 Pesos]");
                     System.out.println("[2] = Water [10 Pesos");
                     System.out.println("Enter your choice: ");
                     int ch2 = input.nextInt();
            
            if (ch2==1)
            {
                   System.out.println("Coke 15 Pesos");
                   int coke, water;
                   coke = 15;
                   water = 10;
                   
                   System.out.println("Would you like to order snacks? [1] - Yes [2] - No");
                   int ch3 = input.nextInt();
                   
                   if (ch3==1)
                   {
                        System.out.println("Snack");
                        System.out.println("[1] = Piatos 17 Pesos");
                        System.out.println("[2] = Nova 18 Pesos");
                   
                   
                        System.out.println("Enter the snack of your choice: ");
                        int ch4 = input.nextInt();
                        int nov, pia;
                        nov = 18;
                        pia = 17;
                        
                        if (ch4==1)
                        {
                            System.out.println("Piatos 17 Pesos");
                            int tot;
                            tot = pia + coke;
                            System.out.println("Total is " + tot );
                            System.out.println("Enter your cash");
                            int cash = input.nextInt();
                            
                            while(cash<tot)
                            {
                            System.out.println("Try again");
                            System.out.println("Enter your cash");
                            cash = input.nextInt();
                            }
                            
                            if(cash>=tot)
                            {
                                int chng;
                                chng = cash - tot;
                                System.out.println("Change is: "+chng);
                            }
                        }
                        //pia and water
                        else if (ch4==2)
                        {
                            System.out.println("Nova 18 Pesos");
                            int tot;
                            tot = nov + water;
                            System.out.println("Total is " + tot );
                            System.out.println("Enter your cash");
                            int cash = input.nextInt();
                            
                            while(cash<tot)
                            {
                            System.out.println("Try again");
                            System.out.println("Enter your cash");
                            cash = input.nextInt();
                            }
                            
                            if(cash>=tot)
                            {
                                int chng;
                                chng = cash - tot;
                                System.out.println("Change is: "+chng);
                            }
                        }
                        
                        
                   }
                   else if (ch3==2)
                   {
                       System.out.println("Coke 15 Pesos");
                            int tot;
                            tot = coke;
                            System.out.println("Total is " + tot );
                            System.out.println("Enter your cash");
                            int cash = input.nextInt();
                            
                            while(cash<tot)
                            {
                            System.out.println("Try again");
                            System.out.println("Enter your cash");
                            cash = input.nextInt();
                            }
                            
                            if(cash>=tot)
                            {
                                int chng;
                                chng = cash - tot;
                                System.out.println("Change is: "+chng);
                            }
                   }
                   else{
                                System.out.println("Invalid input");
                                int tot;
                                tot = coke;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                        } 
                   
     
            }
            //water
            else if (ch2==2)
            {
                System.out.println("Water 10");
                   int coke, water;
                   coke = 15;
                   water = 10;
                   
                   System.out.println("Would you like to order Snack? [1] - Yes [2] - No");
                   int ch3 = input.nextInt();
                   
                   if (ch3==1)
                   {
                        System.out.println("Snack");
                        System.out.println("[1] = Piatos 17 Pesos");
                        System.out.println("[2] = Nova 18 Pesos");
                   
                   
                        System.out.println("Enter the drinks of your choice: ");
                        int ch4 = input.nextInt();
                        int pia, nov;
                        pia = 17;
                        nov = 18;
                        
                        if (ch4==2)
                        {
                            System.out.println("Piatos 17 Pesos");
                            int tot;
                            tot = pia + water;
                            System.out.println("Total is " + tot );
                            System.out.println("Enter your cash");
                            int cash = input.nextInt();
                            
                            while(cash<tot)
                            {
                            System.out.println("Try again");
                            System.out.println("Enter your cash");
                            cash = input.nextInt();
                            }
                            
                            if(cash>=tot)
                            {
                                int chng;
                                chng = cash - tot;
                                System.out.println("Change is: "+chng);
                            }
                        }
                        //nova and water
                        else if (ch4==2)
                        {
                            System.out.println("Nova 18 Pesos");
                            int tot;
                            tot = nov + water;
                            System.out.println("Total is " + tot );
                            System.out.println("Enter your cash");
                            int cash = input.nextInt();
                            
                            while(cash<tot)
                            {
                            System.out.println("Try again");
                            System.out.println("Enter your cash");
                            cash = input.nextInt();
                            }
                            
                            if(cash>=tot)
                            {
                                int chng;
                                chng = cash - tot;
                                System.out.println("Change is: "+chng);
                            }
                        }
                   }
                   else if (ch3==2)
                   {
                       System.out.println("Water 10 Pesos");
                            int tot;
                            tot = water;
                            System.out.println("Total is " + tot );
                            System.out.println("Enter your cash");
                            int cash = input.nextInt();
                            
                            while(cash<tot)
                            {
                            System.out.println("Try again");
                            System.out.println("Enter your cash");
                            cash = input.nextInt();
                            }
                            
                            if(cash>=tot)
                            {
                                int chng;
                                chng = cash - tot;
                                System.out.println("Change is: "+chng);
                            }
                   }
            }
                }
    }
}
