package com.WUT.RW.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/YongHu")
public class YongHu extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String method=request.getParameter("method");
	switch(method) {
	case"listAll":
	{
		
	}
	case"add":
	{
		
	}
	case"delete":
	{
		
	}
	case"update":
	{
		
	}
	}
	}
}
