package dev.egomezfe.climby.mapper;


import dev.egomezfe.climby.domain.Province;
import dev.egomezfe.climby.dto.ProvinceDTO;

import java.util.List;

public interface ProvinceMapper {
	
	Province provinceDTOToprovince(ProvinceDTO provinceDTO);
	
	ProvinceDTO provinceToprovinceDTO(Province province);

	List<ProvinceDTO> listProvinceToListProvinceDTO(List<Province> province);
		

}
