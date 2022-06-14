public class Main {
    public static void main(String args[]){
        Client cl = new Client("Ion",42,1234,4567,"Str Brancoveanu");
        //cl.setAdresa("Str Oltenitei");
        cl.setAdresa("Str Sperantei", 419212);
        cl.inchContract();
        cl.schContract();
        cl.rezContract();
        cl.login();
        Transfer transf = new Transfer();
        cl.transferaCash(transf);
        Tranzactie t = cl.tranzactie();
        System.out.println(t.cl.nume + "|" + t.data + "|" + t.suma + "|" + t.cl.adresa);
        cl.logout();
    }

    
}
