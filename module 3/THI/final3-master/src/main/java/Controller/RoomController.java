package Controller;

import Model.Request.RoomRequest;
import Service.IMPL.RoomService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "roomController", urlPatterns = {"/rooms/*"})
public class RoomController extends HttpServlet {
    private RoomService roomService;
    @Override
    public void init() throws ServletException {
        roomService = new RoomService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getPathInfo();
        switch (url) {
            case "/":
                RoomRequest request = new RoomRequest(Long.valueOf(req.getParameter("id")), req.getParameter("customerName"), req.getParameter("phoneNumber"));
                req.setAttribute("roomList", roomService.findAll(request));
                req.getRequestDispatcher("/views/RoomHomePage.jsp").forward(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
