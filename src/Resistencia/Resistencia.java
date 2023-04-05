package Resistencia;
//Librerias usadas

import java.util.Scanner;
import java.text.DecimalFormat;

//nombre de proyecto pedido
public class Resistencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
        //definicion de  variables
        float r1 , r2, r3, rt;
        
        //Pedir valores de Resistencias
        System.out.println("Los valores de las resistencias ingresadas deben ser positivas");
        System.out.println("Ingrese resistencia 1: ");
        r1=teclado.nextInt();
        
        System.out.println("Ingrese resistencia 2: ");
        r2=teclado.nextInt();
        
        System.out.println("Ingrese resistencia 3: ");
        r3=teclado.nextInt();
        
        //formula para 3  resistencias paralelas
        rt=1/(1/r1+1/r2+1/r3);
        
        // permite dejar valor con 2 decimales
        DecimalFormat formato1 = new DecimalFormat("#.00");
        
        //muestra resultado, se grego unidad que es Ohm
        System.out.println("La resistencia total es de : "+(formato1.format(rt))+" Ohm" );
       //Creado por Rodrigo
        
        
	}

}
