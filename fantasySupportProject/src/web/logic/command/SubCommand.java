
package web.logic.command;

import web.logic.SubService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubCommand implements Command{

    public String execute(HttpServletRequest request, HttpServletResponse response) {
        SubService service = new SubService();
        
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        
        int result = service.sub(a, b);
        
        request.setAttribute("result", result);
        
        return "view/resultSub.jsp";
                
    }
   
}
