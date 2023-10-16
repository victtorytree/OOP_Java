package sem4;

public class TeacherService {
    public boolean teacherPass(Teacher teacher) {
        if (teacher.getFirstName() == null|| teacher.getSecondName() == null || teacher.getDateOfBirth() == null) {
            return false;
        } else return true;
    }
}
