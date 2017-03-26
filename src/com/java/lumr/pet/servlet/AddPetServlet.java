package com.java.lumr.pet.servlet;

import com.java.lumr.pet.dao.PetDAO;
import com.java.lumr.pet.dao.impl.PetDAOImpl;
import com.java.lumr.pet.vo.Pet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

/**null
 * Created by lumr on 2017/3/26.
 */
public class AddPetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String breed = request.getParameter("breed");
        String sex = request.getParameter("sex");
        Date birthday = Date.valueOf(request.getParameter("birthday"));
        String description = request.getParameter("description");
        Pet pet = new Pet(0, name, breed, sex, birthday, description);
        PetDAO petDAO = new PetDAOImpl();
        int result = petDAO.addPet(pet);
        if (result > 0) {
//            System.out.println("添加成功");
            request.setAttribute("result", "添加成功");
            request.getRequestDispatcher("/result.jsp").forward(request, response);
        } else {
//            System.out.println("添加失败");
            request.setAttribute("result", "添加成功");
            request.getRequestDispatcher("/result.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
