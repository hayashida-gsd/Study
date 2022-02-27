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

	protected void doGet(
			HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {

		HumanManager humanManager = new HumanManager();

		ArrayList<Human> list = humanManager.getHumanList();

		request.setAttribute("list", list);

		RequestDispatcher rd =
			request.getRequestDispatcher("output.jsp");

		rd.forward(request, response);
	}
}