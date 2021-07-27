public class Fabonacci {
   
   public static void main(String[] args) {
      System.out.println(isFabonacci(13));
      System.out.println(isFabonacci(27));
      System.out.println(isFabonacci(1));
   }
   private static int isFabonacci(int n){
      if (n<0) return 0;
      if(n==1) return 1;

      int f1=1,f2=1,fab=0;
      for (int i = 0; i < n; i++) {
         fab = f1+f2;
         f1=f2;
         f2=fab;
         if (fab==n) {
            return 1;
         }else if(fab >n){
            break;
         }
         
      }
      return 0;
   }
}
