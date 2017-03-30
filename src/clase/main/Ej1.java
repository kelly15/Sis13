/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase.main;
import java.util.Scanner;


public class Ej1 {
    public void mostrar(){
     int num1 = 0, num2 =0;
        Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese el numero 1: ");
      num1 = sc.nextInt();
      System.out.println("Ingrese el numero 2:");
      num2 = sc.nextInt();
      
      System.out.println("El resultado es: " + String.valueOf(procesar(num1,num2)));
    }
    
    public int procesar(int num1,int num2){
     int resultado = 0;
     if(num1 == num2){
     resultado = num1 + num2;
     }else{
     resultado = num1 * num2;
     }
     return resultado;
        
    }
}
