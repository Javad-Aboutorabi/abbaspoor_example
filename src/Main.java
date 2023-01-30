import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fildlist(10);
    }
    public static int fildlist(int x){
        Scanner input= new Scanner(System.in);
        ArrayList list= new ArrayList();
        Random r= new Random();
        int i = 0;
        while (i < x){
            int b= r.nextInt(100);
            list.add(b);
            i++;
        }
        System.out.println(list);
        return x;
    }
}
