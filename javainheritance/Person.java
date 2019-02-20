/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainheritance;

/**
 *
 * @author Gabby Lopez
 */
public class Person {
    
    private String fname;
    private String lname;
    private String gender;
    private int age;
    public String getfname()
    {
    return fname;
    }
    public void setfname(String Fname)
    {
    fname=Fname;
    }
    public String getlname()
    {
    return lname;
    }
    public void setlname(String Lname)
    {
    lname=Lname;
    }
    public String getgender()
    {
    return gender;
    }
    public void setgender(String Gender)
    {
    gender=Gender;
    }
    public int getage()
    {
    return age;
    }
    public void setage(int Age)
    {
    age=Age;
    }
    public void displayfullname()
    {
    System.out.println("Welcome,"+fname+" "+lname);
    }
}
