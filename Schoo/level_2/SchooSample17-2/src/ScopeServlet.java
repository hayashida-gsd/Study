import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ScopeServlet")
public class ScopeServlet extends HttpServlet {

	protected void doPost(
		HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// inputで入力された情報を取得
		String input = request.getParameter("input");

		// スコープに情報をセット
		// アプリケーションスコープ
		ServletContext context = getServletContext();
		context.setAttribute("data", input);
		// リクエストスコープ
		request.setAttribute("data", input);
		// セッションスコープ
		HttpSession session = request.getSession();
		session.setAttribute("data", input);

		// output画面を表示
		RequestDispatcher rd =
			request.getRequestDispatcher("output.jsp");

		rd.forward(request, response);
	}
}