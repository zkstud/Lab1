package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("zakhar kolesnychenko");
        System.out.println(acc.getName());
//      acc.name = "Zakhar Kolesnychenko"; - nie zadziala, poniewaz zmienna "name" jest prywatna,
//      i nie dostepna na zewnatrz.
        System.out.printf("%s%n", Account.capitalize("zakhar kolesnychenko"));
        System.out.printf("%s%n", Account.translit("тест теста перетестований"));
        System.out.printf("%s%n", Account.translit("вашингтон"));
        System.out.printf("%s%n", Account.translit("колорадо"));
        System.out.printf("%s%n", Account.translit("варшава і токіо"));
        System.out.printf("%s%n", Account.translit("київ"));
    }
}
