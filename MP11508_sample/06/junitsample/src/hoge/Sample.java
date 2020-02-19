package hoge;

import org.junit.Ignore;
import org.junit.Test;

public class Sample {

	public int devide(int num1, int num2){
		return num1 / num2;
	}
	
	@Test (expected=ArithmeticException.class) 
	public void 確認擲出例外(){
		devide(1,0);
	}
	
	public void doRemoteCall(){
		//...
	}
	
	@Test (timeout=5000)
	public void  確認回應在5秒之內(){
		doRemoteCall();
	}
	
	@Ignore("以變更規格開始")
	@Test
	public void doSomething(){
		//...
	}
	
}
