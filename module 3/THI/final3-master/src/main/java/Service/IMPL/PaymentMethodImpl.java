package Service.IMPL;

import Mapper.IMPL.PaymentMethodMapper;
import Model.Entity.PayMethodEntity;
import Repository.DAO.IMPL.AbstractDAOImpl;
import Service.PaymentMethod;

import java.util.List;

public class PaymentMethodImpl extends AbstractDAOImpl<PayMethodEntity> implements PaymentMethod {
    @Override
    public PayMethodEntity findById(Long id) {
        String sql = "SELECT * FROM paymentMethod WHERE id = ?";
        List<PayMethodEntity> list = query(sql, new PaymentMethodMapper(), id);
        if (list != null && !list.isEmpty()) return list.get(0);
        return null;
    }
}
