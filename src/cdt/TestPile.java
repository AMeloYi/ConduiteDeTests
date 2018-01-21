package cdt;

public class TestPile extends TestObservable{
	
	public void test_push(int entier){
		System.out.println("Pile : Faire stub_push(" + String.valueOf(entier) + ")");
		//this.test_setChanged();
		TestViewBottomPile vbp = new TestViewBottomPile();
		vbp.update();
	};
}