import java.util.Scanner;

public class TestInterruttore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero massimo di click per la lampadina: ");
        int clickMassimi = scanner.nextInt();

        Lampadina lampadina = new Lampadina(clickMassimi);

        Interruttore interruttore1 = new Interruttore(lampadina);
        Interruttore interruttore2 = new Interruttore(lampadina);

        boolean esci = false;

        while (!esci) {
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Aziona interruttore 1");
            System.out.println("2. Aziona interruttore 2");
            System.out.println("3. Visualizza stato lampadina");
            System.out.println("4. Esci");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    interruttore1.aziona();
                    break;
                case 2:
                    interruttore2.aziona();
                    break;
                case 3:
                    System.out.println("Stato lampadina: " + interruttore1.statoLampadina());
                    break;
                case 4:
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
