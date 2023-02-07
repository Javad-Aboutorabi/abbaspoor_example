import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Average();
//        ArrayList<Integer> list = converter("5,12,20,7,48,9,5,");
//        System.out.println(list);
    }

    public static void Average() {
        ArrayList<Integer> list ;
        list = converter("10,5,-7,15,28,3,");
        int average;
        int sum = 0;

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            sum = list.get(i) + sum;
        }
        average = sum / list.size();
        System.out.println("Average is : " + average);
    }

    public static ArrayList<Integer> converter(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ',') {
                sb.append(s.charAt(i));
            } else {
                list.add(Integer.parseInt(sb.toString()));
                sb = new StringBuilder();
            }
        }
        return list;
    }
}









