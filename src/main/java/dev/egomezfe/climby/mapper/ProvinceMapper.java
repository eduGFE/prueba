package dev.egomezfe.climby.mapper;


import dev.egomezfe.climby.domain.Province;
import dev.egomezfe.climby.dto.ProvinceDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProvinceMapper {
	
	Province provinceDTOToprovince(ProvinceDTO provinceDTO);
	
	ProvinceDTO provinceToprovinceDTO(Province province);

	List<ProvinceDTO> listProvinceToListProvinceDTO(List<Province> province);
		

}
