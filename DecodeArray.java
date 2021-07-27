public class DecodeArray {
   public static void main(String[] args) {
      System.out.println(decodeArray(new int[]{0,0,0,0,1,0,0,0,1}));
      System.out.println(decodeArray(new int[]{1}));
      System.out.println(decodeArray(new int[]{0,1}));
      System.out.println(decodeArray(new int[]{-1, 0, 1}));
      System.out.println(decodeArray(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
      System.out.println(decodeArray(new int[]{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}));
   }

   private static int decodeArray(int [] a){
      if(a[a.length-1] != 1) return 0;
      int sign =1;
      int indexer = 0;
      if (a[0] == -1 ) {
         sign = -1;
      }
      if(a[0]==1) return 0;
      int zeroCounter = 0,oneCounter = 0;
      int[] result = new int[a.length];
      for (int i = 0; i < a.length-1; i++) {
         if (a[i]==0) {
            zeroCounter++;
            oneCounter=0;
         }else if (a[i]==1) {
             oneCounter++;
            if(zeroCounter != 0){
               result[indexer]= zeroCounter;
               indexer++;
            }         
            zeroCounter=0;
         }
         result[indexer]= zeroCounter;
         if (oneCounter > 1) {
            result[i] = 0;
            indexer++;
         }
      }
      int[] reArray = new int[indexer+1];
      for (int i = 0; i < reArray.length; i++) {
         reArray[i] = result[i];
      }
      if(reArray.length == 1) return sign * reArray[0];
      String desimal = "";
      for(int i : reArray){
         desimal = desimal+i; 
      }
      return Integer.parseInt(desimal)*sign;
   }
}
