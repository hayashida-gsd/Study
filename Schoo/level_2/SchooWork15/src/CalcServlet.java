import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {

	protected void doPost(
		HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");

		int iNum1 = Integer.parseInt(num1);
		int iNum2 = Integer.parseInt(num2);
		int iNum3 = iNum1 + iNum2;

		request.setAttribute("answer", iNum3);

		RequestDispatcher rd = request.getRequestDispatcher("output2.jsp");
		rd.forward(request, response);
	}
}