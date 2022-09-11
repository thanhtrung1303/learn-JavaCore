package util;

public class Validate {
    static final String PHONE_REGEX ="^.{10,11}$";
    static final String EMAIL_REGEX ="^(.+)@(.+)$";
    static final String ID_REGEX = "^(KH[0-9].{6})$";
    static final String ACCOUNT_REGEX = "^[a-z0-9_-]{6,12}$";
    static final String PASSWORD_REGEX = "^[a-z0-9_-]{6,12}$";

    public static boolean validatePhoneNumber(String phoneNumber){
        if(phoneNumber.matches(PHONE_REGEX)){
            return true;
        }
        return false;
    }

    public static boolean validateEmail (String email){
        if(email.matches(EMAIL_REGEX)){
            return true;
        }
        return false;
    }
    public static boolean validateID (String id){
        if(id.matches(ID_REGEX)){
            return true;
        }
        return false;
    }

    public static boolean validateAccount(String account){
        if (account.matches(ACCOUNT_REGEX)){
            return true;
        }
        return false;
    }

    public static boolean validatePassword(String password){
        if(password.matches(PASSWORD_REGEX)){
            return true;
        }
        return false;
    }
}
