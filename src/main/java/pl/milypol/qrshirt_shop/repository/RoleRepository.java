package pl.milypol.qrshirt_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.milypol.qrshirt_shop.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
