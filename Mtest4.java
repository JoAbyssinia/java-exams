
public class Mtest4 {
   
   public static void main(String[] args) {
      int data = 12005;
      int result = f(data);
      System.out.println(result);
   }
   private static int f(int n){
      int sign = 1;
      if (n==0) {
         return 0;
      }else if (n < 0) {
         sign = -1;
         n = -n;
      }
      int rev_num = 0;
      while (n > 0) {
         rev_num = rev_num * 10 + n % 10;
         n=n/10;
      }
      return sign * rev_num;
   }
}
