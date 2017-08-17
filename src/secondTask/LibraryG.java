package secondTask;

import java.util.ArrayList;

public class LibraryG<T extends Media> {
    ArrayList<T> tArrayList = new ArrayList<>();


    private void addMedia(T x) {
        tArrayList.add(x);
    }

    private   T  retreiveLast() {
int size=tArrayList.size();
        if (size >0) {
            return (tArrayList.get(size-1));
        }
        else return null;
    }


}
