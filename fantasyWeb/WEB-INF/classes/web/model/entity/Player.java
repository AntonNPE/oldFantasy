package web.model.entity;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Player  {

    private int id;
    private String name;
    private int age;
    private String nationality;
    private String club;
    private String position;
    private int price;

    public Player() {
    }

    public Player(ResultSet rs) throws SQLException {
        setId(rs.getInt(1));
        setName(rs.getString(2));
        setAge(rs.getInt(3));
        setNationality(rs.getString(4));
        setClub(rs.getString(6));
        setPosition(rs.getString(7));
        setPrice(rs.getInt(8));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}