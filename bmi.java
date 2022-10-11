package 수학;
import java.util.*;

class bmi{
    public static void main(String[] args) {
        bmi solution = new bmi();
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름 : ");
        String name = scanner.next();

        System.out.println("키(cm) : ");
        float cm = scanner.nextFloat();

        System.out.println("몸무게(kg) : ");
        float kg = scanner.nextFloat();

        System.out.println(solution.solution(name, cm, kg));

    }
    
    String solution(String name, float cm, float kg){
        String title = " ### 비만도 계산기 ### ";
        String answer = "";
        float m = cm / 100;
        float biman = kg / (m * m);

        if(biman >= 35.0){answer = "고도비만";}
        else if(biman >= 30.0){answer = "중도 비만";}
        else if(biman >= 25.0){answer = "경도 비만";}
        else if(biman >= 23.0){answer = "과체중";}
        else if(biman >= 18.5){answer = "정상";}
        else{System.out.println(answer = "저체중");}

        return String.format(
            "%s \n" 
            +"***************** \n"
            +"이름 키(cm) 몸무게(kg)\n"
            +"*****************\n"
            +"%s %.1f %.1f %s\n"
            +"*****************",
         title, name, cm, kg, answer);
    }
}