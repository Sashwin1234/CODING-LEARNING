import java.util.Scanner;
public class f {
    public static void main (String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("entwer your 1 marks");
     int a = sc.nextInt();
     System.out.println("entwer your 2 marks");
     int b = sc.nextInt();
     System.out.println("entwer your 3 marks");
     int c = sc.nextInt();
     System.out.println("entwer your 4 marks");
     int d = sc.nextInt();
     System.out.println("entwer your 5 marks");
     int e = sc.nextInt();
     int sum = a+b+c+d+e;
     int ans = sum*100/500 ;
     System.out.println(ans);
    }
}
