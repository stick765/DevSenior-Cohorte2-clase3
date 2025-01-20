//Crea un programa que calcule la media aritmética de tres números introducidos por el usuario.
import java.util.Scanner;

public class ejercicio10 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Ingrese el primer número: ");
       double numero1 = scanner.nextDouble();
       
       System.out.println("Ingrese el segundo número: ");
       double numero2 = scanner.nextDouble();
       
       System.out.println("Ingrese el tercer número: ");
       double numero3 = scanner.nextDouble();
       
       
       double media = (numero1 + numero2 + numero3) / 3;
       
       
       System.out.println("\nLa media aritmética de los números " + 
                         numero1 + ", " + numero2 + " y " + numero3 + 
                         " es: " + media);
       
       scanner.close();
   }
}
