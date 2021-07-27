public class IsEval {
   public static void main(String[] args) {
      System.out.println(eval1(1.0, new int[]{0, 1, 2, 3, 4}));
        System.out.println(eval(3.0, new int[]{3, 2, 1}));
        System.out.println(eval(2.0, new int[]{3, -2, -1}));
        System.out.println(eval(-3.0, new int[]{3, 2, 1}));
        System.out.println(eval(2.0, new int[]{3, 2}));
        System.out.println(eval(2.0, new int[]{4, 0, 9}));
        System.out.println(eval(2.0, new int[]{10}));
        System.out.println(eval(10.0, new int[]{0, 1}));
   }
   private static double eval(double x,int[]a){
      int sum=0;
      for (int i = a.length-1; i >=0; i--) {
         int power=1;
         for (int j = 0; j < i; j++) {
            power *=x;
         }
         sum += a[i] * power;
      }
      return sum;
   }

   private static double eval1(double x,int[]a){
      int totalSu=0;
      for (int i = 0; i < a.length; i++) {
         int xPower = 1;
         for (int j = 0; j < i; j++) {
            xPower *=x;
         }
         totalSu +=(xPower * a[i]);
      }
      return totalSu;
   }
}
