package servlet;

import java.io.IOException;

import dao.ResultDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Result;

/**
 * Servlet implementation class AddResultServlet
 */
@WebServlet("/AddResultServlet")
public class AddResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddResultServlet() {
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int studentId = Integer.parseInt(request.getParameter("studentId"));
        String subject = request.getParameter("subject");
        int marks = Integer.parseInt(request.getParameter("marks"));

        Result result = new Result();
        result.setStudentId(studentId);
        result.setSubject(subject);
        result.setMarks(marks);

        boolean status = new ResultDAO().addResult(result);

        if (status) {
            response.sendRedirect("pages/success.jsp");
        } else {
            response.sendRedirect("pages/error.jsp");
        }
	}

}
