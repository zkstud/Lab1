package pl.lublin.wsei.java.cwiczenia;

public class Main {
    public static void main(String[] args) {
        int ii = 0;
        System.out.printf("arg\t\tlog2(arg)\tsum(arg)");
        for (int i = 0; i < 20; i++) {
            System.out.printf("%d\t\t%.2f\t\t%d\t\n", i, Math.log(i) / Math.log(2), ii+=i);
        }
    }
}
