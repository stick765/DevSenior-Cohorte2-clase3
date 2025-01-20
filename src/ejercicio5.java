public class ejercicio5 {
    public static void main(String[] args) {
        var desc = """
                El videojuego en el ordenador está viviendo una nueva época de oro con un montón de juegos exclusivos. 
                Para comprarte un PC Gamer deberás fijarte principalmente en el procesador, la tarjeta gráfica, 
                la memoria RAM... pero sobre todo en los accesorios como el teclado y ratón.

Estás interesado en comprarte un nuevo PC y en la tienda de tu barrio cuesta 660€ con todos los accesorios incluidos. 
Sin embargo, el vendedor te descuenta el 10% por pronto pago ¿Cuánto tienes que pagar en total por el ordenador con todos
 los accesorios?
                """;

            var preciopc = 660;
            var descuento10porciento = 10;

            var sacardescuento = preciopc * descuento10porciento / 100;
             System.out.println("El descuento a sido de" + sacardescuento + "euros");
            
            var descuento = 66;
            var precioapagar = preciopc - descuento;
            System.out.println("El precio a pagar por la computadora es de" + precioapagar + "euros"); 

    }
}
