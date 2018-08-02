/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import dao.userDao;
import daoImp.userDaoimp;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import entity.user;

@MultipartConfig(maxFileSize = 16177215)
public class usuario extends HttpServlet {

    private userDao us = new userDaoimp();
    private Gson g = new Gson();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession sesion = request.getSession();
        try (PrintWriter out = response.getWriter()) {
            int op = Integer.parseInt(request.getParameter("opc"));
            switch(op){
                case 1:
                    InputStream is =null;
                    String URLImage= "img\\users\\img-"+sesion.getAttribute("iduser")+".jpg";
                    Part file = request.getPart("img");
                    is = file.getInputStream();
                    OutputStream os = new FileOutputStream("C:\\Users\\CRIRI\\OneDrive\\Documenti\\GitHub\\Proyecto-venta\\web\\"+URLImage);
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while((bytesRead = is.read(buffer)) !=-1){
                        os.write(buffer, 0, bytesRead);
                    }
                    is.close();
                    os.flush();
                    os.close();
                    us.addImgPerfil(Integer.parseInt(request.getParameter("idus")), URLImage); 
                    response.sendRedirect("perfil.jsp");
                    
                break;
                case 2:
                    out.print(g.toJson(us.devolveImgPerfil(Integer.parseInt(request.getParameter("idu")))));
                break;
                case 3:
                    out.print(g.toJson(us.DatosUser(Integer.parseInt(request.getParameter("idu")))));
                break;
                case 4:
                    out.print(us.VerificarNomUser(request.getParameter("user")));
                break;
                case 5:
                    user u = new user(Integer.parseInt(request.getParameter("idu")),
                                            request.getParameter("user"),
                                            request.getParameter("pass"),
                                            request.getParameter("dire"),
                                            request.getParameter("ema"),
                                            Integer.parseInt(request.getParameter("cel")));
                                            out.print(us.UpdateUser(u));
                                            
                break;
                case 6:
                    out.print(g.toJson(us.actividades(Integer.parseInt(request.getParameter("idu")))));
                break;
                case 7:
                    out.print(us.verificarPassword(Integer.parseInt(request.getParameter("idu")), request.getParameter("pass")));
                    sesion.setAttribute("estado", 1);
                break;
            }
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
