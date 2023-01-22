package j1221;

public class Test {
	private static Test instance=null;
	
	private Test() {
		System.out.println("테스트입니다.");
	}
	
	public static Test getInstance() {
		if(instance==null){
			
			synchronized(Test.class) {
				if(instance==null)
					instance=new Test();
			}
			instance=new Test();
		}return instance;
	}
	
}
