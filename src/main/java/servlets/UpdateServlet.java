package servlets;

import dao.FruitDAO;
import dao.FruitDAOImpl;
import pojo.FruitBean;
import springMVC.ViewBaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateServlet", value = "/update.do")
public class UpdateServlet extends ViewBaseServlet {

    FruitDAO fruitDAO = new FruitDAOImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String idStr = request.getParameter("id");
        int id = Integer.parseInt(idStr);

        String name = request.getParameter("name");

        String priceStr = request.getParameter("price");
        int price = Integer.parseInt(priceStr);

        String numStr = request.getParameter("num");
        int num = Integer.parseInt(numStr);

        fruitDAO.updateFruit(new FruitBean(id,name,price,num));

        response.sendRedirect("IndexServlet");
    }
}
