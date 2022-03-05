package pl.lublin.wsei.java.cwiczenia;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        double b = 4.21;
        String s = "jakis tekst";
        String ss = "Nazywaliśmy to \"Witamina B3\"";

        System.out.printf("a = %d    b = %.2f    s = %s20s %n", a, b, s);
        System.out.println(ss);

        System.out.printf("alfa\t\tsin(alfa)\n");
        for (int i = 0; i < 370; i+=10) {
            System.out.printf("%d\t\t\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));
        }
    }
}
