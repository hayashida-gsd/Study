package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HumanManager {

	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	/**
	 * ユーザ登録機能です.
	 **/
	public void setHuman(String name, String age) {
		try {
			// データベースへの接続処理
			getConnection();

			// SQL文の作成
			String sql = "INSERT INTO user_list(name, age) VALUE (?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, Integer.parseInt(age));

			// データベースにユーザの情報を登録
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースから切断
			try {
				close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ユーザ情報一覧の取得機能です.
	 */
	public ArrayList<Human> getHumanList() {

		ArrayList<Human> list = new ArrayList<Human>();
		try {
			// データベースへの接続処理
			getConnection();

			// SQL文の作成
			String sql = "SELECT * FROM user_list";
			ps = con.prepareStatement(sql);

			// データベースからユーザの情報を取得
			rs = ps.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				Human human = new Human(name, age);
				list.add(human);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースから切断
			try {
				close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	/**
	 * データベースとの接続処理機能です.
	 */
	private void getConnection()
		throws ClassNotFoundException, SQLException {

		if (con == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url  = "jdbc:mysql://localhost/user";
			String user = "root";
			String password = "";

			con = DriverManager.getConnection(url, user, password);
		}
	}

	/**
	 * データベースとの切断処理機能です.
	 */
	private void close() throws SQLException {
		if (con != null) {
			con.close();
		}
		if (ps != null) {
			ps.close();
		}
		if (rs != null) {
			rs.close();
		}
	}
}