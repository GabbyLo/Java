/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectict;

import java.util.Scanner;

/**
 *
 * @author Gabby Lopez
 */
public class JavaProjectICT {

    /**
     * @param args the command line arguments
     */
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
      System.out.println("You ordered the following items: "+getitem());
      
    
    }
    public static String getitem()
    {
       Boolean more=true;
       char response;
       String item="";
       double total=0;
       while(more){
        System.out.print("Enter your item:  ");
        item += in.nextLine();
        total+=getitemprice(item);
        System.out.print("Do you want add more items? y/n");
        response = in.nextLine().charAt(0);
        if (response!='Y' && response != 'y')
            {
                more=false;
                System.out.println("Thank you");
            }
       }
         return item;
    }
    public static Double getitemprice(String itemname)
    {
        double price;
        System.out.print("Enter the price of "+itemname+": ");
        price=in.nextDouble();
        return price;
        
    }
    public static Double gettotal(Double total)
    {
        return total;
    }
   


}
