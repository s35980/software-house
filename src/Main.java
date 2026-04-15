public class Main {
    public static void main(String[] args) {
        Pracownik p1 = new Pracownik("TEST-99", "Adam", "Testowy", 1000);
        Pracownik p2 = new Pracownik("TEST-99", "Ewa", "Nowak", 2000);
        Pracownik p3 = new Pracownik("TEST-00", "Adam", "Kowalski", 1000);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Czy p1 to ta sama osoba co p2 (to samo ID)? " + p1.equals(p2));
    }
}
