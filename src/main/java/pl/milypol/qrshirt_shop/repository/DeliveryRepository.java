package pl.milypol.qrshirt_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.milypol.qrshirt_shop.entity.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery,Long> {
}
