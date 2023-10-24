package sem6;

import java.time.LocalDate;

public class Student extends User{

    protected Long studentId;
    protected double gradesLevel;

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }
    
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    
    @Override
    public String toString() {
        return "Student{" +
               "studentId='" + studentId +'\'' +
               ", firstName='" + super.getFirstName() + '\'' +
               ", secondName='" + super.getSecondName() + '\'' +
               ", patronymic='" + super.getPatronymic() + '\'' +
               ", dateOfBirth=" + super.getDateOfBirth() +
               '}';
    }

    // @Override
    // public int compareTo(Student o) {
    //     return this.studentId.compareTo(o.studentId);
    // }
    // убрали сравнение из класса Студента, и перенесли в StudentComparable - принцип Singular Responsibility
}
