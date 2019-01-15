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

public class MultipleItems {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        getItems();
    }
    public static void getItems()
    {
    System.out.print("Enter the number of item you want to enter: ");
    int quantity = in.nextInt();
    getItemNames(quantity);
    }
    public static void getItemNames (int quantity)
    {
        int x=1;
        String itemname="";
        while(x<=quantity)
        {
            System.out.print("Please input item #"+x+": ");
            itemname+="\n"+in.next()+"\n ";
            x++;
        }
        Output(itemname);
      
    }
    public static void Output(String itemnames)
    {
        System.out.println("You have inputted the following items: \n"+itemnames);
    }
  
}
