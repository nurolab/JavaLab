public class TestPrime{
    public static void main(String[] args){
        for (int n = 0; n <= 144 ; n++)
            if(isPrime(n)) System.out.println(n + " ");
        //System.out.println(isPrime(5));
    }
    public static boolean isPrime(int n){
        if (n < 2) return false;
        if (n < 4) return true;
        if (n%2 == 0) return false;
        for (int d = 3; d*d <= n ; d += 2)
        {
            System.out.println(n+"%"+d);
            if(n%d == 0) return false;
        }
        return true;
    }
}