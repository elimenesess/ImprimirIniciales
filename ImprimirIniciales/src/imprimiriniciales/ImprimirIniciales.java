package imprimiriniciales;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Scanner Este programa imprime las iniciales del nombre introducido por el
 * usuario.
 *
 */
public class ImprimirIniciales {
    String nombre = "Elizabeth"; // nombre
    String apellido = "Meneses"; // apellido
    
    public void Iniciales() {
        // Scanner stdIn = new Scanner(System.in);
        System.out.print("Introduzca su nombre y primer apellido separados por un espacio: " + "\n");
        System.out.print(nombre + " " + apellido + "\n");
        System.out.println("Sus iniciales son: " + nombre.charAt(0) + apellido.charAt(0) + ".");       
    }

    public static void main(String[] args) {
        ImprimirIniciales Inicialess = new ImprimirIniciales();
        Inicialess.Iniciales();
    }
}