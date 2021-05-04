package com.dei;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dbtest.TestD;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String sms = "Hello this is my first webApplication";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Test() {
		super();
		// TODO Auto-generated constructor stub

	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init calling... only 1");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("All things done...");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	/*
	 * protected void service(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * System.out.println("inside service methord..."); }
	 * 
	 * 
	 *//**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// service(request, response);
		// String name= request.getParameter(("Name"));
		// String address= request.getParameter(("Address"));
		// String age= request.getParameter(("Age"));

		// System.out.println("Name"+name +"Address"+address +"Age"+age );
		// service(request, response);
		String name = request.getParameter(("name"));
		String age = request.getParameter(("age"));
		String email = request.getParameter(("email"));
		String phone = request.getParameter(("phone"));
		String state = request.getParameter(("state"));
		String district = request.getParameter(("district"));
		String address1 = request.getParameter(("address1"));
		String address2 = request.getParameter(("address2"));
		
		new TestD(name,age,email,phone,state,district,address1,address2);

		//System.out.println("Name" + name + "Age" + age + "E-Mail" + email + "Phone" + phone + "State" + state
				//+ "District" + district + "Address To" + address1 + "From Address" + address2);

		response.getWriter()
				.append("Name:" + name + " Age:" + age + " E-Mail:" + email + " Phone:" + phone + " State:" + state
						+ " District:" + district + " Address To:" + address1 + " From Address:" + address2 + sms)
				.append(request.getContextPath());
		// response.getWriter().append("This is Name :"+name +" Address :"+address+" Age
		// :"+age + sms).append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

}
