package servlets;

import dao.FruitDAO;
import dao.FruitDAOImpl;
import pojo.FruitBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddServlet", value = "/add.do")
public class AddServlet extends HttpServlet {
    private FruitDAO fruitDAO = new FruitDAOImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String name = request.getParameter("name");

        String priceStr = request.getParameter("price");
        int price = Integer.parseInt(priceStr);

        String numStr = request.getParameter("num");
        int num = Integer.parseInt(numStr);

        FruitBean fruitBean = new FruitBean(0,name,price,num);

        fruitDAO.addFruit(fruitBean);

        response.sendRedirect("IndexServlet");
    }
}
