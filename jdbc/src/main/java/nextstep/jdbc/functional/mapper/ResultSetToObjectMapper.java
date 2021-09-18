package nextstep.jdbc.functional.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

@FunctionalInterface
public interface ResultSetToObjectMapper<T> {

    T map(ResultSet resultSet) throws SQLException;

}