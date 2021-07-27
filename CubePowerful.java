public class CubePowerful {
   public static void main(String[] args) {
      System.out.println(isCubePowerful(407));
   }

   private static int isCubePowerful(int n){
      
      int num = n;
      int totalsum=0;
      if(n<=0) return 0;

      while (num>0) {
         int sum=1;
         int m = num%10;
         num = num/10;
         for (int i = 0; i < 3; i++) {
            sum *=m;
         }
         totalsum +=sum;
      }
      return (n == totalsum )? 1 :0 ;
   }
}
