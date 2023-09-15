import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce las horas: ");
        int horas = scanner.nextInt();
        System.out.print("Introduce los minutos: ");
        int minutos = scanner.nextInt();

        int segundosActuales = horas * 3600 + minutos * 60;
        int segundosHastaMedianoche = 24 * 3600 - segundosActuales;

        System.out.println("Segundos hasta la medianoche: " + segundosHastaMedianoche + " segundos");

        scanner.close();
    }
}
