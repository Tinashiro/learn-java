 public class decision {
   public static void main (String[] arg) {
    int grade = -12;
    if(grade>100||grade<0){
      System.out.println("ERROR");
    }else if (grade<40){
     System.out.println("FAIL") ;
     }else if (grade<=50) {
        System.out.println("PASS"); 
         } else if(grade<=60) {
       System.out.println("AVERAGE");
         } else {
         System.out.println("EXCELLENT");
   }  
   }
 } 
 