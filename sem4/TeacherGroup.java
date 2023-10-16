package sem4;

import java.util.List;

public class TeacherGroup{
    private List<Teacher> teachers;

    public TeacherGroup(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public void addTeacherToList(Teacher teacher) {
        teachers.add(teacher);
    }
    public void removeTeacherFromList(Teacher teacher) {
        teachers.remove(teacher);
    }
    @Override
    public String toString() {
        return "TeacherGroup{" +
               "teachers=" + teachers +
               '}';
    }
}
