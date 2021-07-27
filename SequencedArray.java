import javax.sound.midi.SysexMessage;

public class SequencedArray {
   
   public static void main(String[] args) {
      int[] data ={1,1, 2, 3, 4, 5};
      int m=1,n=5;
      int result = isSequencedArray(data,m,n);
      int result1 = isSequencedArray1(data,m,n);
      System.out.println(result1);
   }

   private static int isSequencedArray(int[] a,int m,int n ){
      int indexD=0;
      int finalvalues=0;
      int counter=0;
      for (int i = m; i <= n ; i++) { 
         int ch=0;
         for (int j = indexD; j < a.length; j++) {
            if (i==a[j]) {
               ch++;  
               indexD++;
            }else if(i > a[j]){
              
               return 0;
            }else{
               break;
            }
            counter++;
         }
      finalvalues += ch;
      }
      return ((finalvalues) == counter)? 1:0;
   }


   private static int isSequencedArray1(int[]a, int m,int n  ){
      if(a[0]!=m || a[a.length-1]!=n) return 0;
      for (int i = 0; i < a.length-1; i++) {
         if((a[i+1]-a[i]) !=0 && (a[i+1]-a[i]) !=1 ) return 0;
      }
      return 1;
   }
}
