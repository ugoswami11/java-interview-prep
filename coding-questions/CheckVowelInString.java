public class CheckVowelInString {

    public static void main(String[] args){
        String str = "Elephant";

        System.out.println(IsVowel(str));
    }

    public static Boolean IsVowel(String inp){
        Boolean isPresent = inp.toLowerCase().matches(".*[aeiou].*");
        return isPresent;
    }
}
