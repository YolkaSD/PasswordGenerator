public class PassCompositionData {
    private static final String CHAR_LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPERCASE = CHAR_LOWERCASE.toUpperCase();
    private static final String NUMBERS = "0123456789";
    private static final String CHAR_SPECIAL = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    public static String getCharLowercase() {
        return CHAR_LOWERCASE;
    }

    public static String getCharUppercase() {
        return CHAR_UPPERCASE;
    }

    public static String getNUMBERS() {
        return NUMBERS;
    }

    public static String getCharSpecial() {
        return CHAR_SPECIAL;
    }
}
