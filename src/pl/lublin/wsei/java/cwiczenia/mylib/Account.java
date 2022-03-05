package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class Account {
    private String name;
    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a", "b", "v", "g", "d", "e", "je", "zh", "z", "y", "i", "ji",
            "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "h", "c", "ch", "sh", "shh", "'", "ju", "ja"};

    public void setName(String name) {
        this.name = capitalize(name);
    }

    public String getName() {
        return this.name;
    }

    public static String capitalize(String aStr) {
        String[] tokens = StringUtils.split(aStr);
        for (int i = 0; i < tokens.length; i++) tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens, ' ');
    }

    public static String translit(String arg) {
        String s = "";
        char c = ' ';
        for (int i = 0; i < arg.length(); i++) {
            c = arg.toLowerCase().charAt(i);
            for (int j = 0; j < translitRepl.length; j++) {
                if (c == ukrAlphabet.toCharArray()[j]) s += translitRepl[j];
                else if (c == ' ') s += " ";
            }
        }
        return capitalize(s);
    }

}