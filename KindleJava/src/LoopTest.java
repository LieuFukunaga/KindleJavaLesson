import java.util.Scanner;

public class LoopTest {
	
	void whileMethod() {
		Scanner in = new Scanner(System.in);
		System.out.println("パスワードを入力してください");
		String pswd = in.nextLine();		
		
		
		// whileとdo...whileの違いは「条件判定を行うタイミング」
		// 文字列（参照型）同士の比較はStringクラスのequalsメソッドを使う
		while(!pswd.equals("abc")) {
			System.out.println("パスワードが違います。正しいパスワードを入力してください");
			pswd = in.nextLine();
		}
		in.close();
		System.out.println("OK!");		
	}
	
	
	void whileBreakMethod() {
		Scanner input = new Scanner(System.in);
		System.out.println("パスワードを入力してください");
		String inputPswd = input.nextLine();		
		// 条件をtrueにして無限にループさせ、break文で抜け出す書き方
		while (true) {
			if (inputPswd.equals("abc")) {
				System.out.println("OK!");
				break;
			}
			System.out.println("パスワードが違います。正しいパスワードを入力してください");
			inputPswd = input.nextLine();
		}
		input.close();
	}
	
}
