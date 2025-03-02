public class PrimeNumber {

    public static void main(String[] args){
        int num = 23;

        System.out.println(IsPrime(num));
    }

    public static Boolean IsPrime(int inp){

        if(inp==0 || inp==1)
            return false;

        if(inp==2)
            return true;

        for(int i=2; i<=inp/2; i++){
            if(inp%i==0)
                return false;
        }

        return true;
    }
}
