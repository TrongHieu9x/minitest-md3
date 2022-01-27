package controller;

import model.Product;
import service.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CityServlet", urlPatterns = "/cities")
public class ProductServlet extends HttpServlet {
    private final ProductService cityService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        action(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        action(request, response);
    }

    private void action(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "all";
        }
        switch (action) {
            case "createGet":
                createGet(request, response);
                break;
            case "createPost":
                createPost(request, response);
                break;
            case "sortIncrease":
                sortProductAscending(request, response);
                break;
            case "sortDecrease":
                sortProductDescending(request, response);
                break;
            case"delete":
                deleteProduct(request,response);
            default:
                displayAllProduct(request, response);
        }
    }

    private void sortProductAscending(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Product> products = ProductService.sortProductAscending();
        request.setAttribute("products", products);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view.jsp");
        requestDispatcher.forward(request, response);
    }

    private void sortProductDescending(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object productService;
        ArrayList<Product> products = ProductService.sortProductDescending();
        request.setAttribute("products", products);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view.jsp");
        requestDispatcher.forward(request, response);
    }
}
