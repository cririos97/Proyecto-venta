/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.userDao;
import daoImp.userDaoimp;
import entity.user;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author CRIRI
 */
public class login extends HttpServlet {

    private userDao ud = new userDaoimp();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String user;
            String pass;
            user ses;
            if(request.getParameter("btn-login")!=null){
                user=request.getParameter("user");
                pass=request.getParameter("pass");
                ses=ud.validar(user, pass);
                int rol = (Integer)ses.getRolId();
                HttpSession sesion = request.getSession();
                sesion.setMaxInactiveInterval(300);
                if(rol!=0){
                        if(rol==1){
                             sesion.setAttribute("rol", rol);
                             String nombres= (String) ses.getNombre()+" "+ses.getApellidos();
                             sesion.setAttribute("nombreCom", nombres);
                             sesion.setAttribute("nombre", ses.getNombre());
                             sesion.setAttribute("apellido", ses.getApellidos());
                             sesion.setAttribute("iduser", ses.getUsuId());
                             sesion.setAttribute("user", ses.getUser());
                             sesion.setAttribute("nomRol", ses.getNomRol());
                             sesion.setAttribute("estado", 1);
                             response.sendRedirect("main.jsp");
                       }
               }
                else{
                    response.sendRedirect("login.jsp");
                }
                
            }
         //   rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
