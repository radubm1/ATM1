public class Tranzactie {
    Client cl;
    double suma;
    String data;

    public Client getCl() {
        return cl;
    }

    public Tranzactie(Client cl, double suma, String data) {
        this.cl = cl;
        this.suma = suma;
        this.data = data;
    }
}
