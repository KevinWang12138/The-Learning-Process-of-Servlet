package ServletContextLearning;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.Set;

/**
 * 使用servletContext获取资源路径
 */
public class DServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse rsp){
        /**
         * 得到的是有盘符的路径
         */
        String path=this.getServletContext().getRealPath("/index.jsp");
        System.out.println(path);

        /**
         * 获取资源的路径后，再创建输入流对象
         */
        InputStream input=this.getServletContext().getResourceAsStream("/index.jsp");

        /**
         * 获取当前路径下所有资源的路径
         */
        Set<String> paths=this.getServletContext().getResourcePaths("/WEB-INF");
        System.out.println(paths);
    }
}
