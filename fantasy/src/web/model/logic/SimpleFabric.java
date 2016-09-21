package web.model.logic;


import web.model.logic.command.*;


public class SimpleFabric {


    public static Command createCommand(String type) {

        switch (type) {

            case "fullTeam":
                return new GetFullTeamCommand();

            default:
                return new GetFullTeamCommand();
        }

    }

}
