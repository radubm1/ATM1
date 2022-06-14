public class Main {
    public static void main(String args[]){
        Client cl = new Client("Ion",42,1234);
        cl.login();
        Tranzactie t = cl.tranzactie();
        System.out.println(t.getCl().nume);
        cl.logout();
    }

}
