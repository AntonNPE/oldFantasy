
package web.logic;

import web.logic.command.*;


public class SimpleFabric {

    public static Command createCommand(String type) {
        switch (type) {
            case "sum":
                return new SumCommand();
            case "sub":
                return new SubCommand();
            case "mul":
                return new MulCommand();
            case "div":
                return new DivCommand();
            case "rest":
                return new RestCommand();
            case "new":
                return new NewCommand();
            case "fullTeam":
                return new GetFullTeamCommand();
            case "anotherMul":
                return new AnotherMultiplicationCommand();
            default:
                return new EmptyCommand();
        }
    }
}
