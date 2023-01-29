import  java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("result = "+ sum());
    }

    private static Integer sum() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please input 2 Number : ");
        int input1=scanner.nextInt();
        int input2=scanner.nextInt();
        return input1+input2;

    }
}
