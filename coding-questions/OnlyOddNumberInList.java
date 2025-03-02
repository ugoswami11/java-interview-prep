import java.util.ArrayList;
import java.util.List;

public class OnlyOddNumberInList {

    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();

        for(int i=0; i<10; i++){
            nums.add((int)(Math.random()*100));
        }

//        nums.add(5);
//        nums.add(7);
//        nums.add(9);
//        nums.add(13);

        for(int i: nums){
            System.out.println(i);
        }

        System.out.println("---------------------------------");

        //Checking using the simpler way
        System.out.println(IsOdd(nums));

        System.out.println("---------------------------------");

        //Checking using parallelStream
        System.out.println(IsOddUsingParallelStream(nums));
    }

    public static boolean IsOdd(List<Integer> inpList){
        for(int i: inpList){
            if(i%2==0)
                return false;
        }

        return true;
    }

//    public static boolean IsOddUsingParallelStream(List<Integer> inpList){
//        return inpList.parallelStream().anyMatch(x -> x % 2 != 0);
//    }
}
