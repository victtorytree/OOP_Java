package sem3;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentGroup implements Iterable<Student> {
    private String groupName;
    private ArrayList<Student> students;

    public StudentGroup(String name) {
        this.groupName = name;
        this.students = new ArrayList<Student>();
    }
  
    public void addToGroup(Student student) {
        students.add(student);
    }
    public ArrayList<Student> getGroup() {
        return students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator();
    }


    private class StudentIterator implements Iterator<Student> {
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < students.size();
        }

        @Override
        public Student next() {
            if(hasNext()) {
                return students.get(currentIndex++);
            }
            throw new IllegalArgumentException();
        }

        @Override
        public void remove() {
            students.remove(currentIndex);
        } 
    }


    @Override
    public String toString() {
        return groupName +" [students=" + students + "]";
    }

    public void remove(Student student) {
        students.remove(student);
    }

    
}
