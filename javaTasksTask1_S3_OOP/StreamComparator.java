package javaTasks.javaTasksTask1_S3_OOP;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        int resultOfComparing = o1.compareTo(o2);
        if (resultOfComparing == 0) {
            resultOfComparing = o1.compareTo(o2);
            if (resultOfComparing == 0) {
                return o1.compareTo(o2);
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;

        }
    }
}
