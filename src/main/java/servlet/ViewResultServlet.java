package servlet;

import java.io.IOException;
import java.util.List;

import dao.ResultDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Result;

/**
 * Servlet implementation class ViewResultServlet
 */
@WebServlet("/ViewResultServlet")
public class ViewResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ViewResultServlet() {

    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int studentId = Integer.parseInt(request.getParameter("studentId"));

	        List<Result> resultList = new ResultDAO().getResultsByStudentId(studentId);

	        request.setAttribute("results", resultList);
	        request.getRequestDispatcher("pages/view-result.jsp").forward(request, response);
	}

}
