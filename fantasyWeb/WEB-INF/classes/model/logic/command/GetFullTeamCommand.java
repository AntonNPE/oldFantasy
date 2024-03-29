package model.logic.command;


import model.entity.Player;
import model.logic.FullTeamService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class GetFullTeamCommand implements Command {

    private List <Player> players;
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)  {

        FullTeamService fullTeamService = new FullTeamService();

        try {
             players = fullTeamService.getTeam();
        } catch (SQLException ex){
            //log4j
        }
        String name = "lopka";
        request.setAttribute("Team",name);

        return "view/resultFull";
    }
}
