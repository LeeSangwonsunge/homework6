import java.util.Scanner;

public class OnlyNumber {
	Scanner s = new Scanner(System.in);
	int Array[] = new int[10];
	int index=0;
	
	public OnlyNumber(){
		this.Start();
	}
	public void Start(){	
		System.out.println("1~100 사이의 숫자를 입력하세요");
		for(int i=index;i<10;i++){
			System.out.println((i+1) + "번째 숫자 : ");
			Array[i] = s.nextInt();
			index = i;
			if(Array[i]<0 || Array[i]>100){
				System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
				this.Start();
				return;
			}
		}
		for(int i=9;i>=0;i--){
			System.out.println((i+1)+"번째 숫자는 " + Array[i] + "입니다.");
		}
	}
}
