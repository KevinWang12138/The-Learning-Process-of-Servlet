package ServletContextLearning;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 演示在ServletContext中获取数据
 */
public class BServlet extends HttpServlet {
    /**
     * 1.获取ServletContext对象
     * 2.调用其getAttribute函数完成获取数据
     */
    public void doGet(HttpServletRequest req, HttpServletResponse rsp){
        ServletContext application =this.getServletContext();
        String name=(String) application.getAttribute("name");
        System.out.println(name);
    }
}
