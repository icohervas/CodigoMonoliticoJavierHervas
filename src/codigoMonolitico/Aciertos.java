package codigoMonolitico;
import java.util.Scanner;

/**
 * Informacion del programa
 * El programa genera un numero aleatorio y pide al usuario introducir un numero.
 * si el numero introducido es mayor, el usuario recibe un mensaje que el numero introducido
 * se ha pasado  , si es menor avisa que ha estado cerca. Cuando el numero introducido es igual 
 * al numero generado, el programa felicita al usuario y le dice en cuantos intentos ha logrado
 * averiguar el número.
 * @author FCO JAVIER HERVAS CALLE
 * @version 1.0
 * @since 22/03/2016
 */
public class Aciertos {
	
	private static int n=0;
	private static int x=0;
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * Metodo principal que ejecuta el programa
	 * @param args
	 */
    public static void main(String[] args) {
        int cont = 0;
         x = (int) (500 *Math.random());
        //System.out.print(x);
       
        do {
            pideNumero();
            compara(n, x, false);
            
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Has acertado , en: "+cont+ " intentos." );

    }
    /**
     * Este metodo estatico no recibe parametros y devuelve un entero.
     * @return el metodo pideNumero retorna el valor entero n.
     */
    public static int pideNumero(){
    	
            System.out.println("\nIntroduce el valor de n: ");
            n = sc.nextInt();          
    	
    	return n;
    }
    /**
     * Este metodo estatico de tipo booleano recibe tres parametros y devuelve un booleano.
     * compara si el numero introducido es mayor, igual o menor que el numero generado de forma
     * aleatoria por el programa.
     * @param numero tipo entero
     * @param valor  tipo entero
     * @param comp   tipo booleano
     * @return devuelve la variable booleana comp, despues de ser comparada en la sentencia if / else.
     */
    
    public static boolean compara(int numero,int valor,boolean comp){
    	
    	
    	if (numero > valor) {
            System.out.print("Te has pasado");
        } else if (numero < valor){
            System.out.print("Casi cerca ...");
        }
    	
    	if (numero == valor) {
    		
           comp = true;
            
        } else if (numero != valor){
        	 comp = false;
        }
	       return comp;
    }
    
    
}
