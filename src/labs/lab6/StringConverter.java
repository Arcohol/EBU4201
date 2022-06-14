package labs.lab6;

public class StringConverter {
    public boolean isVowel(char x) {
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'y' ||
                x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U' || x == 'Y';
    }

    public static void main(String[] args) {
        String x = args[0];
        StringBuffer bf = new StringBuffer("Output: ");
        StringConverter sc = new StringConverter();
        for (int i = 0; i < x.length(); i++) {
            if (sc.isVowel(x.charAt(i))) {
                bf.append(Character.toLowerCase(x.charAt(i)));
            } else if (Character.isLetter(x.charAt(i))) {
                bf.append(Character.toUpperCase(x.charAt(i)));
            } else {
                bf.append("*");
            }
        }
        System.out.println(bf);
    }
}