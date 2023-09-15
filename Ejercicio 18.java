import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese otro número para comprobar la divisibilidad: ");
        int num2 = scanner.nextInt();

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Ambos números deben ser positivos.");
        } else {
           
            System.out.println("Números enteros positivos menores a " + num1 + " que no son divisibles por " + num2 + ":");

            for (int i = 1; i < num1; i++) {
                if (i % num2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }

        scanner.close();
    }
}
