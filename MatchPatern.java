public class MatchPatern{

   public static void main(String[] args) {
      
      int[] data = {1, 2, 3};
      int[] pattern = {1,2};
      
      int result = matchPatern(data,pattern);
      System.out.print(result);
   }


   public static int  matchPatern(int[] n,int[] pattern ){
      int match=0;
      int lastIndex =0;
      if((n[0] != pattern[0]) || (n[n.length-1] != pattern[pattern.length-1])) return 0;

         for (int i = 0; i < pattern.length; i++) {
               for (int j = lastIndex; j < n.length; j++) {
                  if (pattern[i]==n[j]) {
                     lastIndex++;
                     match++;
                  }else{
                     break;
                  }
               }   
            }
      return (match==n.length)? 1 : 0;
   }
}