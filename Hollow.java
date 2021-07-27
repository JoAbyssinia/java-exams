public class Hollow {
   public static void main(String[] args) {
      System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4}));
      System.out.println(isHollow(new int[]{1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18}));
      System.out.println(isHollow(new int[]{1, 2, 0, 0, 3, 4}));
      System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 5}));
      System.out.println(isHollow(new int[]{3, 8, 3, 0, 0, 0, 3, 3}));
      System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 0}));
      System.out.println(isHollow(new int[]{0, 1, 2, 0, 0, 0, 3, 4}));
      System.out.println(isHollow(new int[]{0, 0, 0}));
   }
   private static int isHollow(int[]a){
      if(a[0]!=0 && a[a.length-1]==0 || a[0]==0 && a[a.length-1]!=0  ) return 0;

      int zeroCounter =0;
      int nonZeroCounter=0;
      boolean zerofinder=false;

      for (int i : a) {
         if(zerofinder==false && i!=0){
            nonZeroCounter++;
         } 
         if(i==0){
            zeroCounter++; 
            zerofinder=true;
         } 
         if(zerofinder && i!=0){
            nonZeroCounter--;
         } 
      }
      return (zerofinder && zeroCounter >= 3 && nonZeroCounter ==0 )? 1:0;
   }
}
