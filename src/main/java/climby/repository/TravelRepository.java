package climby.repository;

import com.climbtogether.climby.domain.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Integer> {
	

	@Query(value="select * from tb_travel where id_driver = :id and date(departure_date)>=(select date(current_date - interval '2 month'))",nativeQuery = true)
	List<Travel> getUsersTravels(@Param("id") Integer id);
	
	@Query("select travel from Travel travel left join travel.reservation reservation on travel.id_travel=reservation.travel.id_travel where (reservation.passenger.id_user = :id or travel.driver.id_user = :id) and (departure_date>now() or date(departure_date)=date(now()))")
	List<Travel> getTravelsWithUserReservation(@Param("id") Integer id);
	

}