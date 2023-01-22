package j1221;

//클래스 내부에서 특정객체를 한개만 생성=>대여=>반납(메모리 절약목적)
//->스프링 내부에서도 같이 처리

public class CardCompany {

	//1.객체를 생성할 때 한개만 생성->공유해서 사용할 수 있도록->정적멤버변수
	private static CardCompany instance=null;//공유객체 (아직은 안만듦 걍 만들겠습니다~선언)
	
	//2.객체를 생성->자동으로 호출되는 메서드(=생성자)
	//형식) private 생성자(){} =>외부 객체 생성X
	private CardCompany() {//<-막아버렸기 때문에 new Singleton();으로 객체생성X
		System.out.println("인스턴스(=객체)");
	}
	
	//3.공유객체를 다른 모든 사람들에게 공유=>정적메서드
	public static CardCompany getInstance() {
		//안만들어져 있다면 하나생성->요구하는 쪽에 만들어진 객체를 대여
		if(instance==null) {
			//만들고자하는 객체를 공유객체로 등록
			//형식)synchronized(클래스명.class){}
			synchronized(CardCompany.class) {
				if(instance==null) {
					instance=new CardCompany();
				}
			}//synchronized
			instance=new CardCompany();
		}//outer if
		return instance;
	}//get메서드
	
}
