package ServletExercise;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class Exercise1 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init(ServletConfig servletConfig)");
        //获取所有初始化参数
        System.out.println(servletConfig.getInitParameter("p1"));
        System.out.println(servletConfig.getInitParameter("p2"));
        Enumeration e=servletConfig.getInitParameterNames();
        //获取所有初始化参数名称
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }//他在servlet生命周期开始时调用，只会被执行一次（出生之后）

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig()");
        return null;
    }//用来获取servlet的配置信息

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service(ServletRequest servletRequest, ServletResponse servletResponse)");
    }//他是生命周期方法，会被调用多次，每次处理请求，都是在调用这个方法

    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo()");
        return null;
    }//获取servlet的信息

    @Override
    public void destroy() {
        System.out.println("destroy()");
    }//他会在servlet生命周期结束前调用的方法，只会被执行一次
}
