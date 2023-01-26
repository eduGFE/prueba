package dev.egomezfe.climby.repository;


import dev.egomezfe.climby.domain.Province;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceRepository extends CrudRepository<Province, Integer> {
	

	@Query(value="select tp.nameprovince, count(tt.province) as numbertravels from tb_province tp  left join tb_travel tt on tp.nameprovince = tt.province where tt.departure_date >= CURRENT_DATE group by tp.nameprovince order by tp.nameprovince")
	List<Province> getProvincesWithTravelsLater();

	@Query(value="SELECT nameprovince FROM public.tb_province")
	List<Province> findAll();

}
