/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase.main;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ej2 {
    
    public void mostrar(){
        Scanner sc = new Scanner(System.in);
        String base = "";
        String altura= "";
        BigDecimal resultado = new BigDecimal(BigInteger.ZERO);
        System.out.println("Ingrese la base:");
        base = sc.nextLine();
         System.out.println("Ingrese la altura:");
        altura = sc.nextLine();
        if(validarNumero(base) && validarNumero(altura)){
            resultado = new BigDecimal(base).multiply(new BigDecimal(altura));
            System.out.println("El resultado es: " + resultado.toString());
        }else{
        System.out.println("No se puede evaluar datos que no sean numeros");
        }
    }
    
    public boolean validarNumero(String num){
        boolean bandera = true;
      if(!num.equals("")){
       for(int i=0;i<num.length();i++){
         if(!Character.isDigit(num.charAt(i))){
             bandera = false;
         }
        }
      }else{
      bandera = false;
      }  
        
        return bandera;
    }
}
