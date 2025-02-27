public class ReverseString {

   public static void main (String[] args){
       String str = "Baskerville";

       String res = reverse(str);

       System.out.println("Reversed string: "+res);
   }

   public static String reverse(String inp){

       if(inp == null)
           throw new IllegalArgumentException("Provide some value");

       char[] chars = inp.toCharArray();

       StringBuilder sb = new StringBuilder();

       for(int i=chars.length-1; i>=0; i--){
           sb.append(chars[i]);
       }

       return sb.toString();
   }
}
