/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematica;

/**
 *
 * @author Ézio
 */
public class Calculadora {
//    private int a;
//    private int b;
//    public void getValues(int a, int b){
//        this.a = a;
//        this.b = b;
//    }
    
    
    public float soma(float a, float b){
        return a+b;
    }
    
    public float subtrai(float a, float b){
        return a-b;
    } 
    
    public float multiplica(float a, float b){
        return a*b;
    }
    public float divide(float a, float b){
        return a/b;
    }
    public boolean ePrimo(int numero){
        if(numero <= 3) return numero > 1;
        if(numero % 2 == 0 | numero % 3 == 0) return false;
        for(int i=5; i * i <= numero; i++)
           if(numero % i == 0)
               return false;
        return true;
        
    }
   
}
