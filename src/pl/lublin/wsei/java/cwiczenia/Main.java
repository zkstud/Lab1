package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\t***Program do wypisania postaci dwojkowej i szesnastkowej***\t");
        int num;
        String bin, hex = "";
        do {
            System.out.print("\nPodaj liczbe: ");
            num = in.nextInt();
            if (num == 0) break;

            bin = Integer.toBinaryString(num);
            hex = Integer.toHexString(num);

            System.out.printf("DEC = %d\t BIN = %s\t HEX = %s", num, bin, hex);
            System.out.printf("\nDEC = %d\t BIN = %s\t HEX = %s", num,
                    leftPad(bin, '0', 4), leftPad(hex.toUpperCase(), '0', 4));
        } while (true);
    }
    public static String leftPad(String aText, char aChar, int aWidth) { //bez static blad kompilacji;
        // private - nic sie nie stanie, ale metoda
        // bedzie dostepna tylko w danej klasie
        String res = aText;
        for (int i = 0; i < aWidth; i++) res = aChar + res;
        return res;
    }
}
