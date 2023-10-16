package sem4;

public class TeacherView {
    public String teacherInfo(Teacher teacher) {
        return "Teacher{" +
               "firstName='" + teacher.getFirstName() + '\'' +
               ", secondName='" + teacher.getSecondName() + '\'' +
               ", patronymic='" + teacher.getPatronymic() + '\'' +
               ", dateOfBirth=" + teacher.getDateOfBirth() +
               '}';
    }
}
