package servlets;

import dao.FruitDAO;
import dao.FruitDAOImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DelServlet", value = "/del.do")
public class DelServlet extends HttpServlet {
    private FruitDAO fruitDAO = new FruitDAOImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr = request.getParameter("id");
        int id = Integer.parseInt(idStr);
        fruitDAO.delFruit(id);
        response.sendRedirect("IndexServlet");
    }
}
