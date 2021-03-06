import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InputServlet2")
public class InputServlet2 extends HttpServlet {

	protected void doPost(
			HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");

		request.setAttribute("name", name);

		RequestDispatcher rd =
				request.getRequestDispatcher("output2.jsp");

		rd.forward(request, response);
	}
}
