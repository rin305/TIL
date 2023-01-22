package j1221;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//외부에서 접근이 불가->객체생성X->생성자 호출X
		//Singleton ob1=new Singleton();
		Singleton ob1=Singleton.getInstance();
		Singleton ob2=Singleton.getInstance();
		Singleton ob3=Singleton.getInstance();
		//객체명은 3개지만 실제 객체는 한개이다->주소값을 확인
		Test t=Test.getInstance();
		
		System.out.println("ob1=>"+ob1);
		System.out.println("ob2=>"+ob2);
		System.out.println("ob3=>"+ob3);
		
		if(ob1==ob2)
			System.out.println("ob1과 ob2는 같은 객체(=주소가 같음)");
		else
			System.out.println("ob1과 ob2는 다른 객체(=주소가 다름)");
	}

}
