package web.model.logic.command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Shuric on 22.09.2016.
 */
public class FullTeamCreateCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String name = request.getParameter("teamName");
        String team = request.getParameter("teamChoice");
        request.setAttribute("name",name);
        request.setAttribute("teamChoice",team);

        return "view/teamCreate/FullTeamPage";
    }
}
