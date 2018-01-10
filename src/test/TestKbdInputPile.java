package test;

public class TestKbdInputPile extends TestInputPileStrategy{
	@Override
	public void test_actionCommande(TestPile pile, int entier){
		System.out.println("Kdb : Faire test_actionCommande");
		pile.driver_push(entier);
	};
	
	@Override
	public void driver_actionCommande(TestPile pile, int entier){
		System.out.println("Kdb : Faire driver_actionCommande");
		pile.stub_push(entier);
	}
}