
package web.logic.command;

import web.logic.SumService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SumCommand implements Command{

    public String execute(HttpServletRequest request, HttpServletResponse response) {
        SumService service = new SumService();
        
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        
        int result = service.sum(a, b);
        
        request.setAttribute("result", result);
        
        return "view/resultSum.jsp";
                
    }
   
}
