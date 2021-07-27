public class GuthriseSquence {
   
   public static void main(String[] args) {
      
      // int input = 7   ;
      // isGuthriseSquence(input);


      int[] data = {8,4,2};
      int result = isGS(data);
      System.out.print(result);
   }

   private static void isGuthriseSquence(int input) {
        System.out.print(input+" ");
      
        if (input%2==0) {
         input = input/2;
      }else{
         input = input * 3 +1;
      }
      if (input ==1) {
         return; 
      }
      isGuthriseSquence(input);
   }

   private static int isGS(int[] a){

      int is= 0;
      int nextGs =a[0];

      if (a[a.length-1]==1) {
        
         for (int i = 0; i < a.length; i++) {
            if (nextGs == a[i]) {

               is=1;
               if (a[i] % 2 ==0 ) {
                  nextGs = nextGs / 2;
               }else{
                  nextGs = nextGs* 3 + 1; 
               }     
            }else{
               is=0;
               break;
            }
         }
      }else{
         is=0;
      }

      return is;
   }
}
