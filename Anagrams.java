public class Anagrams {
   public static void main(String[] args) {
    System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));  
    System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 'd', 's'}));  
    System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 't'}));  
    System.out.println(areAnagrams(new char[]{'b', 'o', 'g'}, new char[]{'b', 'o', 'o'}));  
    System.out.println(areAnagrams(new char[]{}, new char[]{}));  
    System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 'g'}));  
   }
   private static int areAnagrams(char[] a1, char[] a2 ){
      if(a1.length != a2.length) return 0;

      char[] copy=a2;

      for (int i = 0; i < a1.length; i++) {
         for (int j = 0; j < copy.length; j++) {
            if(a1[i]==copy[j]){
               copy[j]='0';
               break;
            }
         }
      }
      int counter = 0;
      for (char c : copy) {
         if (c=='0') {
            counter++;
         }
      }
      return (counter == a1.length)? 1:0;
   }
}
