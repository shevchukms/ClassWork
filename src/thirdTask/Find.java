package thirdTask;

import java.util.List;

public class Find {
    public <E extends Comparable<E>> E max(List<E> data, int begin, int end) {
        E max = data.get(begin);
        for (int i = begin + 1; i < end; i++) {
            if (data.get(i).compareTo(max) > 0) {
                max = data.get(i);
            }
        }

        return max;
    }
}
