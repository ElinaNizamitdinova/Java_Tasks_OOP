package javaTasks.javaTasksTask1_S3_OOP;
import java.util.List;
import java.util.Iterator;

public class Stream implements Iterable<StudentGroup>,Comparable<Stream> {
    public List<StudentGroup> educationStream;
    public Stream(List<StudentGroup> educationStream) {
        this.educationStream = educationStream;
    }
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public int compareTo(Stream o) {
        if (this.educationStream.size() > o.educationStream.size())
            return 1;
        else if (this.educationStream.size()<o.educationStream.size())
            return -1;
        else return 0;
    }


    @Override
    public String toString() {
        return "Stream{" +
                "educationStream=" + educationStream.toString() +
                '}';
    }
}
