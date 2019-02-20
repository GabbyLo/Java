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
public class Student extends Person{
    
    private String glevel;
    private String strand;
    public String getglevel()
    {
    return glevel;
    }
    public void setglevel(String Glevel)
    {
    glevel=Glevel;
    }
    public String getstrand()
    {
    return strand;
    }
    public void setstrand (String Strand)
    {
    strand = Strand;
    }
    
    
    
}
