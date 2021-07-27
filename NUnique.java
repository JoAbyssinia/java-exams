public class NUnique {
   public static void main(String[] args) {
      int[] data = {7,3,3,2,4};
      int ch=11;
      int result = isNUnique(data,ch);
      System.out.println(result);
   }

   private static int isNUnique(int[] n,int ch){
         int uMatch = 0;
         if (n.length <2) {
            return 0;
         }
      for (int i = 0; i < n.length-1; i++) {
         for (int j = i+1; j < n.length; j++) { 
            if(n[i]+n[j]==ch){
               uMatch++;
            }
         }
      }
      if (uMatch !=1) {
         return 0;
      }else{
         return 1;
      }
   }
}
