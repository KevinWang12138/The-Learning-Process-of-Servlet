package ServletContextLearning;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 演示向servletContext中保存数据
 *
 */
public class AServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse rsp){
        /**
         * 1.获取servletContext对象
         * 2.调用setAttribute()方法完成数据保存
         */
        ServletContext application =this.getServletContext();
        application.setAttribute("name","张三");

    }
}
