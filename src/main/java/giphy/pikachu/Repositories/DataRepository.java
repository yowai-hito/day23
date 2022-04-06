package giphy.pikachu.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import giphy.pikachu.Models.DataObject;
import static giphy.pikachu.Repositories.QueryStrings.*;

@Repository
public class DataRepository {

    @Autowired
    JdbcTemplate jdbc;

    public int insertIntoTable(DataObject data){
        try{    
            jdbc.update(SQL_INSERT_DATA, 
            data.getEmail(), data.getName(), data.getPhone(), data.getStatus(), data.getDob(), data.getPassphrase());
            return 200;
        }
        catch(DataAccessException e){
            System.out.println(e.getMessage());
            return 500;
        }

    }
}
