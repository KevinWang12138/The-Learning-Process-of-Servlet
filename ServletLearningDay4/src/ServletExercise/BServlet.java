package ServletExercise;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse rsp)throws ServletException, IOException {
        /**
         * 获取参数用来识别用户想要请求的方法
         */
        String MethodName=req.getParameter("method");
        if(MethodName==null||MethodName.trim().isEmpty()){
            throw new RuntimeException("您没有调用method方法，无法确定您想要的方法");
        }
        Class c=this.getClass();
        Method method=null;
        try {
            method = c.getMethod(MethodName,HttpServletRequest.class,HttpServletResponse.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("您调用的方法不存在");
        }
        /**
         * 调用method表示的方法
         */
        try {
            method.invoke(this,req,rsp);
        } catch (Exception e) {
            System.out.println("您调用的"+MethodName+"函数内部出现了异常");
            new RuntimeException(e);
        }
    }
    public void addUser(HttpServletRequest req, HttpServletResponse rsp)throws ServletException, IOException {
        System.out.println("addUser");
    }
    public void editUser(HttpServletRequest req, HttpServletResponse rsp)throws ServletException, IOException {
        System.out.println("editUser");
    }
    public void deleteUser(HttpServletRequest req, HttpServletResponse rsp)throws ServletException, IOException {
        System.out.println("deleteUser");
    }
}
