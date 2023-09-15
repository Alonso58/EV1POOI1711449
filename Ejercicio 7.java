import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa la nota del primer examen: ");
        double notaPrimerExamen = input.nextDouble();
        System.out.print("¿Que nota quieres sacar en el trimestre?");
        double mediaDeseada = input.nextDouble();

        double pesoPrimerExamen = 0.4;
        double pesoSegundoExamen = 0.6;

        double notaSegundoExamen = (mediaDeseada - (notaPrimerExamen * pesoPrimerExamen)) / pesoSegundoExamen;

        if (notaSegundoExamen >= 0 && notaSegundoExamen <= 10) {
            System.out.printf("Para tener un %.2f en el trimestre necesitas sacar %.2f en el segundo examen.\n", mediaDeseada, notaSegundoExamen);
        } else {
            System.out.println("No es posible obtener la nota deseada con las notas proporcionadas.");
        }

        input.close();
    }
}
