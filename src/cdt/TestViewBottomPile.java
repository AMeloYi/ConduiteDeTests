package cdt;

public class TestViewBottomPile implements TestObserver{
	
	@Override
	public void test_update(TestObservable o, Object arg) {
		System.out.println("ViewBottomPile changed!");
	}
	
	public void update(){
		System.out.println("ViewBottomPile changed!");
	}
}