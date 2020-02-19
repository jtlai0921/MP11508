package hoge;

/**
 * 進行整數的加法、減法的類別
 * 用來說明JUnit的簡易類別
 */
public class Counter {

	/**
	 * 傳回num1加num2之後的總和
	 * 
	 * @return 總和
	 * @param num1 遞增值
	 * @param num2遞增值 ���Z�����l
	 */
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	
	/**
	 * 傳回num1減去num2的結果
	 * @return 減法結果
	 * @param num1 被除數
	 * @param num2除數�����l
	 */
	public int subtract(int num1, int num2){
		return num1 - num2;
	}
}
