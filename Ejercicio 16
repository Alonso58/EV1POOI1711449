import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positivos = 0;
        int negativos = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }
        
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        
        scanner.close();
    }
}
