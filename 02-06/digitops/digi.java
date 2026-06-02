import java.util.*;

public class digi{

    public static long digiSum(long n){

        long sum =0; 
        long rem =0;
        while(n !=0){
            rem = n%10;
            sum = sum + rem;
            n = n/10;

        }
        return sum;


    }

    public static long digiRev(long n){
        long rev =0;
        long rem =0;
        while(n != 0){
            rem = n % 10;
            rev = rev*10 + rem;
            n = n/10;
        }

        return rev;
    }
    public static void main(String [] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            long num = sc.nextLong();
            long sum = digiSum(num);
            long rev = digiRev(num);
            System.out.println("Sum: "+sum);
            System.out.println("Rev: "+rev);

            
        }catch(Exception e){
            System.out.println("invalid Input");

        }

    }
}