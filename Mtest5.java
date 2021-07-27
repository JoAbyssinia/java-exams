public class Mtest5 {
   
   public static void main(String[] args) {
      int[] data = {3,2,1,9};
      int[] data1 = {1,2,0,3,4};
      int[] res = f(data,data1);

      if (res.length==0) {
         System.out.println("");
      }else{
         for (int i : res) {
            System.out.print(res[i-1]);
         }
      }
         
      
   }

   private static int[] f(int[] data, int[] data1) {
      
         if (data==null || data1 == null ) {
            return null;
         }
         if (data.length <= data1.length ) {
            int[] result = new int[data.length];
            int c=0;
            for (int i = 0; i < data.length; i++) {

              for (int j = 0; j < data1.length; j++) {
               if (data[i] == data1[j]) {
                  result[c]=data1[j]; 
                  c++;  
               }  
              }
            }

            int[] reresult = new int[c];
            for (int i = 0; i < reresult.length; i++) {
               reresult[i] = result[i];
            }

            return reresult;
         }else{
            int[] result = new int[data1.length];
            int c=0;
            for (int i = 0; i < data1.length; i++) {

              for (int j = 0; j < data.length; j++) {
               if (data1[i] == data[j]) {
                  result[c]=data[j]; 
                  c++;
               }  
              }
            }
            return result;
         }     
   }
}
