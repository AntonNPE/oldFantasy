
package web.logic.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmptyCommand implements Command{

    public String execute(HttpServletRequest request, HttpServletResponse response) {
       return "view/error.jsp";
    }
    
}
