package kr.ac.jejunu;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by PARK on 2017-03-24.
 */
public interface ConnectionMaker {
    public Connection getCConnection() throws ClassNotFoundException, SQLException;
}
