public class Main {
    public static void main(String args[]){
        Client cl = new Client("Ion",42,1234,4567,"Str Brancoveanu");
        cl.login();
        Tranzactie t = cl.tranzactie();
        System.out.println(t.cl.nume + "|" + t.data + "|" + t.suma);
        cl.logout();
    }

    
}
