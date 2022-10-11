package 수학;
import java.util.*;

class 성적표 {
    public static void main(String[] args) {
        성적표 solution = new 성적표();
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름 : ");
        String name = scanner.next();

        System.out.println("국어 점수 : ");
        int ko = scanner.nextInt();

        System.out.println("영어 점수 : ");
        int en = scanner.nextInt();

        System.out.println("수학 점수 : ");
        int ma = scanner.nextInt();

        System.out.println(solution.solution(name, ko, en ,ma));
  
    }   
    String solution(String name, int ko, int en, int ma){
        String title = " ### 성적표 ### ";
        String answer = "";
        int total = ko + en + ma;
        float avg = total / 3;

        if (avg >= 90){answer = "A";}
        else if (avg >= 80){answer = "B";}
        else if (avg >= 70){answer = "c";}
        else if (avg >= 60){answer = "c";}
        else if (avg >= 50){answer = "c";}
        else{System.out.println(answer = "F");}
        return String.format(
            "%s \n *************\n"
            +"이름 국어 영어 수학 총점 평균 학점 \n "
            +"*************\n"
            +"%s %d %d %d %d %.1f %s\n"
            +"*************", title, name, ko, en, ma, total, avg, answer);
    }
}
