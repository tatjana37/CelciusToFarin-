/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import celciusToFarin.celciusToFarin;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author lenovo
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {  
    }
    @Test
    public void CelciusTest() {
     //создаем объект класса
     celciusToFarin obj=new celciusToFarin();
     //вызываем метод класса 
     double tul=obj.Celcius(86);
     //если ответ окажется не равный заданному, то метод //Assert.fail
     //скажет об ошибке
     if (tul!=30) Assert.fail();
     //Assert.assertTrue(tul == 30); //проверка на истинность
     //обратный метод 
     //Assert.assertFalse(tul == 25); //проверка на ложь

    		
	}
   
    }


