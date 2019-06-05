package WebServletS;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Bocai
 * @version V1.0
 * @ClassName: ${file_name}
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @Date ${date} ${time}
 */
@WebServlet("/TestSun")
public class TestSun extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public TestSun() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*String username = "admin";// req.getParameter("username");
        String password = "123";//req.getParameter("password");

        System.out.println("username=" + username);
        System.out.println("password=" + password);

        resp.setContentType("text/html;charset=GB18030");
        // resp.getWriter().println("Login Success!!!");
        resp.getWriter().write("登录成功!!!");*/
        resp.setCharacterEncoding("GBK");
        resp.getWriter().write("登录成功");

    }

}
