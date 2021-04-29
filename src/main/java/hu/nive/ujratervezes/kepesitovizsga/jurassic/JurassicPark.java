package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JurassicPark {


    private DataSource dataSource;


    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public List<String> checkOverpopulation () {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement ps = connection.prepareStatement("SELECT breed FROM dinosaur WHERE actual > expected");) {
            return selectNameByPreparedStatement(ps);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not query 1st!", sqle);
        }
    }

    private List<String> selectNameByPreparedStatement(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()) {
            List<String> breed = new ArrayList<>();
            while (rs.next()) {
                String column = rs.getString("breed");
                breed.add(column);
            }
            Collections.sort(breed);
            return breed;
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not query 2nd!", sqle);
        }
    }


}
