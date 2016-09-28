package web.model.logic.command;


import web.model.entity.Player;
import web.model.entity.Team;
import web.model.logic.FullTeamService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GetFullTeamCommand implements Command {




    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Team players = new Team();
        FullTeamService fullTeamService = new FullTeamService();
        fullTeamService.getTeam();
        for (Object p : fullTeamService){
            players.addPlayer((Player)p);
        }
        Player player = new Player();
        request.setAttribute("player",player);
        request.setAttribute("players",players);

        return "view/resultFull.jsp";
    }


}
