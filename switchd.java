 public class switchd {
   public static void main (String[] arg) {
    int marks = -12;
    char grade;
    if (marks<0||marks>100){
        grade='E';
    } else if(marks<50){
        grade='D';
    }else if(marks<60){
    grade='C';
    }else if(marks<70){
    grade='B';
    }else if (marks<40){
    grade='F';
    }else {
        grade= 'A';
        }
        switch(grade){
            case 'F':
            System.out.println("FAIL");
        break;
        case 'D':
        System.out.println("PASS");
        break;
        case 'C':
        System.out.println("AVERAGE");
        break;
        case 'B':
        System.out.println("GOOD");
        break;
        case 'A':
        System.out.println("EXCELENT");
        break;
        default:
        case 'E':
        System.out.println("ERROR");
        }
   }  
 }  