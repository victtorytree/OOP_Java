package sem3;

import java.util.ArrayList;
import java.util.Iterator;

public class Stream implements Iterable<StudentGroup>, Comparable<Stream> {
    protected ArrayList<StudentGroup> groups = new ArrayList<StudentGroup>();

    public void addToStream(StudentGroup group) {
        groups.add(group);
    }
    public int getSize() {
        return this.groups.size();
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIteratotInStream();
    }
    private class GroupIteratotInStream implements Iterator<StudentGroup> {
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
    @Override
    public String toString() {
        return "Stream " + groups;
    }
    @Override
    public int compareTo(Stream o) {
        return this.getSize() - o.getSize();
    }
    
    
}
