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

import com.sp.comparator.NameCompare;
import com.sp.entity.Student;
import com.sp.util.DaoFactory;

@WebServlet("/sortName")
public class sortNameServlet extends HttpServlet {
 public void doGet(HttpServletRequest request, HttpServletResponse response) {
	 try {
			ArrayList<Student> result = DaoFactory.getStudents();
			NameCompare a=new NameCompare();
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


