package process.bbb.data.repository;

import process.bbb.data.domain.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface menuItemRepository extends JpaRepository<MenuItem, Long> {
}
