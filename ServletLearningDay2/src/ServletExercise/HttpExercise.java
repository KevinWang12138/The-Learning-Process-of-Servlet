package ServletExercise;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpExercise extends HttpServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig){
        System.out.println("Hello!");
    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("doGet()");
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("doPost()");
    }
}
