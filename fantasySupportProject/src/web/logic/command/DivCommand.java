
package web.logic.command;

import web.logic.DivService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DivCommand implements Command{

    public String execute(HttpServletRequest request, HttpServletResponse response) {
        DivService service = new DivService();
        
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        
        int result = service.div(a, b);
        
        request.setAttribute("result", result);
        
        return "view/resultDiv.jsp";
                
    }
   
}
