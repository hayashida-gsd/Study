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

	public ArrayList<Human> getHumanList() {

		ArrayList<Human> list = new ArrayList<Human>();
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url  = "jdbc:mysql://localhost/user";
			String user = "root";
			String password = "";

			con = DriverManager.getConnection(url, user, password);

			String sql = "SELECT * FROM user_list";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {

				String name = rs.getString("name");
				int age = rs.getInt("age");
				Human human = new Human(name, age);
				list.add(human);
			}

			close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

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
