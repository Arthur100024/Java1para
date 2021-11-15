import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);
        int num = cout.nextInt();
        sequence1(num);
        System.out.println("\n");
        sequence2(num);
        System.out.println("\n");
        System.out.print(sum(num));
        System.out.println("\n");
    }

    // 1 задание
    public static void sequence1(int num) {
        if(num>1) {
            sequence1(num-1);
            for (int i = 1; i <=num; i++)
                System.out.print(num + " ");
        }
        else
            System.out.print(1 + " ");
    }

    // 2 задание
    public static void sequence2(int num) {
        if (num > 1) {
            sequence2(num - 1);
            System.out.print(num + " ");
        }
        else System.out.print(1 + " ");
    }
    
    //5 задание
    public static int sum(int num)
    {
        if(num < 10)
            return(num);
        else
            return((num%10)+sum(num/10));
    }
}
