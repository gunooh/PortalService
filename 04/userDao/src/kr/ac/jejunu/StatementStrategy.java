package kr.ac.jejunu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by PARK on 2017-03-31.
 */
public interface StatementStrategy {
    public PreparedStatement makeStatement(Connection connection) throws SQLException;
}
