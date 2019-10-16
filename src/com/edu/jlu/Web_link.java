package com.edu.jlu;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Web_link
 */
@WebServlet("/Web_link")
public class Web_link extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Web_link() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see 这种方法是App与服务器直接通信，通过doGet方法得到App发过来的消息
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    String username = request.getParameter("username");
	        String phonenum = request.getParameter("phonenum");
	        String imei = request.getParameter("imei");
	        String room_in = request.getParameter("room_d");
	        System.out.println("----------------------");
	        System.out.println("username:" + new String(username.getBytes("iso-8859-1"), "utf-8"));
	        //System.out.println("username:" + username);
	        System.out.println("phone_num:" +new String( phonenum.getBytes("iso-8859-1"), "utf-8"));
	        System.out.println("imei:" + new String( imei.getBytes("iso-8859-1"), "utf-8"));   
	        System.out.println("Room:" +new String( room_in.getBytes("iso-8859-1"), "utf-8")); 
	        System.out.println("----------------------");
	        response.getOutputStream().write("服务器已收到您的信息".getBytes());	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
