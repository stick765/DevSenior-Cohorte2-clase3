public class App {
    public static void main(String[] args) throws Exception {
        // byte -> - short -> int -> long  (l)-> float (f) -> double (d) => Conversion implicita
        var edad = 15;
        var peso = 53.5;
        var edadMayoriaEdad = 18;
        var estatura = 1f;   

        System.err.println(estatura);

        estatura =  (float) 1.50;
        System.err.println(estatura);

        peso = (int) estatura;
        System.err.println(peso);

        var esMayorDeEdad =false | true;

        var letra = 'A';
        var nombre = "DevSenior";
        
        letra = '\u063b'; // 61 -> 6 * 16 + 1 =96 + 1 = 97
        peso = letra; // 41 -> 4*16 + 1 = 64 + 1 = 65
        System.out.println(letra);
        System.out.println(peso);

        // var descripcion = "Esta es la primera clase de java donde vimos variable.\ntambien conocimos el conceptoe ASCCI Y UNICODE,\nme gusta nucho la clase con Cesar";
        var descripcion = """
                Esta es la primera clase de java donde vimos variable.
                tambien conocimos el conceptoe ASCCI Y UNICODE,
                me gusta nucho la clase con Cesar
                """;
        // System.out.println(descripcion);

        //Operadores
        //Asigancion: =
        var num1 = 9;
        var num2 = 5;
        var num3 = 10;
        //Arimeticos: + - * / %
        // var suma = num1 + num2;System.out.println(suma);
        // var resta = num1 - num2;System.out.println(resta);
        // var producto = num1 * num2;System.out.println(producto);
        // var division = num1 / num2;System.out.println(division);
        // var residuo = num1 % num2; System.out.println(residuo);//Modulo 

        //Asigancion compuesta = += -= *= /= %=
        //               a = a + b <=> a + = b
        // num3 += num2; System.out.println(num3);// num3 = num 3 + num2
        // num3 -= num1;System.out.println(num3);// num3 = num 3 - num1;
        // num3 *= num1;System.out.println(num3);// num3 = num 3 * num1;
        // num3 /= num1;System.out.println(num3);// num3 = num 3 / num1;
        // num3 %= num1;System.out.println(num3);// num3 = num 3 % num1;

        //Incremento:++, --
        //             a++ <=> a = a + 1 
        //             a-- <=> a = a -1
        // num1++;System.out.println(num1);
        // num2--;System.out.println(num2);
        
        // System.out.println(num1++);
        // System.out.println(++num1);
        // System.out.println(num1--);
        // System.out.println(num1--);
        // System.out.println(num1);
        
        // //Precedencia de operadores
        // var expresion1 = 10 * 20 + 50 * 30;
        // var expresion2 = expresion1-- + 25;
        // System.out.println(expresion1 * expresion2);

        


     }
}






