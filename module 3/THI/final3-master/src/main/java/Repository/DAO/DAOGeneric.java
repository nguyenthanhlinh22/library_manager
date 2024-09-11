package Repository.DAO;

import Mapper.IRowMapper;

import java.util.List;

public interface DAOGeneric<T> {
    List<T> query(String sql, IRowMapper<T> rowMapper, Object... params);
    Long save(String sql, Object... params);
    void update(String sql, Object... params);
}
