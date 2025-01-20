//Escribe un programa que solicite al usuario dos números y luego realice las operaciones de suma, 
//resta, multiplicación y división con esos números. Muestra los resultados en la consola.

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2;
        
        try {
            System.out.println("Ingrese el primer número: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, ingrese un número válido: ");
                scanner.next();
            }
            numero1 = scanner.nextDouble();
            
            System.out.println("Ingrese el segundo número: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, ingrese un número válido: ");
                scanner.next();
            }
            numero2 = scanner.nextDouble();
            
            System.out.println("\nRESULTADOS:");
            System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
            System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
            System.out.println(numero1 + " × " + numero2 + " = " + (numero1 * numero2));
            
            if (numero2 != 0) {
                System.out.println(numero1 + " ÷ " + numero2 + " = " + (numero1 / numero2));
            } else {
                System.out.println("No se puede dividir por cero");
            }
            
        } catch (Exception e) {
            System.out.println("Ocurrió un error al procesar los números");
        } finally {
            scanner.close();
        }
    }
}