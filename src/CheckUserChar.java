public class CheckUserChar {
    public String checkUserChar(String userSpecialChar){
        StringBuilder newCheckUserChar = new StringBuilder();
        for (int i = 0; i < PassCompositionData.getCharSpecial().length(); i++) {
            for (int j = 0; j < userSpecialChar.length(); j++) {
                if (userSpecialChar.charAt(j) == PassCompositionData.getCharSpecial().charAt(i)) newCheckUserChar.append(userSpecialChar.charAt(j));
            }
        }
        return newCheckUserChar.toString();
    }
}
