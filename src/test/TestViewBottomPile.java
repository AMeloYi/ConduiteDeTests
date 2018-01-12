package test;

public class TestViewBottomPile implements TestObserver{
	
	@Override
	public void test_update(TestObservable o, Object arg) {
		System.out.println("Receive a message and ViewBottomPile changed!");
	}
	
	public void update(){
		System.out.println("Receive a message and ViewBottomPile changed!");
	}
}
