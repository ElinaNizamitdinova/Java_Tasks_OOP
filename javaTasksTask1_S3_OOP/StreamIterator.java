package javaTasks.javaTasksTask1_S3_OOP;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> educationStream;
    int counter = 0;
    public StreamIterator(Stream stream) {
        this.educationStream = stream.educationStream;
    }
    @Override
    public boolean hasNext() {
        return counter < educationStream.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        return educationStream.get(counter++);
    }

    @Override
    public void remove() {
        if (hasNext())
            educationStream.remove(counter);
    }
}
