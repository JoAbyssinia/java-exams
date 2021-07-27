class Mtest2 {

   public static void main(String[] args) {
      int[] data = {4,1,2,3};
      int result = calculate(data);  

      System.out.print(result);
   }

   private static int calculate(int[] data) {
      int x=0,y=0;
         for (int i = 0; i < data.length; i++) {
            if (data[i]%2==0) {
               y+=data[i];
            }else{
               x+=data[i];  
            }
         }

      return x-y;
   }

}