package cdt;

import java.util.ArrayList;
import java.util.List;

public class Pile extends Observable{
	List<Integer> list = new ArrayList<Integer>();
	public Integer getEntier(int index){return 1;}
	public void push(int entier){};
	public Integer pop(){return 1;};
	public void clear(){}
}