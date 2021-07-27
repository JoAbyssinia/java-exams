public class IsHasSingleMaximum {
 
   public static void main(String[] args) {
      int [] data = {1,2,3,4,5};
      System.out.println(HasSingleMaximum(data));

   }

   private static int HasSingleMaximum(int [] a){
      int g=0;
      int uCount=0;
    if (a.length == 0) {
         return 0;
      }
      for (int i = 0; i < a.length; i++) {
      
         if (g==0) {
            g= a[i];
         }else{
            if (g<a[i]) {
               g=a[i];
            }else if(g==a[i]){
               uCount++;
               break;
            }
         }
      }
      
      return (uCount != 0) ? 0 : 1;
   }
}
