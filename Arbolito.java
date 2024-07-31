package arbolito;

public class Arbolito {

    public static void main(String[] args) {
        // altura del arbol
        int altura = 10;
        
        //bucle para recorrer todas las filas (altura)
        for (int fila=0; fila<altura; fila++){
            //bucle para los espacios
            for (int espacio=0; espacio<(altura-fila-1);espacio++){
                System.out.print(" ");
            }
            //bucle para los asteriscos
            for (int asterisco = 0; asterisco<(fila*2)+1; asterisco++){
                System.out.print("*");
            }
            System.out.println("");
        }
        // tronco del arbol
        int largoTronco = 3; //dibuja el largo del tronco
        for (int base=0; base<largoTronco; base++){
        
            // espacios en blanco
            for (int espacio=0;espacio<(altura-2);espacio++){
                System.out.print(" ");
            }
        }
        // barras del tronco
        for (int tronco=0; tronco<3; tronco++){
            System.out.print("|");
        }
        System.out.println("");
    } 
}