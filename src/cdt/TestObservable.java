package cdt;

import java.util.ArrayList;
import java.util.List;

public abstract class TestObservable{
	private List<TestObserver> list = new ArrayList<TestObserver>();
	
	public void test_addObserver(TestObserver o){
		list.add(o);
	}
	
	public void test_setChanged(){
		test_notifyObservers();
	}
	
	public void test_notifyObservers(){
		for (TestObserver observer : list) {
			observer.test_update(this,null);
		}
	}
}
