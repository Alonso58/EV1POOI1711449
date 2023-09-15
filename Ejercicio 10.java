import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final double g = 9.81;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la altura en metros: ");
        double altura = scanner.nextDouble();

        double tiempo = Math.sqrt((2 * altura) / g);

        System.out.printf("El tiempo que tardará en caer el objeto desde una altura de %.2f metros es de %.2f segundos%n", altura, tiempo);

        scanner.close();
    }
}
