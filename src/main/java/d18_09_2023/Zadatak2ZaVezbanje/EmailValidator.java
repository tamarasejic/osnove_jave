package d18_09_2023.Zadatak2ZaVezbanje;

public class EmailValidator extends Validator {

    public String email;

    public EmailValidator(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public ValidationResult validate() {
        ValidationResult validationResult = new ValidationResult();

        if (!this.email.contains("@")) {
            validationResult.addError("Email is invalid. Email must contain special character @.");
        }
        if (!this.email.endsWith(".com") && !this.email.endsWith(".net")) {
            validationResult.addError("Email is invalid. Email must end with .com or .net.");
        }
        return validationResult;
    }
}
