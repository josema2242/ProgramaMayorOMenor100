import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner=new Scanner(System.in);
        System.out.println("|************************|");
        System.out.println("| ¿Numero Mayor que 100? |");
        System.out.println("**************************");
        System.out.println();

        /* Se pide al usuario que ingrese el numero que va analizar */
        System.out.println("Ingresa el numero a comprobar:"); 

        int numero = scanner.nextInt(); /*Se guarda en la variable tipo int el numero introducido */

        /* En este if primera se calcula si el numero introducido es igual a 100 */
        if (numero==100) {
            System.out.println("EL numero: " + numero + ", ES IGUAL QUE 100");
        }else {  /* sino es igual a 100 */
            /*se cacula por medio de otro IF si es mayor o menor */
            if (numero > 100){
                System.out.println("EL numero: " + numero + ", ES MAYOR QUE 100");
            }else {
                System.out.println("EL numero: " + numero + ", ES MENOR QUE 100");
            }
        }    

    }
}
