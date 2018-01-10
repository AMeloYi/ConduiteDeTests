package test;

import java.util.ArrayList;
import java.util.List;

public class TestPile extends TestObservable{
	public List<Integer> list = new ArrayList<Integer>();
	
	public Integer driver_getEntier(int index){
		System.out.println("Pile : Faire test_getEntier(" + String.valueOf(index) + ")");
		return list.get(index);
		}
	public void driver_push(int entier){
		System.out.println("Pile : Faire test_push(" + String.valueOf(entier) + ")");
		list.add(entier);
		this.test_setChanged();
	};
	public Integer driver_pop(){
		System.out.println("Pile : Faire test_pop()");
		return 1;
		};
	public void driver_clear(){
		System.out.println("Pile : Faire test_clear()");
	};
	
	
	public Integer stub_getEntier(int index){
		System.out.println("Pile : Faire stub_getEntier(" + String.valueOf(index) + ")");
		return 1;
		}
	public void stub_push(int entier){
		System.out.println("Pile : Faire stub_push(" + String.valueOf(entier) + ")");
	};
	public Integer stub_pop(){
		System.out.println("Pile : Faire stub_pop()");
		return 1;
		};
	public void stub_clear(){
		System.out.println("Pile : Faire stub_clear()");
	};
}