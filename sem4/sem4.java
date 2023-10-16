package sem4;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class sem4 {
    public static void main(String[] args) {
        TeacherController tcontrol = new TeacherController();
        Teacher t = new Teacher("John", "Barvovich", "Atteuskad", LocalDate.of(2001, 1, 1));
        Teacher t2 = new Teacher("Alla", "Garipova", "Fedorovna", LocalDate.of(2001, 1, 1));
        Teacher t3 = new Teacher("Josef", "Franklin", "Kedyshko", LocalDate.of(2001, 1, 1));
        List<Teacher> teachers = new ArrayList<>();
        TeacherGroup group = new TeacherGroup(teachers);
        group.addTeacherToList(t);
        group.addTeacherToList(t2);
        group.addTeacherToList(t3);
        tcontrol.printTeachers(group);
    }
}
