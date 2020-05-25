package konrad.jezierski;

public class Main {

    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        Kalkulator kalkulatorPodstawowy = new Kalkulator();
        KalkulatorStatystyczny kalkulatorStatystyczny = new KalkulatorStatystyczny();
        System.out.println(kalkulatorPodstawowy.dodaj(a, b));
        System.out.println(kalkulatorPodstawowy.odejmij(a, b));
        System.out.println();
        System.out.println(kalkulatorStatystyczny.dodaj(a, b));
        System.out.println(kalkulatorStatystyczny.odejmij(a, b));
        System.out.println(kalkulatorStatystyczny.sinus(c));

    }
}
