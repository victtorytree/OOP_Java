package sem3;

public class Student {
    protected String surname;
    protected String fieldStudy;
    protected int yearStudy;
    public Student(String firstName, String whatStudy, int year) {
        this.surname = firstName;
        this.fieldStudy = whatStudy;
        this.yearStudy = year;
    }
    public String getSurname() {
        return surname;
    }
    public String getFieldStudy() {
        return fieldStudy;
    }
    public int getYearStudy() {
        return yearStudy;
    }
    @Override
    public String toString() {
        return surname + " " + fieldStudy + " " + yearStudy;
    }
    
    
}
