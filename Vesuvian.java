public class Vesuvian {
   
   public static void main(String[] args) {
    
      System.out.println(isVesuvian(50));
      System.out.println(isVesuvian(65));
      System.out.println(isVesuvian(85));
   }
   private static int isVesuvian(int n){
      for (int i = 1; i < n; i++) {
         for (int j = i; j < n; j++) {

            if ((i*i)+(j*j)==n) {
               return 1;
            }
            if ((i*i)+(j*j) > n) {
               break;
            }  
         }
      }
      return 0;
   }
}
