package process.bbb.data.repository;

import process.bbb.data.domain.BarTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BarTableRepository extends JpaRepository<BarTable, Long> {
    List<BarTable> findByReservationReservationTime(Date reservationTime);
    List<BarTable> findByReservationReservationTimeNot(Date reservationTime);
}
