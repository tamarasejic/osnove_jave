package d14_09_2023.Zadatak1;

import java.util.ArrayList;

public class Student {
    private String indexNo;
    private String fullName;
    private String studiesType;
    private ArrayList<Exam> exams;


    public Student(String indexNo, String fullName, String studiesType) {
        this.indexNo = indexNo;
        this.fullName = fullName;
        this.studiesType = studiesType;
        this.exams = new ArrayList<>();
    }

    public void addExam (Exam exam) {
        this.exams.add(exam);
    }

    public double avgGrade() {
        int sum = 0;
        for (Exam exam : this.exams) {
            sum += exam.getGrade();
        }
        return sum * 1.0 / this.exams.size();
    }

    public void printInfo() {
        System.out.println(this.indexNo + " - " + this.fullName + " - " + this.studiesType);
        if (!this.exams.isEmpty()) {
            for (Exam exam : this.exams) {
                exam.printInfo();
            }
            System.out.println("Average grade: " + this.avgGrade());
        } else {
            System.out.println("No exams added. Add exams.");
        }
    }



    //    getters & setters
    public ArrayList<Exam> getExams() {
        return exams;
    }

    public String getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStudiesType() {
        return studiesType;
    }

    public void setStudiesType(String studiesType) {
        this.studiesType = studiesType;
    }
}
