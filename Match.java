public class Match {
   
   public static void main(String[] args) {
      int[] data = {1,2,3,4,-5,2,3,18};
      int[] p={4,-1,3};
      int result = match(data,p);
      System.out.println(result);
   }

   private static int match(int[] data,int[] p ) {
      int startIntexA=0;
      int lastIntexP=0;
      int sign=1;
      for (int i = 0; i < p.length; i++) {
      
         if (p[i]>0) {
          sign =1;  
         }else if(p[i]<0 ){
            sign=0;
         }else{
            return 0;
         }

         for (int j = startIntexA; j < startIntexA+ Math.abs(p[i]) ; j++) {
            if(sign==1){
               if (data[j] < 0) {
                  return 0;
               }
            }else if(sign==0){
               if (data[j]>0) {
                  return 0;
               } 
            }
            lastIntexP++;  
         }
         startIntexA=lastIntexP;
      }
      int counter=0;
      for (int i : p) {
         counter += Math.abs(i);
      }
      if (counter==data.length) {
         return 1;
      }else{
         return 0;
      }
   }
}
