import java.util.Scanner;

public class SecondMax {
	public SecondMax() {
		Scanner s = new Scanner(System.in);
		int Array[] = new int[10];
		int Max = 0;
		int SecMax = 0;
		int index = 0;
		
		for(int i=0; i<10; i++){
			System.out.println((i+1)+"번째 수를 입력하시오 : ");
			Array[i] = s.nextInt();
		}
		for(int i=0; i<10; i++){
			if(Array[i]>Max){
				Max=Array[i];
			}
		}
		for(int i=0; i<10; i++){
			if(Array[i]!=Max){
				if(Array[i]>SecMax){
					SecMax=Array[i];
					index=i+1;
				}
			}
		}
		System.out.println("두번째로 큰 수는 " + index + "번째수" + SecMax + "입니다");
	}
}
