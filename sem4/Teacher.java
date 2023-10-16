package sem4;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User{

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);     
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator<Teacher> {
        @Override
        public int compare(Teacher o1, Teacher o2) {
            return 0;
        }
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
