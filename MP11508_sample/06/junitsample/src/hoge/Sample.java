package hoge;

import org.junit.Ignore;
import org.junit.Test;

public class Sample {

	public int devide(int num1, int num2){
		return num1 / num2;
	}
	
	@Test (expected=ArithmeticException.class) 
	public void �T�{�Y�X�ҥ~(){
		devide(1,0);
	}
	
	public void doRemoteCall(){
		//...
	}
	
	@Test (timeout=5000)
	public void  �T�{�^���b5����(){
		doRemoteCall();
	}
	
	@Ignore("�H�ܧ�W��}�l")
	@Test
	public void doSomething(){
		//...
	}
	
}
