public class Interruttore {
	public Lampadina lampadina; 

    public Interruttore(Lampadina lampadina) {
        this.lampadina = lampadina;
    }

    public void aziona() {
        lampadina.click();
    }

    public String statoLampadina() {
        return lampadina.stato();
    }
}