package controller;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Human;
import model.HumanManager;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {

	protected void doPost(
		HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// inputで入力された情報を取得
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String age  = request.getParameter("age");

		// セッションスコープを取得
		HttpSession session = request.getSession();
		// セッションからユーザ一覧を取得
		ArrayList<Human> humanList =
				(ArrayList<Human>)session.getAttribute("list");

		// モデルに一覧追加処理を指示
		HumanManager humanManager = new HumanManager();
		humanList = humanManager.getHumanList(humanList, name, age);

		// セッションに設定
		session.setAttribute("list", humanList);

		// output画面を表示
		RequestDispatcher rd =
			request.getRequestDispatcher("output.jsp");

		rd.forward(request, response);
	}

	protected void doGet(
		HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// セッションスコープを破棄
		HttpSession session = request.getSession();
		session.invalidate();

		// output画面を表示
		RequestDispatcher rd =
			request.getRequestDispatcher("output.jsp");

		rd.forward(request, response);
	}
}