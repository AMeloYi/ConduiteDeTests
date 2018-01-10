package cdt;

public abstract class InputPileStrategy {
	public void push(int entier){}
	public Integer pop(){return 1;}
	public void clear(){}
	public abstract void actionCommande();
}