import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura de la letra L: ");
        int altura = sc.nextInt();
        
        if (altura < 2) {
            System.out.println("La altura debe ser al menos 2 para que la letra sea visible.");
        } else {
            int longitudPaloHorizontal = altura / 2 + 1;

            for (int i = 1; i <= altura; i++) {
                if (i < altura) {
                    System.out.println("*");
                } else {
                    for (int j = 1; j <= longitudPaloHorizontal; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
