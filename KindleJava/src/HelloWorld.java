import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;


/*
 * 同一パッケージ内のクラスにはクラス名のみでアクセス可能
 * 同一パッケージ内のクラスに対するimport文はエラーの原因となる
 */

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World Java");
		
		// 配列
//		String[] names = { "John", "Kate", "Bob", };
//		System.out.println(names[1]);
//		names[1] = "Jane";
//		System.out.println(names[1]);
		// names[3] = "Mary";                        // java.lang.ArrayIndexOutOfBoundsException
		// System.out.println(names[3]);        // Ruby, PHPは配列の要素数をあとから変更できるがJavaは変更できない

		
		// 演算子
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
		
		
		System.out.println("----------------------------------------");
		
		
		// ビット演算子
		// & (AND)            どちらも1なら1
		// | (OR)                 どちらか1なら1
		// !(NOT) もしくは~ 0は1に、1は0に
		// ^(XOR)              どちらか片方だけ1なら1、どちらも0またはどちらも1なら0
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

		
		System.out.println("----------------------------------------");
		
		
		// 制御構文
		// 現在時刻の秒数が奇数か偶数かを判定
		int nowSec = LocalDateTime.now().getSecond();
		
		if (nowSec % 2 == 0) {
			System.out.println(nowSec + " は偶数です");
		} else {
			System.out.println(nowSec + " は奇数です");			
		}
		
		
		// 現在の日付から月数を取り出し、季節を判定する
		int nowMonth = LocalDate.now().getMonthValue();
		
		if (3 <= nowMonth && nowMonth <= 5) {
			System.out.println(nowMonth + "月は春です");
		} else if (6 <= nowMonth && nowMonth <= 8) {
			System.out.println(nowMonth + "月は夏です");			
		} else if (9 <= nowMonth && nowMonth <= 11) {
			System.out.println(nowMonth + "月は秋です");			
		} else  {
			System.out.println(nowMonth + "月は冬です");
		}
		
		
		// enum型の変数に対するswitch文の例
		Month month = LocalDateTime.now().getMonth();
		
		switch (month) {
			case MARCH:
			case APRIL:
			case MAY:
				System.out.println(month + " is Spring.");
				break;
			case JUNE:
			case JULY:
			case AUGUST:
				System.out.println(month + " is Summer.");
				break;
			case SEPTEMBER:
			case OCTOBER:
			case NOVEMBER:
				System.out.println(month + " is Autumn.");
				break;
			default:
				System.out.println(month + " is Winter.");
				break;
		}

		
		System.out.println("----------------------------------------");
		
		
		/*
		 *変数初期化
		 *条件
		 *繰り返し処理（Trueの場合）
		 *変数更新
		 */
		int[] numArray = { 1, 1, 2, 3, 5, 8, 13, 21 };
		int sumA = 0;
		for (int j = 0; j < numArray.length; j++) {
			System.out.println(j + 1 +  "回目：" + numArray[j]);
			sumA +=numArray[ j];
			System.out.println(j + 1 + "回目の合計：" + sumA);
		}
		
		System.out.println("----------------------------------------");
		
		// 配列やコレクションの要素を1つずつ取り出して処理
		int k = 1;
		int sumB = 0;
		for (int tmpNum : numArray) {
			System.out.println(k + "回目: " + tmpNum);
			sumB += tmpNum;
			System.out.println(k + "回目の合計: " + sumB);
			k++;
		}

		
		System.out.println("----------------------------------------");
		
		
		// while文
		LoopTest loopTest = new LoopTest();
		loopTest.whileMethod();
		loopTest.whileBreakMethod();

		
		System.out.println("----------------------------------------");
		
		
		// オーバーロード
		Student student1 = new Student("Taguchi", 30);
		student1.overloadTest();
		student1.overloadTest("（引数あり）");
		
	}
}

