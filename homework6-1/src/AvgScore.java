import java.util.Scanner;

public class AvgScore {
	public AvgScore(){
		Scanner s = new Scanner(System.in);
		double Array[] = new double[10];
		double Max = Double.MIN_VALUE;
		double Min = Double.MAX_VALUE;
		double Avg = 0.0;
		
		for(int i=0; i<10; i++){
			System.out.println((i+1)+"번 심사점수 입력 : ");
			Array[i] = s.nextDouble();
			Avg += Array[i];
		}
		for(int i=0; i<10; i++){
			if(Array[i]>Max){
				Max=Array[i];
			}
			if(Array[i]<Min){
				Min=Array[i];
			}
		}
		Avg = Avg - Max - Min ;
		System.out.println("가장큰 점수와 가장 작은 점수를 제외한 8개의 점수 평균은"+ Avg +"입니다");
	}
}