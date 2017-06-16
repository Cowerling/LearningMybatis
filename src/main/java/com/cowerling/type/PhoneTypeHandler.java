package com.cowerling.type;

import com.cowerling.domain.PhoneNumber;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by dell on 2017-6-15.
 */
@MappedJdbcTypes(JdbcType.VARCHAR)
public class PhoneTypeHandler extends BaseTypeHandler<PhoneNumber> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, PhoneNumber parameter, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, parameter.toString());
    }

    @Override
    public PhoneNumber getNullableResult(ResultSet resultSet, String columnName) throws SQLException {
        return new PhoneNumber(columnName);
    }

    @Override
    public PhoneNumber getNullableResult(ResultSet resultSet, int columnIndex) throws SQLException {
        return new PhoneNumber(resultSet.getString(columnIndex));
    }

    @Override
    public PhoneNumber getNullableResult(CallableStatement callableStatement, int columnIndex) throws SQLException {
        return new PhoneNumber(callableStatement.getString(columnIndex));
    }
}
