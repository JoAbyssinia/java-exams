public class StantonMeasure {


   public static void main(String[] args) {
         
      int[] data = {1,2,3,4,5,6};
      int result = stantonMeasure(data);
         System.out.println(result);
     }  

     private static int stantonMeasure(int[]a) {
         int counter = 0;
         int compV=1;
         boolean second=true;
         
         if (a.length == 1 && a[0]==1 ) {
            return 1;
         }

         while (second) {
            if (compV !=1) {
               second =false;
               counter =0;
            }
            for (int i : a) {
            if (i==compV) {
               counter++;
               }
            }
            compV=counter;  
         }
      return counter;
   } 

}
