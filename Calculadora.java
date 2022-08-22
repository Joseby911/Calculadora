

package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite un valor");
        int num1= sc.nextInt();
        
        System.out.println("Dijite otro valor");
        int num2= sc.nextInt();
        
        int total = num1+ num2;
        System.out.println("El resultado de la suma es "+ total);
        
        int total2 = num1 - num2;
        System.out.println("El resultado de la resta es "+ total2);
        
        int total3 = num1 * num2;
        System.out.println("El resultado de la multiplicacion es "+ total3);
        
        int total4 = num1 / num2;
        System.out.println("El resultado de la division es "+ total2);
        

        
    }
}
