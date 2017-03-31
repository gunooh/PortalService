package kr.ac.jejunu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by PARK on 2017-03-31.
 */
public class DeleteUserStatementStrategy implements StatementStrategy{
    @Override
    public PreparedStatement makeStatement(Object object, Connection connection) throws SQLException {
        Long id = (Long) object;
        PreparedStatement preparedStatement;
        preparedStatement = connection.prepareStatement("delete from user where id = ?");
        preparedStatement.setLong(1, id);
        return preparedStatement;
    }
}
