package sem4;

import java.time.LocalDate;

public class TeacherController {

    public Teacher createTeacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        return new Teacher(firstName, secondName, patronymic, dateOfBirth);
    }

    public void editTeacher(Teacher teacher, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        if(firstName != null) {
            teacher.setFirstName(firstName);
        }
        if(secondName != null) {
            teacher.setSecondName(secondName);
        }
        if(patronymic != null) {
            teacher.setPatronymic(patronymic);
        }
        if(dateOfBirth != null) {
            teacher.setDateOfBirth(dateOfBirth);
        }
    }

    public void showTeacher(Teacher teacher) {
        System.out.println(new TeacherView().teacherInfo(teacher));
    }

    public void printTeachers(TeacherGroup teachers) {
        for (Teacher teacher : teachers.getTeachers()) {
            System.out.println(teacher);
        }
    }
}
