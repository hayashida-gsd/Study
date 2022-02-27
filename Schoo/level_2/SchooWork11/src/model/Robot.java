package model;
// ロボットの役割
public class Robot {
	// 名前
	private String name;

	// アクセッサメソッド
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// 自己紹介メソッド
	public void introduction() {
		System.out.println("ワタシハ" + name + "デス・・・");
	}
}