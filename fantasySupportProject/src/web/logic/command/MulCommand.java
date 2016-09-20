
package web.logic.command;

import web.logic.MulService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MulCommand implements Command{

    public String execute(HttpServletRequest request, HttpServletResponse response) {
        MulService service = new MulService();
        
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        
        int result = service.mul(a, b);
        
        request.setAttribute("result", result);
        
        return "view/resultMul.jsp";
                
    }
   
}
