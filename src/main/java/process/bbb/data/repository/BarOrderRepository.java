package process.bbb.data.repository;

import process.bbb.data.domain.BarOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarOrderRepository extends JpaRepository<BarOrder, Long> {
}
