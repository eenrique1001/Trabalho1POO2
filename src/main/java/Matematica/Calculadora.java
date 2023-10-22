/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematica;
import java.util.ArrayList;
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
    
    
    public int soma(int a, int b){
        return a+b;
    }
    
    public int subtrai(int a, int b){
        return a-b;
    } 
    
    public int multiplica(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        if(b == 0)
            throw new ArithmeticException("Divisão por zero!");
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
    
    public ArrayList<Integer> fibonacci(int n){
        int a = 0, b = 1, c, i;
        ArrayList<Integer> array = new ArrayList<>();
        array.add(a);
        if (n == 0)
            return array;
        array.add(b);
        if (n == 1)
            return array;
        for (i = 1; i < n-1; i++) {
            c = a + b;
            a = b;
            b = c;
            array.add(b);
        }
        return array;
    }
    
    public int[] multiplos (int num, int qntd){
        if (qntd < 0)
            return null;
        int[] array = new int[qntd];
        array[0] = 0;
        if (qntd == 0)
            return array;
        for (int i = 1; i < qntd; i++)
            array[i] = array[i-1] + num;
        return array;
    }
    
   
}
