package web.model.logic.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TeamCreateCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String teamName = request.getParameter("teamName");

        request.setAttribute("teamName",teamName);

        return "view/teamCreate/TeamName.jsp";

    }
}
