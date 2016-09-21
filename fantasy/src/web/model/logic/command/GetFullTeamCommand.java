package web.model.logic.command;


import web.model.entity.Player;
import web.model.logic.FullTeamService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;


public class GetFullTeamCommand implements Command {



    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        FullTeamService fullTeamService = new FullTeamService();

        Collection<Player> result = fullTeamService.getTeam();

        request.setAttribute("result",result);

        return "view/resultFull.jsp";
    }
}
