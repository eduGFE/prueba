package dev.egomezfe.climby.repository;


import dev.egomezfe.climby.domain.Province;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceRepository extends CrudRepository<Province, Integer> {
	

	@Query(value="select tp.name_province, count(tt.province) as number_travels from tb_province tp  left join tb_travel tt on tp.name_province = tt.province where tt.departure_date >= CURRENT_DATE group by tp.name_province order by tp.name_province")
	List<Province> getProvincesWithTravelsLater();

	@Query(value="select name_province from tb_province")
	List<Province> findAll();

}
