package climby.repository;

import com.climbtogether.climby.domain.ClimbingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClimbingTypeRepository extends JpaRepository<ClimbingType, String> {

}
