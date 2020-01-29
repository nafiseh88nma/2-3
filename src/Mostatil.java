/**
 * Created by admin on 10/4/2019.
 */
public class Mostatil implements Shekl0{
    int t;
    int a;
    public Mostatil(Integer a , Integer t)
    {
        this.a=a;
        this.t=t;
    }
    @Override
    public void mohit(){
        int mo = 2*(a+t);
        System.out.println(mo);
    } @Override
    public void masahat(){
        int ma =a*t;
        System.out.println(ma);
    }
}
