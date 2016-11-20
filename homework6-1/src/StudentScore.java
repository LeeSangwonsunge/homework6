import java.util.Scanner;

public class StudentScore {
	public StudentScore(){
		Scanner s = new Scanner(System.in);
		double Score[][] = new double[5][3];
		double SumKor =0.0;
		double SumEng=0.0;
		double SumMath=0.0;
		double StuScore[] = new double[5];
		
		for(int i=0; i<5; i++){
			System.out.println((i+1)+"번 학생 국어, 영어, 수학");
			for(int j=0; j<3; j++){
				Score[i][j] = s.nextDouble();
				StuScore[i] += Score[i][j];
			}
			SumKor += Score[i][0];
			SumEng += Score[i][1];
			SumMath += Score[i][2];
		}
		System.out.println("국어총점은 " + SumKor + "이고, 평균은" + (SumKor/3) + "입니다");
		System.out.println("영어총점은 " + SumEng + "이고, 평균은" + (SumEng/3) + "입니다");
		System.out.println("수학총점은 " + SumMath + "이고, 평균은" + (SumMath/3) + "입니다");
		for (int i=0; i<5; i++){
			System.out.println(i + "번 학생의 총점은" + StuScore[i] + "이고, 평균은 " + (StuScore[i]/3) + "입니다");
		}
	}
}
