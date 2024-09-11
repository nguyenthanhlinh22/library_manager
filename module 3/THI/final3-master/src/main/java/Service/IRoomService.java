package Service;

import Model.Entity.RoomEntity;
import Model.Request.RoomRequest;

import java.util.List;

public interface IRoomService {
    List<RoomEntity> findAll(RoomRequest request);
    Long saveEntity(RoomEntity roomEntity);
    void delete(List<Long> ids);
    void updateEntity(RoomEntity roomEntity);
}
