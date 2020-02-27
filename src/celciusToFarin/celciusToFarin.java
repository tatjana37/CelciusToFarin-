/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celciusToFarin;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */


public class celciusToFarin 
{
    //Дано значение температуры T в градусах Цельсия. 
    //Определить значение этой же температуры в градусах Фаренгейта. 
    //Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением: 
    //TC = (TF – 32)·5/9
    public static void main(String arg[])	
	{
	    double a,c;
             	    Scanner sc=new Scanner(System.in);	   	 
	    System.out.println("Введите температуру в  Fahrenheit ");
                   a=sc.nextDouble(); 
	    System.out.println(" температура в  Celsius = "+celcius(a));		  	  	     
	} 
	static double celcius(double f)
	{	
	return  (f-32)*5/9;
        }

    public double Celcius(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

