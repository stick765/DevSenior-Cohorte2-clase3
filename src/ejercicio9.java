//Escribe un programa que convierta una temperatura dada en grados Celsius a grados Fahrenheit y Kelvin. 
//Usa las siguientes fórmulas:

//Fahrenheit = Celsius * 9/5 + 32
//Kelvin = Celsius + 273.15

import java.util.Scanner;

public class ejercicio9 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Ingrese la temperatura en grados Celsius: ");
       double celsius = scanner.nextDouble();
       
      
       double fahrenheit = celsius * 9/5 + 32;
       double kelvin = celsius + 273.15;
       
      
       System.out.println("\nResultados de la conversión:");
       System.out.println(celsius + " grados Celsius equivalen a:");
       System.out.println(fahrenheit + " grados Fahrenheit");
       System.out.println(kelvin + " grados Kelvin");
       
       scanner.close();
   }
}