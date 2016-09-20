package model.logic;


import model.logic.command.Command;
import model.logic.command.GetFullTeamCommand;

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
