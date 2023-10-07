package sem3;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentGroupItr implements Iterable<StudentGroup> {
    protected ArrayList<StudentGroup> groups = new ArrayList<StudentGroup>();
    
    public void addToGroup(StudentGroup group) {
        groups.add(group);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupIterator();
    }
    private class StudentGroupIterator implements Iterator<StudentGroup> {
        int currentIndex = 0;
        @Override
        public boolean hasNext() {
            return currentIndex < groups.size();
        }

        @Override
        public StudentGroup next() {
            if(hasNext()) {
                return groups.get(currentIndex++);
            }
            throw new IllegalArgumentException();
        }

    }

}
