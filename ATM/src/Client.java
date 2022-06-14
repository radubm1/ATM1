public class Client extends Persoana implements Contract, Actaditional{
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

    public Client(String nume, int varsta, long cont, long cnp, String adresa) {
    	super(cnp, adresa);
        this.nume = nume;
        this.varsta = varsta;
        this.cont = cont;
    }
    public void setAdresa(String adresa) {
    	this.adresa = adresa + ", cod_postal=041921";
    }
    public void setAdresa(String adresa, long cod) {
    	this.adresa = adresa + ", cod_postal=" + cod;
    }
	@Override
	public void inchContract() {
		// TODO Auto-generated method stub
		System.out.println("Incheiat, la data...");
		
	}
	@Override
	public void rezContract() {
		// TODO Auto-generated method stub
		System.out.println("Reziliat, la data...");
	}
	@Override
	public void schContract() {
		// TODO Auto-generated method stub
		System.out.println("Modificat, la data...");
	}
	public void transferaCash(Transfer t) {
		System.out.println(t.message());
	};
}
