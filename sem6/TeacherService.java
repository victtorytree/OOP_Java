package sem6;

public class TeacherService {  //принцип Dependency inversion - не расширяли класс Teacher, а вынесли в отдельный, которым управляем через контроллер
    
    public boolean teacherPass(Teacher teacher) {
        if (teacher.getFirstName() == null|| teacher.getSecondName() == null || teacher.getDateOfBirth() == null) {
            return false;
        } else return true;
    }
}
