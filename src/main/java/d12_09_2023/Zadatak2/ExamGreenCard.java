package d12_09_2023.Zadatak2;

public class ExamGreenCard {
    private String studentFullName;
    public String indexNo;
    public String subject;
    private String professorFullName;
    private int grade;

    public ExamGreenCard (String studentFullName, String indexNo, String subject, int grade) {
        this.studentFullName = studentFullName;
        this.indexNo = indexNo;
        this.subject = subject;
        this.grade = grade;
    }

    public ExamGreenCard (String studentFullName, String indexNo, String subject, int grade, String professorFullName) {
        this.studentFullName = studentFullName;
        this.indexNo = indexNo;
        this.subject = subject;
        this.professorFullName = professorFullName;
        this.grade = grade;
    }

    public boolean havePassed () {
       return this.grade > 5 && this.grade <= 10;
    }

    public void printInfo() {
        System.out.print(this.subject + " - " + this.grade + " - ");

        if (this.havePassed()) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        System.out.println("Student " + this.studentFullName + ", " + this.indexNo);

        if (this.professorFullName != null) {
            System.out.println("Professor: " + this.professorFullName);
        }
    }

//    getter & setter

    public String getStudentFullName() {
        return this.studentFullName;
    }
    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public String getIndexNo() {
        return this.indexNo;
    }
    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
    }

    public String getSubject() {
        return this.subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getProfessorFullName() {
        return this.professorFullName;
    }
    public void setProfessorFullName(String professorFullName) {
        this.professorFullName = professorFullName;
    }

    public int getGrade() {
        return this.grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
