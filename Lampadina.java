public class Lampadina {
    // Stati della lampadina
	public enum Stato { ACCESA, SPENTA, ROTTA }

	public Stato stato;      
	public int clickMassimi; 
	public int clickAttuali; 

    // Costruttore
    public Lampadina(int clickMassimi) {
        this.stato = Stato.SPENTA;
        this.clickMassimi = clickMassimi;
        this.clickAttuali = 0;
    }
    
    public String stato() {
        return "Stato: " + stato;
    }
    
    public void click() {
        if (stato == Stato.ROTTA) {
            System.out.println("La lampadina è rotta.");
            return;
        }

        clickAttuali++;

        if (clickAttuali > clickMassimi) {
            stato = Stato.ROTTA;
            System.out.println("La lampadina si è rotta!");
        } else {
            
            stato = (stato == Stato.ACCESA) ? Stato.SPENTA : Stato.ACCESA;
            System.out.println("Click effettuato. " + stato());
        }
    }
}
