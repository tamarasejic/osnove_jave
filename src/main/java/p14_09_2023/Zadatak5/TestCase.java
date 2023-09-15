package p14_09_2023.Zadatak5;

import java.util.ArrayList;

public class TestCase {
    private int id;
    private String name;
    private ArrayList<TestStep> testSteps;

    public TestCase(int id, String name) {
        this.id = id;
        this.name = name;
        this.testSteps = new ArrayList<>();
    }

    public void addTestStep (TestStep testStep){
        this.testSteps.add(testStep);
    }

    private int countFailedSteps() {
        int counter = 0;
        for (int i = 0; i < this.testSteps.size(); i++) {
            if (!this.testSteps.get(i).validate()){
                counter++;
            }
        }
        return counter;
    }

    private void statusTestCase() {
        if (this.countFailedSteps() == 0) {
            System.out.println("TEST CASE PASSED");
        } else {
            System.out.println("TEST CASE FAILED");
        }
    }

    public void printInfo() {
        System.out.println(this.id + " - " + this.name);
        for (int i = 0; i < this.testSteps.size(); i++) {
            this.testSteps.get(i).printInfo();
        }
        System.out.println(this.testSteps.size() + " / " + this.countFailedSteps());
        this.statusTestCase();
    }


// getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<TestStep> getTestSteps() {
        return testSteps;
    }
}
