/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celciusToFarin;

/**
 *
 * @author lenovo
 */
public class celciusToFarin {
    //Дано значение температуры T в градусах Цельсия. 
    //Определить значение этой же температуры в градусах Фаренгейта. 
    //Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением: 
    //TC = (TF – 32)·5/9
    
    public double Celcius( double farin) {
        return (farin - 32) * 5 / 9;
    }

}
    

