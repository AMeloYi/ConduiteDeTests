package test;

public class TestViewBottomPile implements TestObserver{
	
	TestPile pile;
	
	@Override
	public void test_update(TestObservable o, Object arg) {
		
	}
	
	@Override
	public void stub_update(TestObservable o, Object arg) {
		pile = (TestPile) o;
		System.out.println("VBP : Faire viewBottomUpdate");
		int length = 0;
		if(pile.list.size() > 5)
			length = 5;
		else
			length = pile.list.size();
		
		for(int i = 0; i < length; i++) {
			System.out.print(String.valueOf(pile.list.get(i)));
		}
		System.out.println(" ");
	}
}
