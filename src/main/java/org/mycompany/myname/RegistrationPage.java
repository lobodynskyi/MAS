package org.mycompany.myname;

import Controler.MyConection;
import Models.Klient;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;


@WebServlet(
        name = "name4",
        urlPatterns = "/registration"
)
public class RegistrationPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("./html/registrationPage.html");
        view.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Klient klient = new Klient(req.getParameter("name"),req.getParameter("surrname"),Integer.valueOf(req.getParameter("nrTelefonu")),req.getParameter("email"),req.getParameter("pesel"), LocalDate.parse(req.getParameter("birthday")),req.getParameter("password1"));
        MyConection.saveData(klient);
        RequestDispatcher view = req.getRequestDispatcher("./html/loginPage.html");
        view.forward(req,resp);
    }
}
