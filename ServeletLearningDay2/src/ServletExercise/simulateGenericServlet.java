package ServletExercise;

import javax.servlet.*;
import java.io.IOException;

/**
 * 创建一个class来模拟GenericServlet
 */
public class simulateGenericServlet implements Servlet {
    /**
     * 需要就写，不需要就不写
     */
    private ServletConfig config;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config=servletConfig;//把servlet传递进来的config传给本地的一个成员变量，方便其他函数进行操作
        init();
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }

    /**
     * 对GenericServlet的函数进行模拟
     */
    public ServletContext getServletContext(){
        return config.getServletContext();
    }
    public String getServletName(){
        return config.getServletName();
    }
    public String getInitParameter(String name){
        return config.getInitParameter(name);
    }
    public void init(){

    }
}
