//Crea un programa que calcule el área y el perímetro de un rectángulo. Solicita al usuario la longitud y 
//el ancho del rectángulo.import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la longitud del rectángulo: ");
        double longitud = scanner.nextDouble();
        
        System.out.println("Ingrese el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();
        
        double area = longitud * ancho;
        double perimetro = 2 * (longitud + ancho);
        
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        
        scanner.close();
    }
}