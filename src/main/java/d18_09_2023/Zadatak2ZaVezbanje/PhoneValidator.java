package d18_09_2023.Zadatak2ZaVezbanje;

public class PhoneValidator extends Validator {
    private String phoneNo;

    public PhoneValidator(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public ValidationResult validate() {

        ValidationResult validationResult = new ValidationResult();

        if (!this.phoneNo.startsWith("+")) {
            validationResult.addError("Phone number must start with +");
        }

        boolean hasSpaces = false;
        int i = 0;
        while (!hasSpaces && i < this.phoneNo.length()) {
            if (this.phoneNo.contains(" ")) {
                hasSpaces = true;
            }
            i++;
        }
        if (hasSpaces) {
            validationResult.addError("Phone number cannot contain spaces");
        }

        int digits = 0;
        for (int j = 0; j < this.phoneNo.length(); j++) {
            if (Character.isDigit(phoneNo.charAt(j))) {
                digits++;
            }
        }

        if (digits != this.phoneNo.length()) {
            validationResult.addError("Phone number can only contain numbers");
        }

        return validationResult;
    }

}
