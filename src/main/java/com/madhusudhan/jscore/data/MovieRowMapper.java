package com.madhusudhan.jscore.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class MovieRowMapper implements RowMapper {

    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Movie movie = new Movie();

        movie.setID(rs.getString("id"));
        movie.setTitle(rs.getString("title"));
        movie.setStars(rs.getString("stars"));
        movie.setReleaseDate(rs.getDate("release_date"));

        return movie;
    }
}