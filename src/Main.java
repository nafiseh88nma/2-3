import java.util.Scanner;

/**
 * Created by admin on 10/4/2019.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter tool");
        int t=input.nextInt();
        System.out.println("arz");
        int a=input.nextInt();
        Mostatil m1= new Mostatil(a,t);
        m1.masahat();
        m1.mohit();
        System.out.println("enter tool moraba");
        int aa=input.nextInt();
        Moraba n1= new Moraba(aa);
        n1.masahat();
        n1.mohit();
    }
}
