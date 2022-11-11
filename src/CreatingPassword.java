import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

public class CreatingPassword {
    public String creatingPassword(String passComposition, int passwordLength){
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = secureRandom.nextInt(passComposition.length());
            stringBuilder.append(passComposition.charAt(randomIndex));
        }
        return String.valueOf(stringBuilder);
    }
    public String getPassword(String password){
        ArrayList<String> stringArrayList = new ArrayList<>(password.length());
        for (int i = 0; i < password.length(); i++) stringArrayList.add(i, String.valueOf(password.charAt(i)));
        Collections.shuffle(stringArrayList);
        StringBuilder s = new StringBuilder();
        password = stringArrayList.toString().replaceAll(" ", "");
        for (int i = 0; i < password.length(); i++) {
            if (i % 2 != 0) s.append(password.charAt(i));
        }
        return String.valueOf(s);
    }
}