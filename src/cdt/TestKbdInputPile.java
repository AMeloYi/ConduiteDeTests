package cdt;

public class TestKbdInputPile extends TestInputPileStrategy{
	@Override
	public void test_actionCommande(TestPile pile, int entier){
		System.out.println("Kdb : Faire test_actionCommande");
		pile.test_push(entier);
	};
}