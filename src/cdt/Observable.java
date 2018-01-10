package cdt;

public abstract class Observable{
	public Observer observer;
	
	public void setChanged(){}
	public void notifyObservers(){}
}
