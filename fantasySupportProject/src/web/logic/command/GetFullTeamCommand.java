package web.logic.command;


import model.entity.Player;
import web.logic.FullTeamService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public class GetFullTeamCommand implements Command{


        @Override
        public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

            FullTeamService fullTeamService = new FullTeamService();


            Collection <Player> myresult = fullTeamService.getTeam();

            request.setAttribute("myresult", myresult);

            return "view/resultFull.jsp";



        }

}
