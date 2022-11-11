public class Main {
    public static void main(String[] args) {
        int passLength = 8;
        boolean isUpperCase = true;
        boolean isLowerCase = true;
        boolean isNumbers = false;
        String userSpecialShar = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        String obligatoryPassComposition;
        String passComposition;
        String password;

        PassCompositionManagement passCompositionManagement = new PassCompositionManagement();
        CheckUserChar checkUserChar = new CheckUserChar();
        CreatingPassword creatingPassword = new CreatingPassword();

        userSpecialShar = checkUserChar.checkUserChar(userSpecialShar);
        obligatoryPassComposition = passCompositionManagement.creatingObligatoryPassComposition(isUpperCase, isLowerCase, isNumbers, userSpecialShar);
        passComposition = passCompositionManagement.creatingPassComposition(isUpperCase, isLowerCase, isNumbers, userSpecialShar);
        password = creatingPassword.creatingPassword(passComposition, passLength - passCompositionManagement.getPassCompositionLength()) + obligatoryPassComposition;
        password = creatingPassword.getPassword(password);


        System.out.println(password);


    }
}