public class CalculatePower{
    public static void main(String[] args){
        int x = 2;
        int n = 3;
int result = calPower(x, n, 1);
System.out.printf("%d power of %d : %d",x,n,result );
    }

    static int calPower(int x, int n,int power){
        if(n==0){
            return power;
        }
        power = power*x;
        return calPower(x, n-1, power);
    
    }
}