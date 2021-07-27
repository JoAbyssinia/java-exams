public class Martian {
   public static void main(String[] args) {
      System.out.println(isMartian(new int[]{1, 3}));
      System.out.println(isMartian(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}));
      System.out.println(isMartian(new int[]{1, 3, 2}));
      System.out.println(isMartian(new int[]{1, 3, 2, 2, 1, 5, 1, 5}));
      System.out.println(isMartian(new int[]{1, 2, -18, -18, 1, 2}));
      System.out.println(isMartian(new int[]{}));
      System.out.println(isMartian(new int[]{1}));
      System.out.println(isMartian(new int[]{2}));
   }
   private static int isMartian(int[] a){
      if(a.length ==0)return 0;
       if(a.length==1 && a[0]==1) return 1;
      int oneCounter=0;
      int twoCounter = 0;
      for (int i = 0; i < a.length; i++) {
         if(a[i]==1) oneCounter++;
         if(a[i]==2) twoCounter++;
         if ((a.length-1) > i+1 ) {
            if(a[i]==a[i+1]) return 0;
         }
      }
      return (oneCounter > twoCounter )? 1 :0;
   }
}
