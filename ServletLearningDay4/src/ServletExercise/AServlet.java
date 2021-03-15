package ServletExercise;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 在这里给出多个请求处理方法
 * 请求处理方法：除了名称意外从，其他都和service相同
 */
public class AServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse rsp)throws ServletException, IOException {
        /**
         * 获取参数用来识别用户想要请求的方法
         */
        String MethodName=req.getParameter("method");
        if(MethodName.equals("addUser")){
            addUser(req,rsp);
        }
        else if(MethodName.equals("editUser")){
            editUser(req,rsp);
        }
        else if(MethodName.equals("deleteUser")){
            deleteUser(req,rsp);
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
