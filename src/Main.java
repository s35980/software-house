public class Main {
    public static void main(String[] args) {
        Pracownik p1 = new Programista("E-101", "Anna", "Maj", 12000.0, "Java", 4);
        Pracownik p2 = new Tester("E-201", "Piotr", "Lis", 9800.0, true, 25);
        Pracownik p3 = new Programista("E-102", "Karol", "Wojcik", 11500.0, "Kotlin", 3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Czy p1 to ta sama osoba co p2 (to samo ID)? " + p1.equals(p2));
    }
}
