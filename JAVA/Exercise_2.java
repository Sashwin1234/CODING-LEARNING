import java.util.Scanner;
public class Exercise_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of first subject :");
        int a = sc.nextInt();
        System.out.println("Enter the marks of second subject :");
        int b = sc.nextInt();
        System.out.println("Enter the marks of third subject :");
        int c = sc.nextInt();
        System.out.println("Enter the marks of fourth subject :");
        int d = sc.nextInt();
        System.out.println("Enter the marks of fifth subject :");
        int e = sc.nextInt();
        int g = a+b+c+d+e;
        float  f = g*100/500;
        System.out.println("Your Boards percentage are : ");
        System.out.print(f);
    }
}
