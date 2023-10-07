package sem3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sem3_main {
    public static void main(String[] args) {
        Student one = new Student("Vanya", "Maths", 2020);
        Student two = new Student("Olya", "History", 2018);
        Student three = new Student("Alesya", "Geography", 2013);
        Student four = new Student("Jane", "Analysis", 2013);
        StudentGroup col = new StudentGroup("group 1413");
        col.addToGroup(one);
        col.addToGroup(two);
        col.addToGroup(three);
        // System.out.println(col);
        // StudentGroupService studyRef = new StudentGroupService();
        // studyRef.deleteStudentFromGroup(one, col);
        // System.out.println(col);

        StudentGroup col2 = new StudentGroup("group 9");
        col2.addToGroup(one);
        StudentGroup col3 = new StudentGroup("group 26");
        col3.addToGroup(three);
        col3.addToGroup(four);

        Stream groupSet = new Stream();
        Stream groupSet2 = new Stream();
        Stream groupSet3 = new Stream();

        groupSet.addToStream(col3);
        groupSet.addToStream(col2);
        groupSet2.addToStream(col2);
        groupSet3.addToStream(col);
        groupSet3.addToStream(col3);

        List<Stream> streams = new ArrayList<Stream>();
        streams.add(groupSet);
        streams.add(groupSet2);
        streams.add(groupSet3);
        for (Stream stream : streams) {
            System.out.println(stream);
        }
        System.out.println("\n");

        StreamService sortedStreams = new StreamService();
        sortedStreams.sortStreams(streams);

        for (Stream stream : streams) {
            System.out.println(stream);
        }
    }
}
