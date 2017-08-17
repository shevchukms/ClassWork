package secondTask;

import java.util.Comparator;

public class CustomComparator  implements Comparator<Media> {
    @Override
    public int compare(Media o1, Media o2) {
        return o1.getClass().toString().compareTo(o2.getClass().toString());
    }
}
