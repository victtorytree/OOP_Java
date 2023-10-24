package sem6;

public class StudentComparable implements Comparable<Student>{

    private Student student;

    public StudentComparable(Student currentStudent) {
        this.student = currentStudent;
    }

    @Override
    public int compareTo(Student second) {
        return student.getStudentId().compareTo(second.getStudentId());
    }

}
