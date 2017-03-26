package com.java.lumr.pet.servlet;

import com.java.lumr.pet.dao.PetDAO;
import com.java.lumr.pet.dao.impl.PetDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by lumr on 2017/3/26.
 */
public class SelectBreedServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PetDAO petDAO = new PetDAOImpl();
        System.out.println("获取宠物种类");
        List<String> list = petDAO.getPetBreed();
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.write("<option value='null'>----</option>");
        out.write("<option value='null'>--请选择--</option>");
        for (String aList : list) {
            out.write("<option value=" + aList + ">"+aList+"</option>");
        }
        out.flush();
        out.close();
    }
}
