package Service;

import Model.Entity.PayMethodEntity;

public interface PaymentMethod {
    PayMethodEntity findById(Long id);
}
