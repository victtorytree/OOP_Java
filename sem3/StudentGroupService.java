package sem3;

public class StudentGroupService extends StudentGroup {

    public StudentGroupService(String name) {
        super(name);
    }

    public void deleteStudentFromGroup(Student student, StudentGroup col) {
        for (Student person : col) {
            if(person.getSurname() == student.getSurname() &&
            person.getFieldStudy() == student.getFieldStudy() &&
            person.getYearStudy() == student.getYearStudy()) {
                col.remove(person);
            }
        }
        
    }
}
