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
		
		
		
		// 配列
		String[] names = { "John", "Kate", "Bob", };
		System.out.println(names[1]);
		names[1] = "Jane";
		System.out.println(names[1]);
		// names[3] = "Mary";                        // java.lang.ArrayIndexOutOfBoundsException
		// System.out.println(names[3]);        // Ruby, PHPは配列の要素数をあとから変更できるがJavaは変更できない
		
		
		
		// ビット演算子
		int number = 0x12345678;
		int lower = number & 0x0000ffff;
		System.out.printf("lower = %x\n", lower);
//		System.out.printf("lower = %08x\n", lower);              // ０埋め, 最小８桁, 16進数表示, 改行
		int heigher = number >> 16;
		System.out.printf("heigher = %x\n", heigher);
		
		int numDec = 127;
		// Decimal Numberへの変換
		int numBin = Integer.parseInt("01111111", 2);
		int numOct = 0177;
		int numHex = 0x7f;
		System.out.println(numDec);
		System.out.println(numBin);
		System.out.println(numOct);
		System.out.println(numHex);

		
		int i = 127;
		System.out.println("１０進数：" + i);                                            // Decimal Number
		System.out.println("２進数：" + Integer.toBinaryString(i));          // Decimal Number -> Binary Number
		System.out.println("８進数：" + Integer.toOctalString(i));           // Decimal Number -> Octal Number
		System.out.println("１６進数：" + Integer.toHexString(i));         // Decimal Number -> Hexadecimal number
	}
}

