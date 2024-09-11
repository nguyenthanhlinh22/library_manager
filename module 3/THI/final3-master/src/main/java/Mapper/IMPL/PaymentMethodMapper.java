package Mapper.IMPL;

import Mapper.IRowMapper;
import Model.Entity.PayMethodEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PaymentMethodMapper implements IRowMapper<PayMethodEntity> {
    @Override
    public PayMethodEntity rowMapper(ResultSet resultSet) {
        PayMethodEntity payMethod = new PayMethodEntity();
        try {
            payMethod.setId(resultSet.getLong("id"));
            payMethod.setName(resultSet.getString("name"));
            payMethod.setCode(resultSet.getString("code"));
            return payMethod;
        } catch (SQLException e) {
            return null;
        }
    }
}
