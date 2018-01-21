package cdt;

public class TestMain {
	public static void main(String[] args) {
		TestPile pile = new TestPile();
		TestObserver observerVBP = new TestViewBottomPile();
		pile.test_addObserver(observerVBP);

		TestKbdInputPile kbd = new TestKbdInputPile();
		
		//test KbdInputPile to ViewBottomPile
		System.out.println("test KbdInputPile to Pile to ViewBottomPile ......");
		for(int i = 0; i < 7; i++) {
			kbd.test_actionCommande(pile, 10+i);
		}
	}
}
