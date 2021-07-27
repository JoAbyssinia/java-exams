public class Center15 {
   
   public static void main(String[] args) {
      int[] data = {6,9,15,15,15,6};

      int result = isCenter15(data);
      System.out.println(result);
   }

    private static int isCenter15(int[] data) {
         boolean check=false;
         for (int i = 0; i < data.length; i++) {
            int count = data[i];
            if (count==15) {
               check=true;
            }
            for (int j = i+1; j < data.length; j++) {
               if (count < 15){
                   count +=data[j];
               }else if ( count >15 ) {
                  break;
               }
               if (count==15) { 
                  if (check) {
                  boolean ch = (data.length /2==i)? true : false;
                     if (ch) {
                        return 1;
                     }
                  }else if (i==0) {
                     break;
                  }else if (((data.length-1)-j)==i) {
                    return 1;
                  }else{
                     break;
                  }
               }
            }
         }

      return 0;
   }

   
}
