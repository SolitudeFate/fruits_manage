package servlets;

import dao.FruitDAO;
import dao.FruitDAOImpl;
import pojo.FruitBean;
import springMVC.ViewBaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "IndexServlet", value = "/IndexServlet")
public class IndexServlet extends ViewBaseServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FruitDAO fruitDAO = new FruitDAOImpl();
        List<FruitBean> fruitList = fruitDAO.getFruitList();
        HttpSession session = request.getSession();
        session.setAttribute("fruitList",fruitList);

        super.processTemplate("index",request,response);
    }
}
