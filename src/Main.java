import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList finalList = filList(5);
        System.out.println(finalList);
    }

    public static ArrayList<Integer> filList(int x) {
        ArrayList<Integer> list = new ArrayList();
        Random r = new Random();
        int i = 0;
        while (i < x) {
            int b = r.nextInt(100);
            list.add(b);
            i++;
        }
        return list;
    }
}
