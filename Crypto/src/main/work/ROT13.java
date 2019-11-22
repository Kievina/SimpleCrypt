package work;

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
        int keyIdx;
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String rotatedAlpha = rotate(alpha, 'n');
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (Character.isUpperCase(text.charAt(i))) {
                    keyIdx = alpha.indexOf(Character.toLowerCase(text.charAt(i)));
                    builder.append(Character.toUpperCase(rotatedAlpha.charAt(keyIdx)));
                } else {
                    keyIdx = alpha.indexOf(text.charAt(i));
                    builder.append(rotatedAlpha.charAt(keyIdx));
                }
            } else {
                builder.append(text.charAt(i));
            }
        }
        return builder.toString();
    }


    public String decrypt(String text) {
        return encrypt(text);
    }

    public static String rotate(String s, Character c) {
        return s.substring(s.indexOf(c)) + s.substring(0, s.indexOf(c));
    }
}
