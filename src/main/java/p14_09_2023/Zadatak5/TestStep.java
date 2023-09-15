package p14_09_2023.Zadatak5;

public class TestStep {
    private String description;
    private String actualValue;
    private String expectedValue;
    private String errorMessage;

    public TestStep(String description, String actualValue, String expectedValue, String errorMessage) {
        this.description = description;
        this.actualValue = actualValue;
        this.expectedValue = expectedValue;
        this.errorMessage = errorMessage;
    }

    public String getDescription() {
        return description;
    }

    public String getActualValue() {
        return actualValue;
    }

    public String getExpectedValue() {
        return expectedValue;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean validate() {
       return this.actualValue.equals(this.expectedValue);
    }

    public void printInfo() {

        if (this.validate()) {
            System.out.println("| " + this.description + " |");
            System.out.println("| Passed |");
        } else {
            System.out.println("| " + this.description + " |");
            System.out.println("| Failed | " + this.errorMessage);
        }
    }

}
