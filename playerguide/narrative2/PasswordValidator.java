package playerguide.narrative2;

class PasswordValidator {
    private String password;
    private boolean isValidPassword;
    
    PasswordValidator(String password) {
        this.password = password;
        isValidPassword = validPassword();
    }
    
    public boolean validPassword() {
        if (!correctLength() || !containsLowerCase() || !containsUpperCase() || !noForbiddenCharacters()) {
            return false;
        }
        return true;
    }
    
    private boolean correctLength() {
        return (password.length() >= 6 && password.length() <= 13);
    }
    
    private boolean containsUpperCase() {
        for (char passwordChar : password.toCharArray()) {
            if (Character.isUpperCase(passwordChar)) return true;
        }
        return false;
    }
    
    private boolean containsLowerCase() {
        for (char passwordChar : password.toCharArray()) {
            if (Character.isLowerCase(passwordChar)) return true;
        }
        return false;
    }
    
    private boolean noForbiddenCharacters() {
        for (char passwordChar : password.toCharArray()) {
            if (passwordChar == 'T' || passwordChar == '&') return false;
        }
        return true;
    }
    
    public boolean getIsValidPassword() {
        return isValidPassword;
    }
    
}