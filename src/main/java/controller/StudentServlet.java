package controller;

import model.Student;
import service.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "StudentServlet", value = "/home")
public class StudentServlet extends HttpServlet {
    private static StudentService studentDAO = new StudentService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    private void action(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "creatPost":
                createPost(request, response);
                break;
            case "creatGet":
                createGet(request, response);
                break;
            case "delete" :
                delete(request, response);
                break;
            case "editGet":
                editGet(request, response);
                break;
            case "edit Post":
                editPost(request, response);
                break;
            default:
                display(request, response);
        }
    }
    private void editPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = request.getParameter("address");
        String lop = request.getParameter("lop");
        Double avg = Double.parseDouble(request.getParameter("avg"));

        Student student = new Student(name, age, address, lop, avg);
        studentDAO.updateStudent(student);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("edit.jsp");
        requestDispatcher.forward(request, response);

    }
    // em bị lỗi nhiều quá nên xóa đi ạ
}
