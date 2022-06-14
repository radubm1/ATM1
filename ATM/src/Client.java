public class Client {
    String nume;
    int varsta;
    long cont;
    void login(){
        System.out.println("Login successfully");
    }
    void logout(){
        System.out.println("Va multumim pentru vizita");
    }
    Tranzactie tranzactie()
    {
        Tranzactie tr = new Tranzactie(this, 500,"03.06.22");
        return tr;
    }

    public Client(String nume, int varsta, long cont) {
        this.nume = nume;
        this.varsta = varsta;
        this.cont = cont;
    }
}
