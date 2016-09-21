package web.logic.command;


import model.entity.Player;
import web.logic.AnotherMultiplication;
import web.logic.FullTeamService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;

public class AnotherMultiplicationCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

//        FullTeamService fullTeamService = new FullTeamService();

//        int a = 1;
//        int b = 25;
        String myresult = "My result";
//        Collection <Player> myresult = fullTeamService.getTeam();

        request.setAttribute("myresult", myresult);

        return "view/anotherResultMul.jsp";



    }
}
