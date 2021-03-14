package ServletContextLearning;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse rsp){
        /**
         * 1.得到ServletContext
         * 2.调用它getInitParament(String)函数得到初始化参数
         */
        ServletContext application=this.getServletContext();
        String s=application.getInitParameter("context-param1");
        System.out.println(s);
    }
}
