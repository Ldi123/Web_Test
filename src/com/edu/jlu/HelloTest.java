package com.edu.jlu;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class HelloTest
 */
@WebServlet("/HelloTest")
public class HelloTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * doGet�����������Ա��ύ������
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
        //�û��ύ��������ҳ����ʾ�û��ύ������
        PrintWriter out = response.getWriter();
        String title = "�û������";
        // ��������
        String name =new String(request.getParameter("firstname").getBytes("ISO8859-1"),"UTF-8");
        String room=new String(request.getParameter("room_and_in").getBytes("ISO8859-1"),"UTF-8");
        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
            "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor=\"#f0f0f0\">\n" +
            "<h1 align=\"center\">" + title + "</h1>\n" +
            "<ul>\n" +
            "  <li><b>����</b>��"
            + name + "\n" +
            "  <li><b>�绰</b>��"
            + request.getParameter("phonenumber") + "\n"+ 
            "  <li><b>����</b>��"
            + request.getParameter("mailnumber") + "\n"+ 
            "  <li><b>IMEI</b>��"
            + request.getParameter("imeinumber") + "\n"+
            "  <li><b>������</b>��"
            + request.getParameter("roomnumber") + "\n"+
            "  <li><b>����</b>��"
            + room + "\n"+
            "</ul>\n" +
            "</body></html>");
        
        //�ڷ������˵Ŀ���̨����û��ύ�������Ϣ
        System.out.println("----------------------");
        System.out.println("username:" + new String(name));
        System.out.println("phone_num:" + new String(request.getParameter("phonenumber").getBytes("iso-8859-1"), "utf-8"));
        System.out.println("e_mail:" + new String(request.getParameter("mailnumber").getBytes("iso-8859-1"), "utf-8"));
        System.out.println("imei_num:" + new String(request.getParameter("imeinumber").getBytes("iso-8859-1"), "utf-8"));
        System.out.println("room_num:" + new String(request.getParameter("roomnumber").getBytes("iso-8859-1"), "utf-8"));
        System.out.println("room&in:" + new String(request.getParameter("room_and_in").getBytes("iso-8859-1"), "utf-8"));
        System.out.println("----------------------");
        System.out.println("���������ɣ��뼰ʱ����!");
        String ss=new String(request.getParameter("phonenumber").getBytes("iso-8859-1"), "utf-8");
        String src="C://Users/ld/Desktop/"+ss+".txt";
        File file_out=new File(src);
		if (!file_out.exists()) {
            file_out.createNewFile();
        }
		  //�������ݵ����ͨ��
        FileOutputStream fileOutputStream = new FileOutputStream(file_out);
        String write_out=title + "\r\n" +
                "������"+ name + "\r\n" +
                "�绰��"+ request.getParameter("phonenumber") + "\r\n"+ 
                "���䣺"+ request.getParameter("mailnumber") + "\r\n"+ 
                "IMEI��"+ request.getParameter("imeinumber") + "\r\n"+
                "��������"+ request.getParameter("roomnumber") + "\r\n"+
                "���ƣ�"+ room + "\r\n";
        fileOutputStream.write(write_out.getBytes());
        fileOutputStream.close();
        
    }
    
    // ���� POST ��������ķ���
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}