package model;

public class RobotFactory {

	// ロボット作成処理
	public static Robot createRobot(String name) {
		// インスタンス化
		Robot robo = new Robot();
		robo.setName(name);
		// 自己紹介
		robo.introduction();
		// オブジェクトを返却
		return robo;
	}
}