import java.util.Scanner;

public class ExamVariousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int input=0;
		
		
		while(input !=6){
			System.out.println("*********************");
			System.out.println("배열 사용하기");
			System.out.println("*********************");
			System.out.println("1.두번째로 큰 수 찾기");
			System.out.println("2.심사 점수 계산");
			System.out.println("3.학생 총점, 평균 값 구하기");
			System.out.println("4.5층 아파트의 거주자 숫자 구하기");
			System.out.println("5.겹치지 않는 숫자 10개 입력 받기");
			System.out.println("6.종료하기");
			System.out.println("원하는 메뉴는 >> ");
			input = s.nextInt();
			switch(input){
			case 1 : new SecondMax(); break;
			case 2 : new AvgScore(); break;
			case 3 : new StudentScore(); break;
			case 4 : new AptPersonCount(); break;
			case 5: new OnlyNumber(); break;
			case 6: System.exit(0); break;
			default : System.out.println("1~6사이의 숫자만 입력해주세요."); break;
			}	
		}
	}
}