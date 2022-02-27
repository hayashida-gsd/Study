package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Human;
import model.HumanManager;

@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {

	/**
	 * ユーザ登録処理機能です.
	 */
	protected void doPost(
		HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// リクエストから氏名と年齢の情報を取得
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String age  = request.getParameter("age");

		// モデルへユーザ登録処理を指示
		HumanManager manage = new HumanManager();
		manage.setHuman(name, age);

		// ビューへ結果画面の表示を指示
		RequestDispatcher rd =
			request.getRequestDispatcher("output.jsp");

		rd.forward(request, response);
	}

	/**
	 * ユーザ一覧表示処理機能です.
	 */
	protected void doGet(
		HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// モデルにユーザ情報の取得を指示
		HumanManager humanManager = new HumanManager();
		ArrayList<Human> list = humanManager.getHumanList();

		// ビューにユーザ情報をセットしたあと表示を指示
		request.setAttribute("list", list);

		RequestDispatcher rd =
			request.getRequestDispatcher("list.jsp");

		rd.forward(request, response);
	}
}