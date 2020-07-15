package model.repository;

import model.entity.Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Repository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public Repository() throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "javaclass", "123");
        connection.setAutoCommit (false);
    }

    public void insert(Entity entity) throws Exception{
        preparedStatement=connection.prepareStatement ("INSERT INTO violation (numberplate , model , id) VALUES (?,?,?)");
        preparedStatement.setString (1 , entity.getNumberplate());
        preparedStatement.setString (2 , entity.getModel());
        preparedStatement.setString (3 , entity.getId());
        preparedStatement.executeUpdate ();
    }

    public void update (Entity entity) throws Exception{
        preparedStatement=connection.prepareStatement ("UPDATE violation SET numberplate=? , model=? WHERE id=? ");
        preparedStatement.setString (1 , entity.getNumberplate());
        preparedStatement.setString (2 , entity.getModel());
        preparedStatement.setString (3 , entity.getId());
        preparedStatement.executeUpdate ();
    }

    public void delete(String id) throws Exception{
        preparedStatement=connection.prepareStatement ("DELETE FROM violation WHERE id=?");
        preparedStatement.setString (1,id);
        preparedStatement.executeUpdate ();
    }

    public List<Entity> select() throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT * FROM violation");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<Entity> entityList =new ArrayList <> ();
        while (resultSet.next ()){
            Entity entity =new Entity();
            entity.setNumberplate (resultSet.getString ("numberplate"));
            entity.setModel (resultSet.getString ("model"));
            entity.setId (resultSet.getString ("id"));
            entityList.add (entity);
        }
        return entityList;
    }

    public void commit() throws Exception{
        connection.commit ();
    }

    public void close() throws Exception{
        preparedStatement.close ();
        connection.close ();
    }

}
