public class ejercicio2 {
    public static void main(String[] args)  {

 var descripcion = """
 En el mercado, podemos encontrar que el precio del producto Pernil Iberic D'Engreix Llen. Azuaga en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€. ¿Crees que es correcto el precio?

 En este reto tienes que hacer un programa que calcule correctamente el precio por kilo del producto.
         
         """;

 var preciopor100gramos =  5.95 ;
 var  precioporgramo = preciopor100gramos / 100;
 var precioporkilo = precioporgramo * 1000;
 
 
System.out.println(" El precio por 100 gramos es: " + preciopor100gramos +  "Euros");
System.out.println(" El precio por kilo es: " + precioporkilo +  "Euros");


    }
}
