package web.model.logic.command;


import web.model.entity.Player;
import web.model.logic.FullTeamService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class GetFullTeamCommand implements Command {

    private List <Player> players = null;

    public String execute(HttpServletRequest request, HttpServletResponse response)  {

        FullTeamService fullTeamService = new FullTeamService();

        /*try {
             players = fullTeamService.getTeam();
        } catch (SQLException ex){
            //log4j
        }
*/
        String name = "Ignat";
        request.setAttribute("Team",name);

        return "view/resultFull";
    }
}
