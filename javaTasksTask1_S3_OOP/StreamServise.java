package javaTasks.javaTasksTask1_S3_OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamServise {
    Stream stream;
    public StreamServise(Stream stream){
        this.stream = stream;
    }
    public List<Stream> getSortedStream() {
        List<Stream> result = new ArrayList<>(Arrays.asList(stream));
        Collections.sort(result);
        result.sort(new StreamComparator());
        return result;

    }
    public void soutList(List<StudentGroup> educationStream){
        for (StudentGroup s:educationStream){
            System.out.println(s);
        }
    }
}

