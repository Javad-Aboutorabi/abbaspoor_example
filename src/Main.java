import  java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please input 2 Number : ");
        int input1=scanner.nextInt();
        int input2=scanner.nextInt();
        int sum=input1+input2;
        System.out.println("result = "+sum);

    }
}
