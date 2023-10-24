package sem6;

import java.time.LocalDate;

public class Teacher extends User{  // принцип подстановки Барбары Лисков - одинак. конструкторы

    private Long teacherId;

    public Teacher() {
        super();
    }

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);     
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher {" +
               "firstName='" + this.getFirstName() + '\'' +
               ", secondName='" + this.getSecondName() + '\'' +
               ", patronymic='" + this.getPatronymic() + '\'' +
               ", dateOfBirth=" + this.getDateOfBirth() +
               '}';
    }
}
