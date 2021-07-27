import java.util.Arrays;

public class IsUpdateMileageCounter {
   
   public static void main(String[] args) {
      int[] a = new int[]{8, 9, 9, 5, 0};
      updateMileageCounter(a, 1);

      System.out.println(Arrays.toString(a));

      int[] b = new int[]{8, 9, 9, 5, 0};
      updateMileageCounter(b, 2);

      System.out.println(Arrays.toString(b));

      int[] c = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
      updateMileageCounter(c, 1);

      System.out.println(Arrays.toString(c));

      int[] d = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
      updateMileageCounter(d, 13);

      System.out.println(Arrays.toString(d));
   }

   private static void updateMileageCounter (int[] a,int mile){
      int remender=0;

      for (int i = 0; i < a.length; i++) {
         int calc = a[i]+mile+remender;
         int value = calc%10;
         remender = calc /10;
         a[i]=value;
         mile =0;
      }
   }
}
