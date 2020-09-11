
public class Student {
	// フィールド
	String name;
	int score;
	// 定数
	static final int MAX_SCORE = 100;

	// インスタンスメソッド
	void setScore(int newScore) {
		score = newScore;
	}
	
	void printScore() {
		System.out.println(name + " さんの点数は " + score + " 点です。");
	}
	
	// 「戻り値」あり
	int getScore() {
		return score;
	}
}
