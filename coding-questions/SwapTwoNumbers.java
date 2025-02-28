public class SwapTwoNumbers {

    public static void main (String[] args){
        int a = 20;
        int b = 13;

        b = b+a;
        a = b-a;
        b = b-a;

        System.out.println("a: "+a+", b: "+b);
    }
}
