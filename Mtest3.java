public class Mtest3 {
   public static void main(String[] args) {
      char[] data = {'a','b','c'};
      char[] result = f(data,2,1);
      if (result== null) {
         System.out.print("null");
      }else{
         System.out.print(result);
      } 
   }  
    static char[ ] f(char[ ] a, int start, int len){

         if ((start + len - 1 ) >= a.length || len <0 || start <0 ) {
            return null;  
         }
            char[] sub = new char[len];
            for (int i = start,j=0; j < len; j++, i++) { 
                sub[j]=a[i];
            }
         return sub;
   }
}
