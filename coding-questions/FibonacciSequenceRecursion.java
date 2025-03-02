public class FibonacciSequenceRecursion {

    public static void main(String[] args){
        int sequenceNum = 10;

        //Print fiobonacci without recursion
        PrintFibonacciSequence(sequenceNum);

        System.out.println("--------------------------------------------------");

        //Print fibonaccu with recursion
        for(int i=0; i< sequenceNum; i++){
            System.out.println(fibonacciRecursive(i)+" ");
        }
    }

    public static void PrintFibonacciSequence(int count){
        int a = 0;
        int b = 1;
        int c = 1;

        for(int i=1; i<=count; i++){
            System.out.println(a + ",");
            a=b;
            b=c;
            c=a+b;
        }
    }

    public static int fibonacciRecursive(int count){
        if(count<=1)
            return count;

        return fibonacciRecursive(count-1) + fibonacciRecursive(count-2);
    }
}
