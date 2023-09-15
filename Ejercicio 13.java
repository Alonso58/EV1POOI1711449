import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero (positivo o negativo) de hasta 5 dígitos: ");
        int numero = scanner.nextInt();
        
        numero = Math.abs(numero);
        
        String numeroStr = Integer.toString(numero);
        
        int longitud = numeroStr.length();
        
        System.out.println("El número " + numero + " tiene " + longitud + " dígitos.");
        
        scanner.close();
    }
}
