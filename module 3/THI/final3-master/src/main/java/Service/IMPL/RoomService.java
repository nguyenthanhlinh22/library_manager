package Service.IMPL;

import Mapper.IMPL.RoomMapper;
import Model.Entity.RoomEntity;
import Model.Request.RoomRequest;
import Repository.DAO.IMPL.AbstractDAOImpl;
import Service.IRoomService;

import java.util.List;

public class RoomService extends AbstractDAOImpl<RoomEntity> implements IRoomService {
    @Override
    public List<RoomEntity> findAll(RoomRequest request) {
        StringBuilder sql = new StringBuilder("SELECT * FROM rooms WHERE ");
        if(request.getId() != null) {
            sql.append(" id = ").append(request.getId());
        }
        if(request.getCustomerName() != null && !request.getCustomerName().isEmpty()) {
            sql.append(" customerName LIKE '%").append(request.getCustomerName()).append("%' ");
        }
        if(request.getPhoneNumber() != null && !request.getPhoneNumber().isEmpty()) {
            sql.append(" phoneNumber LIKE '%").append(request.getPhoneNumber()).append("%' ");
        }
        return query(sql.toString(), new RoomMapper());
    }

    @Override
    public Long saveEntity(RoomEntity roomEntity) {
        String sql = "INSERT INTO rooms(customerName, phoneNumber, startDate, note, paymentMethod) VALUES (?, ?, ?, ?, ?)";
        return save(sql, roomEntity.getCustomerName(), roomEntity.getPhoneNumber(), roomEntity.getStartDate(), roomEntity.getNote(), roomEntity.getPayMethod());
    }

    @Override
    public void delete(List<Long> ids) {
        String sql = "DELETE FROM rooms WHERE id = ?";
        for(Long id : ids) {
            update(sql, id);
        }
    }

    @Override
    public void updateEntity(RoomEntity roomEntity) {
        String sql = "UPDATE FROM rooms SET customerName = ?, phoneNumber = ?, startDate = ?, note = ?, paymentMethod = ? WHERE id = ?";
        update(sql, roomEntity.getCustomerName(), roomEntity.getPhoneNumber(), roomEntity.getStartDate(), roomEntity.getNote(), roomEntity.getPayMethod());
    }
}
