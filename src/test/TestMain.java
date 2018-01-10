package test;

public class TestMain {
	public static void main(String[] args) {
		TestPile pile = new TestPile();
		TestObserver observerVBP = new TestViewBottomPile();
		pile.test_addObserver(observerVBP);
		
		System.out.println("test KbdInputPile to Pile ......");
		//test KbdInputPile to Pile
		TestKbdInputPile kbd = new TestKbdInputPile();
		kbd.driver_actionCommande(pile, 10);
		
		System.out.println("test Pile to ViewBottomPile ......");
		//test Pile to ViewBottomPile
		pile.driver_push(10);
		
		//test KbdInputPile to ViewBottomPile
		System.out.println("test KbdInputPile to ViewBottomPile ......");
		for(int i = 0; i < 7; i++) {
			kbd.test_actionCommande(pile, 10+i);
		}
	}
}
