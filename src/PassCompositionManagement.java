public class PassCompositionManagement{
    CreatingPassword creatingPassword = new CreatingPassword();
    private String passComposition = "";
    private String obligatoryPassComposition = "";
    private int passCompositionLength = 0;

    public String creatingObligatoryPassComposition(boolean isUpperCase, boolean isLowerCase, boolean isNumbers, String userSpecialChar){
        if (isUpperCase) {
            obligatoryPassComposition += creatingPassword.creatingPassword(PassCompositionData.getCharUppercase(), 1);
            passCompositionLength ++;
        }
        if (isLowerCase) {
            obligatoryPassComposition += creatingPassword.creatingPassword(PassCompositionData.getCharLowercase(), 1);
            passCompositionLength ++;
        }
        if (isNumbers) {
            obligatoryPassComposition += creatingPassword.creatingPassword(PassCompositionData.getNUMBERS(), 1);
            passCompositionLength ++;
        }
        if (!userSpecialChar.isEmpty()){
            obligatoryPassComposition += creatingPassword.creatingPassword(userSpecialChar, 1);
            passCompositionLength ++;
        }

        return obligatoryPassComposition;
    }

    public String creatingPassComposition(boolean isUpperCase, boolean isLowerCase, boolean isNumbers, String userSpecialChar){

        if (isUpperCase) passComposition += PassCompositionData.getCharUppercase();
        if (isLowerCase) passComposition += PassCompositionData.getCharLowercase();
        if (isNumbers) passComposition += PassCompositionData.getNUMBERS();
        passComposition += userSpecialChar;
        return passComposition;
    }

    public int getPassCompositionLength() {
        return passCompositionLength;
    }
}
