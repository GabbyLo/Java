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
public class MultipleInput2 {
    
    static Scanner in = new Scanner(System.in);
    public static void main (String[] args)
    {
        itemnames();
    }
    public static int getitem()
    {
    System.out.print ("Input the number of items: ");
    int numberofitems=in.nextInt();
    return numberofitems;
    }
    public static void itemnames()
    {
    int numberofitems = getitem();
    int x = 1;
    String nameofitems="";
    while (x<=numberofitems)
        {
        System.out.print("Enter the name of item #"+x+": ");
        nameofitems+="\n"+in.next();
        x++;
        }
    Output(nameofitems);
    }
    public static void Output(String y)
    {
    System.out.println("These are the items: "+y);
    }
            
    
}
