
public class Student {
	// フィールド
	String name;
	int score;
	// 定数
	static final int MAX_SCORE = 100;

	
	Student(String name) {
		this.name = name;
	}
	
	Student(String name, int score) {
		this(name);
		this.score = score;
	}
	
	
	/**
	 * <h1>Javadoc 練習用コメント</h1>
	 * <ul>
	 * <li>Getter</li>
	 * <li>引数なし</li>
	 * <li>this 省略</li>
	 * </ul>
	 * @author LieuFukunaga
	 * @return Studentクラスのインスタンスが持つnameフィールド
	 */
	String getName() {
		return name;
	}
	
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
