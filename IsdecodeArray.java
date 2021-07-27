public class IsdecodeArray {
   public static void main(String[] args) { 
     int [] result = decodeArray(new int[]{1, 5, 8, 17, 15});
      
     System.out.println(decodeArray1(new int[]{-1, 5, 8, 17, 15}));

      for (int i : result) {
         System.out.print(i+" ");
      }
   }

   private static int[] decodeArray(int[] a){

      if(a.length < 2) return null;

      int[] result = new int[a.length-1];

      for (int i = 0; i < a.length-1; i++) {
            int res = Math.abs(a[i]-a[i+1]);

            result[i]= (a[i] < 0 )? res*-1 : res ;
      }
      return result;
   }
   private static int decodeArray1(int [] a){
      if(a.length < 2) return 0;
      int sign = (a[0]<0) ? -1 : 1;
      int totalSum =0;
      for (int i = 0; i < a.length-1; i++) {
         int result = Math.abs(a[i]-a[i+1]);
        
         totalSum = (totalSum*10)+result;
      }
      return totalSum*sign;
   }
}
