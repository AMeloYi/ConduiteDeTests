package test;

public interface TestObserver {
	public void test_update(TestObservable o, Object arg);
	
	public void stub_update(TestObservable o, Object arg);
}