package pl.milypol.qrshirt_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.milypol.qrshirt_shop.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
