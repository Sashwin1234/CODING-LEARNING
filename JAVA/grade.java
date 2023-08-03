import java .util.Scanner ;
public class grade {
    public static void main (String[]args){
        Scanner sc = new  Scanner(System.in);
        
        System.out.println("enter your grade :");
        int a = sc.nextInt();
        int incr = a + 8;
        System.out.println("grade incripted : "+incr);
        System.out.println("enter the incripted grade grade :");
        int b = sc.nextInt();
        int decr =b-8;
        System.out.println("your grade is : "+decr);

    }
    
}
