import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioHoraOrdinaria = 12.0;
        double salarioHoraExtra = 16.0;
        int horasOrdinarias = 40;

        System.out.print("Ingrese el número de horas trabajadas a la semana: ");
        double horasTrabajadas = scanner.nextDouble();

        double salarioSemanal;

        if (horasTrabajadas <= horasOrdinarias) {
            salarioSemanal = horasTrabajadas * salarioHoraOrdinaria;
        } else {
            double horasExtra = horasTrabajadas - horasOrdinarias;
            salarioSemanal = (horasOrdinarias * salarioHoraOrdinaria) + (horasExtra * salarioHoraExtra);
        }

        System.out.println("El salario semanal del trabajador es: " + salarioSemanal + " soles");

        scanner.close();
    }
}
