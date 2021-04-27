package arreglo;

public class Arreglo {

    public static void main(String[] args) {
        int test0 [] = {0, 1, 2, 3, 4, 5};
        String test1 = "The Quick Brown Fox Jumps Over The Lazy Dog";
        int test2 [] [] = {{0, 1, 2, 3, 4}, {10, 11, 12, 13, 14}, {20, 21, 22, 23, 24}};
        
        
        sumarLista (test0);
        cuentaVocales (test1);
        cuentaCaracter (test1, 'a');
        buscarMayor (test2);
    }
    //Método sumarLista que reciba por parámetro un arreglo unidimensional de enteros y muestre por pantalla la suma y promedio de los mismos.
    public static void sumarLista (int lista []) {
        int suma = 0;
        int promedio = 0;
        for (int index = 0; index < lista.length; index++) {
            suma += lista [index];
        }
        promedio = suma / lista.length;
        
        System.out.println ("La suma es: " + promedio + ".");
        System.out.println ("El promedio es: " + suma + ".");
    }
    
    //Primer void creado. El método per se no retorna nada.
    
    //Método buscarMayor que reciba por parámetro un arreglo bidimensional e irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.
    public static int buscarMayor (int lista [][]) {
        int mayor = 0;
        for (int yIndex = 0; yIndex < lista.length; yIndex++) { //Extrapolado de otro trabajo práctico, en C++.
        
            for (int xIndex = 0; xIndex < 4; xIndex++) {
                if (lista [yIndex][xIndex] > mayor) {
                    mayor = lista [yIndex] [xIndex];
                }
            }
        }
        System.out.println ("El número más grande es: " + mayor + ".");
        return mayor;
    }
    
    //Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad de vocales que tiene la cadena.
    
    public static int cuentaVocales (String palabra) {
        int vocales = 0;
        char [] palabraQuebrada = palabra.toCharArray(); //Convertí el String a un arreglo de Char.
        for (int index = 0; index < palabraQuebrada.length; index++) {
            if (palabraQuebrada [index] == 'a' || palabraQuebrada [index] == 'e' || palabraQuebrada [index] == 'i' || palabraQuebrada [index] == 'o' || palabraQuebrada [index] == 'u') {
                vocales += 1;
            }
        }
        System.out.println ("Hay " + vocales + " vocales en el String ingresado.");
        return vocales;
    }
    
    //Método cuentaCaracter que reciba por parámetro un String y un caracter, luego retorne la cantidad de veces que se repite en la cadena el carácter recibido.
    public static int cuentaCaracter (String palabra, char charAContar) {
        int iteraciones = 0;
        char [] palabraQuebrada = palabra.toCharArray(); //Convertí el String a un arreglo de Char.
        for (int index = 0; index < palabraQuebrada.length; index++) {
            if (palabraQuebrada [index] == charAContar) {
                iteraciones += 1;
            }
        }
        System.out.println ("'" + charAContar + "' se repite un total de " + iteraciones + " veces.");
        return iteraciones;
    }
}