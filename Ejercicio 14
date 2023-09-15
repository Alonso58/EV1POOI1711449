import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día de la semana (lunes a viernes): ");
        String diaSemana = scanner.nextLine();
        System.out.print("Ingrese la hora (en formato HH:MM): ");
        String hora = scanner.nextLine();

        scanner.close();

        int[] diasSemana = {1, 2, 3, 4, 5};

        LocalDateTime ahora = LocalDateTime.now();

        DayOfWeek diaActual = ahora.getDayOfWeek();

        int minutosHastaViernes = 0;

        int diaSemanaUsuario = diasSemana[diaActual.getValue() - 1];

        if (diaSemanaUsuario < diasSemana[diasSemana.length - 1]) {
            minutosHastaViernes += (diasSemana[diasSemana.length - 1] - diaSemanaUsuario) * 24 * 60;
        }

        String[] partesHora = hora.split(":");
        int horaUsuario = Integer.parseInt(partesHora[0]);
        int minutosUsuario = Integer.parseInt(partesHora[1]);

        minutosHastaViernes += (horaUsuario * 60 + minutosUsuario);

        LocalDateTime proximoViernes = ahora.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)).with(LocalTime.of(15, 0));
        long minutosFaltantes = ChronoUnit.MINUTES.between(ahora, proximoViernes);

        System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana.");
    }
}
