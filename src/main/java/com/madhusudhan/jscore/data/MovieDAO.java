package com.madhusudhan.jscore.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

public class MovieDAO implements IMovieDAO {

    private JdbcTemplate jdbcTemplate = null;

    @Override
    public Movie getMovie(String id) {
        String sql = "select * from MOVIES where id=?";
        return (Movie) getJdbcTemplate().queryForObject(sql, new Object[]{id},
                new MovieRowMapper());
    }
    
    
    public Movie getMovieUsingRowMapper(String id) {
        String sql = "select * from MOVIES where id=?";
        return (Movie) getJdbcTemplate().queryForObject(sql, new RowMapper() {

            public Object mapRow(ResultSet rs, int i) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }

    @Override
    public String getStars(String title) {
        String stars = getJdbcTemplate().queryForObject(
                "select stars from MOVIES where title= '" + title + "'",
                String.class);
        System.out.println("Stars: " + stars);

        // using where clause
        stars = getJdbcTemplate().queryForObject(
                "select stars from MOVIES where title=?",
                new Object[]{title}, String.class);

        return stars;

    }

    @Override
    public List<Movie> getMovies(String sql) {
        return null;
    }

    @Override
    public List<Movie> getAllMovies() {
        RowMapper mapper = new MovieRowMapper();
        String sql = "select * from MOVIES";
        return (List<Movie>) getJdbcTemplate().query(sql,
                new RowMapperResultSetExtractor(mapper, 10));
    }

    @Override
    public void insertMovie(Movie m) {
        String sql = "insert into MOVIES (ID, TITLE, GENRE, SYNOPSIS) values(?,?,?,?)";

        // The insert parameters
        Object[] params = new Object[]{m.getID(), m.getTitle(), m.getGenre(),
            m.getSynopsis()};

        // The insert parameters types
        int[] types = new int[]{Types.VARCHAR, Types.VARCHAR, Types.VARCHAR,
            Types.VARCHAR};
        // Run the query
        jdbcTemplate.update(sql, params, types);
    }

    @Override
    public void updateMovie(Movie m) {
    }

    @Override
    public void deleteMovie(String id) {
        String sql = "delete from MOVIES where ID=?";

        Object[] params = new Object[]{id};

        jdbcTemplate.update(sql, params);
    }

    @Override
    public void deleteAllMovies() {
        String sql = "delete from MOVIES";

        jdbcTemplate.update(sql);

    }

    public void deleteAllMoviesUsingSP() {

        String sql = "call MOVIES.DELETE_ALL_MOVIES";

        jdbcTemplate.update(sql);
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
