package process.bbb.data.repository;

import process.bbb.data.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmail(String email);
    Customer findByEmailAndIdNot(String email, Long CustomerId);
}
