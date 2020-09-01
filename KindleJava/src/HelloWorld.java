// comment

/*
 * comments
 * comments
 * comments
 */

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World Java");
		
		int numberA;
		numberA = 10;
		int numberB = 10;
		
		int numberC = numberA + numberB;                                                   // + は「算術演算子」であり「二項演算子」
		System.out.println("numberA + numberB  is " + numberC);
		
		System.out.println("numberA is 10. --numberA is " + --numberA);     // 前置演算
		System.out.println("numberB is 10. numberB-- is " + numberB--);     // 後置演算
		
		
		int numberD = 20;
		int numberE = 30;
		boolean result = numberD < numberE;
		System.out.println("Is " + numberD + " smaller than " + 30 + "? This comparision is " + result +".");    // 文字列結合演算子は他のどんなデータ型とも文字列結合できるという特性を持っている
		
		int numberF = 29;
		String tmp = numberF > 30 ? "elder" : "still young";        // 条件演算子 | 三項演算子
		System.out.println(tmp);
		
		boolean flagT = true;
		boolean flagF = false;
		System.out.println(flagT || flagF);        // AND
		System.out.println(flagT && flagF);   // OR
		System.out.println(!(flagT));               // NOT 単項演算子
	}

}
