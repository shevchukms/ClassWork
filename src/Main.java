import firstTask.A;
import firstTask.B;
import firstTask.C;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<C> arrayList = new ArrayList();
        arrayList.add(new A());
        arrayList.add(new B());
        showList(arrayList);

        changePositions(arrayList, 0, 1);
        System.out.println();
        showList(arrayList);
    }


    private static <T extends C> void changePositions(ArrayList<T> arrayList, int index1, int index2) {
        T cTemp = arrayList.get(index1);
        arrayList.set(index1, arrayList.get(index2));
        arrayList.set(index2, cTemp);

    }


    public static void showList(ArrayList<C> arrayList) {
        for (C c : arrayList
                ) {
            System.out.println(c.getClass());
        }
    }

}
