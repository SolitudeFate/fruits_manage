package servlets;

import dao.FruitDAO;
import dao.FruitDAOImpl;
import pojo.FruitBean;
import springMVC.ViewBaseServlet;
import util.StringUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EditServlet", value = "/edit.do")
public class EditServlet extends ViewBaseServlet {

    private FruitDAO fruitDAO = new FruitDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr = request.getParameter("id");
        if(StringUtil.isNotEmpty(idStr)){
            int id = Integer.parseInt(idStr);
            FruitBean fruitBean = fruitDAO.getFruitById(id);
            request.setAttribute("fruit",fruitBean);
            super.processTemplate("edit",request,response);
        }

    }

}
