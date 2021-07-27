public class Triangular {
   public static void main(String[] args) {
     System.out.println(isTriangular(0));
     System.out.println(isTriangular(1));
      System.out.println(isTriangular(3));
      System.out.println(isTriangular(4));
      System.out.println(isTriangular(6));
      System.out.println(isTriangular(10));
      System.out.println(isTriangular(11));
      System.out.println(isTriangular(12));
      System.out.println(isTriangular(13));
      System.out.println(isTriangular(14));
      System.out.println(isTriangular(15)); 
   }
   private static int isTriangular(int n){
      if(n<=0) return 0;
      int sum = 0;
         for (int i = 1; sum < n; i++) {
            sum += i;
           
         }   
         if (sum == n) {
            return 1;
      }
      return 0;
   }
}
