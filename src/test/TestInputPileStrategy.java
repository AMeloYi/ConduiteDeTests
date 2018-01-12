package test;

public abstract class TestInputPileStrategy {
	public void test_push(int entier){}
	public Integer test_pop(){return 1;}
	public void test_clear(){}
	public abstract void test_actionCommande(TestPile pile, int entier);
}