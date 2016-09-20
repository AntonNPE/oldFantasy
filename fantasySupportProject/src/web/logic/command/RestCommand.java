
package web.logic.command;

import web.logic.RestService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RestCommand implements Command{

    public String execute(HttpServletRequest request, HttpServletResponse response) {
        RestService service = new RestService();
        
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        
        int result = service.rest(a, b);
        
        request.setAttribute("result", result);
        
        return "view/resultRest.jsp";
                
    }
   
}
