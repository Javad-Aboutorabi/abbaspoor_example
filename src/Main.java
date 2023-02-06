import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Average();

    }

    public static int Average() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(-7);
        list.add(15);
        list.add(28);
        list.add(3);
        int average;
        int sum = 0;

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            sum = list.get(i) + sum;
        }
        average = sum / list.size();
        System.out.println("Average is : " + average);
        return average;
    }

}







