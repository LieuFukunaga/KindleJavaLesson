public class KindleSample {
	private String sampleText;
	private int sampleNumber;
	
	// ゲッター、セッター
	public String getSampleText() {
		return sampleText;
	}
	public void setSampleText(String sampleText) {
		this.sampleText = sampleText;
	}
	public int getSampleNumber() {
		return sampleNumber;
	}
	public void setSampleNumber(int sampleNumber) {
		this.sampleNumber = sampleNumber;
	}
	
	// インスタンスメソッド
	public void sayHello() {
		System.out.println("Hello");
	}
}
