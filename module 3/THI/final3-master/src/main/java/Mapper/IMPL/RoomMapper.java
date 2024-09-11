package Mapper.IMPL;

import Mapper.IRowMapper;
import Model.Entity.RoomEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RoomMapper implements IRowMapper<RoomEntity> {
    @Override
    public RoomEntity rowMapper(ResultSet resultSet) {
        RoomEntity room = new RoomEntity();
        try {
            room.setId(resultSet.getLong("id"));
            room.setNote(resultSet.getString("note"));
            room.setCustomerName(resultSet.getString("name"));
            room.setStartDate(resultSet.getDate("startdate"));
            room.setPhoneNumber(resultSet.getString("phonenumber"));
            room.setPayMethod(resultSet.getLong("paymentid"));
            return room;
        } catch (SQLException e) {
            return null;
        }
    }
}
