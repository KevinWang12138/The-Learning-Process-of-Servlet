package ServletExercise;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpExercise extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("doGet()");
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("doPost()");
    }
}
