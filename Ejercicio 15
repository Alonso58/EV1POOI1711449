import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int combinacion = 1234;
        
        Scanner scanner = new Scanner(System.in);
        
        int intentos = 4;
        
        while (intentos > 0) {
            System.out.print("Introduce la combinación de 4 cifras: ");
            int intento = scanner.nextInt();
            
            if (intento == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break; 
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
                intentos--;
                System.out.println("Te quedan " + intentos + " intentos.");
            }
        }
        
        scanner.close();
        
        if (intentos == 0) {
            System.out.println("Se agotaron los intentos. La caja fuerte permanece cerrada.");
        }
    }
}
