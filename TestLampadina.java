import java.util.Scanner;

public class TestLampadina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero massimo di click per la lampadina: ");
        int clickMassimi = scanner.nextInt();

        Lampadina lampadina = new Lampadina(clickMassimi);
        boolean esci = false;

        while (!esci) {
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Visualizza stato lampadina");
            System.out.println("2. Esegui click");
            System.out.println("3. Esci");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println(lampadina.stato());
                    break;
                case 2:
                    lampadina.click();
                    break;
                case 3:
                    esci = true;
                    System.out.println("Programma terminato.");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }

        scanner.close();
    }
}
