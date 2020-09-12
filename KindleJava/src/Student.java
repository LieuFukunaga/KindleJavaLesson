
public class Student {
	// フィールド
	String name;
	int score;
	// 定数
	static final int MAX_SCORE = 100;

	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	// this 省略
	void printScore() {
		System.out.println(name + " さんの点数は " + score + " 点です。");
	}
	
	// getter
	// 「戻り値」あり
	// this 省略
	int getScore() {
		return score;
	}
	
	// setter
	// this 省略
	void setScore(int newScore) {
		score = newScore;
	}
	
	
	// オーバーロード
	void overloadTest() {
		System.out.println("同名メソッド（引数なし）");
	}
	
	void overloadTest(String str) {
		System.out.println("同名メソッド" + str);
	}
}
