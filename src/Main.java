import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> finalList = filList(10);


        System.out.println(finalList);
        System.out.println(findMax(finalList));


    }

    public static ArrayList<Integer> filList(int x) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        int i = 0;
        while (i < x) {
            int b = r.nextInt(100);
            list.add(b);
            i++;
        }

        return list;
    }


    public static Integer findMax(ArrayList<Integer> list) {
        int index = 0;
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max <= list.get(i)) {
                index = i;
                max = list.get(i);
            }
        }

        int temp = list.get(list.size()-1);
        list.set(list.size()-1,list.get(index));
        list.set(index,temp);

//        System.out.println("------------------------------------------------------------");
//        System.out.println(list);





        return max;
    }
}
