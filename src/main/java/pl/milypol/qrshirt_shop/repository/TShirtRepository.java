package pl.milypol.qrshirt_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.milypol.qrshirt_shop.entity.TShirt;

public interface TShirtRepository extends JpaRepository<TShirt,Long> {
}
