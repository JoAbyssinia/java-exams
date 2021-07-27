public class Mercurial {
   public static void main(String[] args) {

      System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 1, 2, 2}));
      System.out.println(isMercurial(new int[]{5, 2, 10, 3, 15, 1, 2, 2}));
      System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 16, 2, 2}));
      System.out.println(isMercurial(new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3}));
      System.out.println(isMercurial(new int[]{2, 3, 1, 1, 18}));
      System.out.println(isMercurial(new int[]{8, 2, 1, 1, 18, 3, 5}));
      System.out.println(isMercurial(new int[]{3, 3, 3, 3, 3, 3}));
      System.out.println(isMercurial(new int[]{1}));
      System.out.println(isMercurial(new int[]{}));  
   }
   private static int isMercurial(int[] n){
      int oneCounter =0;
      int threeCounter = 0;
      boolean oneFlage=false;
      boolean threeFlage =false;
      
     for (int i : n) {
        if (i==1 && threeCounter==0) {
           oneCounter++;
           
        }
        if (i==3) {
           threeCounter++;
        }
        if (i==1 && threeCounter>0 && oneCounter>0) {
           return 0;
        }
     }
     return 1;
   }
}
