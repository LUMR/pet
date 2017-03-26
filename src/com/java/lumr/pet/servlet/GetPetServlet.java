package com.java.lumr.pet.servlet;

import com.java.lumr.pet.dao.PetDAO;
import com.java.lumr.pet.dao.impl.PetDAOImpl;
import com.java.lumr.pet.vo.Pet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**null
 * Created by lumr on 2017/3/26.
 */
public class GetPetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String breed = request.getParameter("breed");
        System.out.println(breed);
        PetDAO petDAO = new PetDAOImpl();
        List<Pet> list = new ArrayList<>();
        if (breed != null) {
            if (breed.equals("null")) {
                list = petDAO.getAllPet();
            }else {
                list = petDAO.getAllPet(breed);
            }
        }
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        for (Pet aList : list) {
            out.write("<tr>");
            out.write("<td>" + aList.getName() + "</td>");
            out.write("<td>" + aList.getBrithday() + "</td>");
            out.write("<td>" + aList.getSex() + "</td>");
            out.write("</tr>");
        }
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
