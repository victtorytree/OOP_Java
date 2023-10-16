package sem4;



public class StudentView implements UserView<Student> {

    @Override
    public void sendOnConsole(User student) {
        System.out.println(student);   
    }
    
}
