import java.util.Scanner;

public class AptPersonCount {
	public AptPersonCount(){
		Scanner s = new Scanner(System.in);
		int Apt[][] = new int[5][3];
		int Floor[] = new int[5];
		int Line[] = new int[3];
		int Total=0;
		
		for(int i=0; i<5; i++){
			for(int j=0; j<3; j++){
				System.out.println((i+1)+"0"+(j+1) + "호에 살고 있는 사람의 숫자 : ");
				Apt[i][j] = s.nextInt();
				Floor[i] += Apt[i][j];
				Line[j] += Apt[i][j];
				Total += Apt[i][j];
			}
		}
		System.out.println("이 아파트의 총 거주자는 " + Total + "명입니다.");
		for(int i=0; i<5; i++){
			System.out.println((i+1)+"층에 사는 거주자는 모두 " + Floor[i] + "명입니다.");
		}
		for(int i=0; i<3; i++){
			System.out.println((i+1)+"호 라인에 사는 거주자는 모두 " + Line[i] + "명입니다.");
		}
	}
}
