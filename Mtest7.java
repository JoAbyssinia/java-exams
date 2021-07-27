public class Mtest7 {
   public static void main(String[] args) {
      
      int[] data = {1,2,2,3,4,4,5,12,4,65,12,76,54,8,8,45,3,3,22,11,12};
      int[] result = f(data);
      
      for (int i : result) {
         System.out.print(i+", ");
      }
   }

   public static int[] f(int[] n){
      int[] result=new int[n.length];
      boolean che=false;
      int counter = 0;
         for (int i = 0; i < n.length; i++) {
               che=false;
               for (int j = 0; j < result.length; j++) {
                  if (n[i] == result[j]) {
                     che=true;
                     break;
                  }
               }
               if (che==false) {
                  result[counter]=n[i];
                  counter++;
               }
         }
         if (counter == result.length) {
            return result;
         }else{

         int[] resizeArray = new int[counter];

         for (int i = 0; i < resizeArray.length; i++) {
               resizeArray[i] = result[i];
         }

         return resizeArray;
      }
   }
}
