package work;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13 {
    private Integer offset;

    ROT13(Character cs, Character cf) {
        offset = cf - cs;
    }

    ROT13() {
        this('a', 'n');
        offset = 0;
    }

    public String crypt(String text) throws UnsupportedOperationException {

        return text;
    }

    public String encrypt(String text) {
        StringBuilder builder = new StringBuilder();
        String alpha = "abcdefghijklmnopqrstuvw";
        String rotatedAlpha = rotate(alpha, 'n');
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (Character.isUpperCase(text.charAt(i)))
                    builder.append(Character.toUpperCase(rotatedAlpha.charAt(i)));
                else
                    builder.append(rotatedAlpha.charAt(i));
            } else {
                builder.append(text.charAt(i));
            }
        }
        return builder.toString();
//        StringBuilder builder = new StringBuilder();
//        for (char c : text.toCharArray()) {
//            if (Character.isLetter(c)) {
//                if (Character.isUpperCase(c)) {
//                    c += offset;
//                    if (c > 'Z') {
//                        c -= 26;
//                        builder.append(c);
//                    }
//                } else {
//                    c += offset;
//                    if (c > 'z') {
//                        c -= 26;
//                        builder.append(c);
//                    }
//                }
//            } else {
//                builder.append(c);
//            }
//        }
//        return builder.toString();
    }


    public String decrypt(String text) {
        Integer hold = offset;
        offset = 26 - offset;
        String result = encrypt(text);
        offset = hold;
        return result;
    }

    public static String rotate(String s, Character c) {
        return s.substring(s.indexOf(c)) + s.substring(0, s.indexOf(c));
    }
}
