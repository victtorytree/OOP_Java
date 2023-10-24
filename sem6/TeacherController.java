package sem6;

import java.time.LocalDate;

public class TeacherController implements Editable, Savable, View, Validated { // разные интерфейсы под рвзные нужды - Interface Segregation principle

    protected Teacher teacher;

    @Override
    public void ToChange(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacher.setFirstName(firstName);
        teacher.setSecondName(secondName);
        teacher.setPatronymic(patronymic);
        teacher.setDateOfBirth(dateOfBirth);
    }

    @Override
    public void createTeacher() {
        this.teacher = new Teacher();
    }

    @Override
    public void printInfo() {
        System.out.println("Teacher{" +
                "firstName='" + teacher.getFirstName() + '\'' +
                ", secondName='" + teacher.getSecondName() + '\'' +
                ", patronymic='" + teacher.getPatronymic() + '\'' +
                ", dateOfBirth=" + teacher.getDateOfBirth() +
                '}');
    }

    @Override
    public boolean isValid() {
        return new TeacherService().teacherPass(teacher);
    }
}
