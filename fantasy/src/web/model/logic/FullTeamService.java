package web.model.logic;


import web.model.entity.Player;
import web.model.util.ManagementSystem;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FullTeamService {

    private Set<Player> playerSet;
    private CallableStatement stmt;
    private ResultSet rs;

    public FullTeamService() {
        playerSet = new LinkedHashSet<>();
    }

    public FullTeamService(LinkedHashSet<Player> playersList) {
        this.playerSet = playersList;
    }

    public Set<Player> getPlayerSet() {
        return playerSet = new LinkedHashSet<>();
    }

    public void setPlayerSet(LinkedHashSet<Player> playerSet) {
        this.playerSet = playerSet;
    }


    public Set<Player> fillPlayersList(ResultSet rs) throws SQLException {
        Set<Player> set = new LinkedHashSet<>();
        try {
            while (rs.next()) {
                Player gr = new Player();
                gr.setId(rs.getInt(1));
                gr.setName(rs.getString(2));
                gr.setAge(rs.getInt(3));
                gr.setNationality(rs.getString(4));
                gr.setClub(rs.getString(5));
                gr.setPosition(rs.getString(6));
                gr.setPrice(rs.getInt(7));
                set.add(gr);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            if (rs != null) {
                rs.close();
            }
        }

        return set;
    }

    public Set<Player> getAllPlayers() throws SQLException {
        stmt = ManagementSystem.getCn().prepareCall("{call getAllPlayers()}");
        rs = stmt.executeQuery();
        playerSet = fillPlayersList(rs);
        return playerSet;
    }

    public Set<Player> getSortedTeam(String club, String position, String price) throws SQLException {

        int priceAmount = 0;
        if (!price.equals("none")) {
            priceAmount = Integer.parseInt(price);
        }
        FullTeamService fullTeamService = new FullTeamService();
        Set<Player> players = fullTeamService.getAllPlayers();
        for (Player player : players) {
            if ((player.getClub().equals(club) || club.equals("none")) & (player.getPosition().equals(position)
                    || position.equals("none")) & (player.getPrice() == priceAmount || price.equals("none"))) {
                playerSet.add(player);
            }
        }
        return playerSet;
    }

    private boolean isTeamExist(String teamName) {
        Set<String> teamSet = new HashSet<>();
        ResultSet rs;
        CallableStatement stmt;
        try {
            stmt = ManagementSystem.getCn().prepareCall("{call getTeamList()}");
            rs = stmt.executeQuery();
            while (rs.next()) {
                teamSet.add(rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return teamSet.contains(teamName);
    }

    public Set<Player> getPlayersByTeamName(String teamName) {
        try {
            if (isTeamExist(teamName)) {

                stmt = ManagementSystem.getCn().prepareCall("{call getPlayersFromTeam(?)}");
                stmt.setString(1, teamName);
                rs = stmt.executeQuery();
                playerSet = fillPlayersList(rs);
            } else {
                stmt = ManagementSystem.getCn().prepareCall("{call createNewTable(?)}");
                stmt.setString(1, teamName);
                rs = stmt.executeQuery();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return playerSet;
    }

    public Player getPlayerById(int playerId) throws SQLException {

        Player player = new Player();
        stmt = ManagementSystem.getCn().prepareCall("{call getPlayerById(?)}");
        stmt.setInt(1, playerId);
        rs = stmt.executeQuery();
        while (rs.next()) {

            player.setId(rs.getInt(1));
            player.setName(rs.getString(2));
            player.setAge(rs.getInt(3));
            player.setNationality(rs.getString(4));
            player.setClub(rs.getString(5));
            player.setPosition(rs.getString(6));
            player.setPrice(rs.getInt(7));
        }
        return player;
    }

    public void setPlayerInTeam(String teamName, int playerId) throws SQLException {


        stmt = ManagementSystem.getCn().prepareCall("{call setPlayerInTeam(?,?)}");
        stmt.setString(1, teamName);
        stmt.setInt(2, playerId);
        stmt.executeUpdate();
    }

    public void removePlayerById (String teamName, int playerId) throws SQLException {

        stmt = ManagementSystem.getCn().prepareCall("{call subPlayerFromTeam(?,?)}");
        stmt.setString(1, teamName);
        stmt.setInt(2, playerId);
        stmt.executeUpdate();
    }


//    public static void main(String[] args) throws Exception {
//
//        CallableStatement stmt;
//        ResultSet rs;
//        FullTeamService fullTeamService1 = new FullTeamService();
//        stmt = ManagementSystem.getCn().prepareCall("{call getPlayersFromTeam(?)}");
//        stmt.setString(1, "common");
//        rs = stmt.executeQuery();
//        Set <Player> set = fullTeamService1.fillPlayersList(rs);
//        set.forEach(System.out::println);
//
//
//    }
}

