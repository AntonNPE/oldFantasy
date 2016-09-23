package web.model.logic;


import web.model.entity.Player;
import web.model.util.ManagementSystem;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FullTeamService {


    public Collection<Player> getTeam() throws SQLException {
        List<Player> playersList = new ArrayList<>();
        CallableStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = ManagementSystem.getCn().prepareCall("{call getAllTeam()}");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Player gr = new Player();
                gr.setId(rs.getInt(1));
                gr.setName(rs.getString(2));
                gr.setAge(rs.getInt(3));
                gr.setNationality(rs.getString(4));
                gr.setClub(rs.getString(5));
                gr.setPosition(rs.getString(6));
                gr.setPrice(rs.getInt(7));
                playersList.add(gr);
            }
        } catch (SQLException ex) {
            //log
        } finally {
            if (rs != null) {
                rs.close();
            }

            if (stmt != null) {
                stmt.close();
            }

        }
        return playersList;
    }





}
