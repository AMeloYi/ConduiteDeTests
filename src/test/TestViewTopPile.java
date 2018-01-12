package test;

public class TestViewTopPile implements TestObserver{
	
	@Override
	public void test_update(TestObservable o, Object arg) {
		System.out.println("Receive a message and ViewTopPile changed!");
	}
}