import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, Ingrese un número entero positivo: ");
        long numero = sc.nextLong();
        sc.close();
        
        System.out.println("Dígitos pares:");
        long sumaDigitosPares = 0;
        
        while (numero > 0) {
            long digito = numero % 10;
            if (digito % 2 == 0) {
                System.out.print(digito + " ");
                sumaDigitosPares += digito;
            }
            numero /= 10;
        }
        
        if (sumaDigitosPares > 0) {
            System.out.println("\nLa suma de los dígitos pares es: " + sumaDigitosPares);
        } else {
            System.out.println("\nNo se encontraron dígitos pares en el número.");
        }
    }
}
