
public class Mtest6 {
   
   public static void main(String[] args) {
      int[] data = {1,2,3,2};
      int result = f(data);

      System.out.print(result);
   }
   public static int f(int[] data) {
       int midV=0;
      for (int i = 0; i < data.length; i++) {
      int left=0,right=0;
         for (int j = 0; j < i; j++) {
            left += data[j];
         }
         for (int k = i+1; k < data.length; k++) {
            right += data[k];
         }
         if (left == right) {
            midV = i;  
         }
      }
      if (midV >0 ) {
         return midV;
      }else{
         return -1;
      }
   }
}
