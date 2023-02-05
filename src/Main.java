import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(filList());

    }

    public static ArrayList<Integer> filList() {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(-7);
        list.add(15);
        list.add(28);
        list.add(3);
        System.out.println(list);
        for (int i = list.size()-1; i>=0; i--){
            list2.add(list.get(i));

        }
        System.out.println(list2);
        return list;
    }

}







