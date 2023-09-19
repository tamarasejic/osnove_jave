package d18_09_2023.Zadatak2ZaVezbanje;

public class PasswordValidator extends Validator {
    private String password;

    public PasswordValidator(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public ValidationResult validate() {

        ValidationResult validationResult = new ValidationResult();

        if (!this.password.contains("@")
                && !this.password.contains("#")
                && !this.password.contains("/")
                && !this.password.contains("*")) {
            validationResult.addError("Password must contain at least one special character @, #, / or *");
        }

        if (this.password.length() < 8) {
            validationResult.addError("Password must be minimum 8 characters");
        }

        boolean hasUpperCaseChar = false;
        int i = 0;
        while (!hasUpperCaseChar && i < this.password.length()){
            if (Character.isUpperCase(password.charAt(i))) {
                hasUpperCaseChar = true;
            }
            i++;
        }
        if (!hasUpperCaseChar) {
            validationResult.addError("Password must contain at least one uppercase letter");
        }

        boolean hasLowerCaseChar = false;
        int j = 0;
        while (!hasLowerCaseChar && j < this.password.length()){
            if (Character.isLowerCase(password.charAt(j))) {
                hasLowerCaseChar = true;
            }
            j++;
        }
        if (!hasLowerCaseChar) {
            validationResult.addError("Password must contain at least one lowercase letter");
        }

        boolean hasDigit = false;
        int k = 0;
        while (!hasDigit && k < this.password.length()){
            if (Character.isDigit(password.charAt(k))) {
                hasDigit = true;
            }
            k++;
        }
        if (!hasDigit) {
            validationResult.addError("Password must contain at least one digit");
        }

        return validationResult;
    }

}
