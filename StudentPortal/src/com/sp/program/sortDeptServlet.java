package com.sp.program;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sp.comparator.DeptCompare;
import com.sp.comparator.NameCompare;
import com.sp.entity.Student;
import com.sp.util.DaoFactory;

/**
 * Servlet implementation class sortDeptServlet
 */
@WebServlet("/sortDept")
public class sortDeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		 try {
				ArrayList<Student> result = DaoFactory.getStudents();
				DeptCompare a=new DeptCompare();
				Collections.sort(result, a);
				
				request.setAttribute("students", result);

				RequestDispatcher rd = request.getRequestDispatcher("get.jsp");
				rd.forward(request, response);

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

}
