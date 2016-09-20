
package web.logic.command;

import web.logic.NewService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        NewService service = new NewService();

        int a = Integer.parseInt(request.getParameter("a"));

        int result = service.power(a);

        request.setAttribute("result", result);

        return "view/resultNew.jsp";

    }

}
