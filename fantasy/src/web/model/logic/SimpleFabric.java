package web.model.logic;


import web.model.logic.command.*;


public class SimpleFabric {


    public static Command createCommand(String type) {

        switch (type) {

            case "fullTeam":
                return new GetFullTeamCommand();
            case "teamCreate":
                return new TeamCreateCommand();
            case "fullTeamCreate":
                return new FullTeamCreateCommand();
            case "tempCommand":
                return new TempCommand();
            case "addCommand":
                return new AddPlayerCommand();
            case "subCommand":
                return new SubCommand();
            default:
                return new GetFullTeamCommand();
        }

    }

}
