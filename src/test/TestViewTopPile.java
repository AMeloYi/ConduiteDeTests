package test;

public class TestViewTopPile implements TestObserver{
	
	TestPile pile;
	
	@Override
	public void test_update(TestObservable o, Object arg){}

	@Override
	public void stub_update(TestObservable o, Object arg) {
		pile = (TestPile) o;
		System.out.println("Faire viewTopUpdate");
		for(int i = 0; i < pile.list.size(); i++) {
			System.out.print(String.valueOf(pile.list.get(i)));
		}
	}
}