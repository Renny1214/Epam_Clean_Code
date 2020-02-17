package Interest_Question;
import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double principle , rate;
        int time;
        System.out.println("enter principle :");
        principle = obj.nextDouble();
        System.out.println("rate : ");
        rate = obj.nextDouble();
        System.out.println("time :");
        time = obj.nextInt();

        Interest interest = new Interest(principle,rate,time);
        System.out.println("Simple Interest : "+interest.getSimpleInterest());
        System.out.println("Compound Interest :"+interest.getCompoundInterest());
    }
}
