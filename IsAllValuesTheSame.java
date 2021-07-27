public class IsAllValuesTheSame {
   public static void main(String[] args) {
      System.out.println(allValuesTheSame(new int[]{1, 1, 1, 1}));
      System.out.println(allValuesTheSame(new int[]{83, 83, 83}));
      System.out.println(allValuesTheSame(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
      System.out.println(allValuesTheSame(new int[]{1, -2343456, 1, -2343456}));
      System.out.println(allValuesTheSame(new int[]{0, 0, 0, 0, -1}));
      System.out.println(allValuesTheSame(new int[]{432123456}));
      System.out.println(allValuesTheSame(new int[]{-432123456}));
      System.out.println(allValuesTheSame(new int[]{}));
   }
   private static int allValuesTheSame(int[] a){
      if(a.length==1) return 1;
      if(a.length ==0 )return 0;
      int no = a[0];
      for (int i : a) {
         if (i != no) {
            return 0;
         }
      }
      return 1;
   }
}
