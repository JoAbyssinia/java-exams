public class Is121Array {
   
   public static void main(String[] args) {
      System.out.println(is121Array(new int[]{1, 2, 1}));
      System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
      System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
      System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
      System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
      System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
      System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
      System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
      System.out.println(is121Array(new int[]{2, 2, 2}));
   }
   private static int is121Array(int[]a){
      if(a[0] !=1 || a[a.length-1] !=1 || a.length <3) return 0;

      int oneCounter = 0;
      boolean twoValue = false;

      for (int i : a) {
         if(i==1 && twoValue==false){
            oneCounter++;
         }
         if (i==2) {
            twoValue=true;
         }
         if (i==1 && twoValue) {
            oneCounter--;
         }
      }
      return (oneCounter==0 && twoValue)? 1 :0;
   }
}
