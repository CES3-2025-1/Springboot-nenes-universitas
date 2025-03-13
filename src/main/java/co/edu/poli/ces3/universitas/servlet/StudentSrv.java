package co.edu.poli.ces3.universitas.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "studentSrv", value = "/student")
public class StudentSrv extends HttpServlet {

    private int[] numbers;

    @Override
    public void init() throws ServletException {
        System.out.println("StudentSrv init");
        this.numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 10);
        }




        super.init();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("aplication/json");

        for (int x: this.numbers){
            System.out.println("el numero: "+ x);
        }

        PrintWriter out = resp.getWriter();
        String json = "{";


        for (int i = 0; i < numbers.length; i++) {
            json += "\"numero " + i + "\":" + this.numbers[i] + ",";
        }


        json += "}";

        out.println(json);
    out.flush();
    }
}
