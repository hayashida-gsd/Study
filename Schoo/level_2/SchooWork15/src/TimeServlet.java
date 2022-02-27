import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TimeServlet")
public class TimeServlet extends HttpServlet {

	protected void doGet(
		HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		LocalDateTime ldt = LocalDateTime.now();
		request.setAttribute("dateTime", ldt);

		RequestDispatcher rd = request.getRequestDispatcher("output.jsp");
		rd.forward(request, response);
	}
}