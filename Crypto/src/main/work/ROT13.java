package work;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13 {

    ROT13(Character cs, Character cf) {
    }

    ROT13() {
        this('a', 'm');
    }

    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder builder = new StringBuilder();

        return "";
    }

    public String encrypt(String text) {
        return text;
    }

    public String decrypt(String text) {
        return text;
    }

    public static String rotate(String s, Character c) {
        return s.substring(s.indexOf(c)) + s.substring(0,s.indexOf(c));
    }
}
