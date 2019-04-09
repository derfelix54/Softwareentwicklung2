package ComparableVideo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Apple> list = new ArrayList<Apple>();
        list.add(new Apple("Boskop", Color.ROT, 50));
        list.add(new Apple("PinkLady", Color.ROT, 30));
        list.add(new Apple("Sour", Color.GRUEN, 20));
        list.add(new Apple("Boskop", Color.ROT, 70));

        Collections.sort(list);


    }

}
