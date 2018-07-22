/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.userDao;
import daoImp.userDaoimp;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
            RequestDispatcher rd = null;
            String user;
            String pass;
            int rol;
            if(request.getParameter("btn-login")!=null){
                user=request.getParameter("user");
                pass=request.getParameter("pass");
                rol=ud.validar(user, pass).getRolId();
   
                request.setAttribute("rol", rol);
                request.setAttribute("nombre",ud.validar(user, pass).getNombre());
                request.setAttribute("apellido",ud.validar(user, pass).getApellidos());
                request.setAttribute("iduser", ud.validar(user, pass).getUsuId());
                request.setAttribute("user", ud.validar(user, pass).getUser());
                request.setAttribute("nomRol", ud.validar(user, pass).getNomRol());
                rd=request.getRequestDispatcher("login.jsp");
                
            }
            rd.forward(request, response);
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