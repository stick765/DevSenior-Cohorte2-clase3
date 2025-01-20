//En España, las rebajas de invierno suelen comenzar entre los días 1 y 7 de enero y finalizan a final
//de marzo. Por otro lado, las rebajas de verano empiezan durante la primera semana del mes de julio y 
//finalizan durante el mes de septiembre.

//Para aprovechar la temporada de rebajas he salido de compras. He pagado 34€ por unos pantalones que tenían un descuento 
//del 15%. ¿Qué precio tenían antes de aplicar el descuento?
                
public class ejercicio6 {
    public static void main(String[] args) {
        // Precio después del descuento
        double precioConDescuento = 34.0;
        
        // Descuento del 15% (0.15 en forma decimal)
        double descuento = 0.15;
        
        // Precio original antes del descuento
        double precioOriginal = precioConDescuento / (1 - descuento);
        
        // Mostrar el precio original
        System.out.println("El precio original de los pantalones era: " + precioOriginal + "euros");
    }
}