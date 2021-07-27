public class Is235Array {
   
   public static void main(String[] args) {
        System.out.println(is235Array(new int[]{2, 3, 5, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 6, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(is235Array(new int[]{2, 4, 8, 16, 32}));
        System.out.println(is235Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}));
        System.out.println(is235Array(new int[]{7, 11, 77, 49}));
        System.out.println(is235Array(new int[]{2}));
        System.out.println(is235Array(new int[]{}));
        System.out.println(is235Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}));
   }
   private static int is235Array(int[]n ){
      if(n.length==0) return 1;
      int dividerCounter=0;
      int unCounter=0;
      int adder=1;

      for (int i = 2; i <= 5;) {
          unCounter =0;   
         for (int j = 0; j < n.length; j++) {
            if (n[j]%i==0) {
               dividerCounter++;
            }
            if (n[j]%2 !=0 && n[j]%3 !=0 && n[j]%5!=0) {
               unCounter++;
            }
         } 
         i +=adder;
            adder++;
      }
      return (n.length== dividerCounter+unCounter)? 1: 0; 
   }
}
