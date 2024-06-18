package board.controllers;

import board.entities.BoardData;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/board/view")
public class BoardViewController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        BoardData board = (BoardData)session.getAttribute("board");
        String title = (String)session.getAttribute("title");

        System.out.println(board);
        System.out.println(title);
    }
}
