package dev.egomezfe.climby.mapper;


import dev.egomezfe.climby.domain.Province;
import dev.egomezfe.climby.dto.ProvinceDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import java.util.List;

@Mapper(componentModel = "spring")
public interface ProvinceMapper {
	
	Province provinceDTOToprovince(ProvinceDTO provinceDTO);
	
	ProvinceDTO provinceToprovinceDTO(Province province);

	List<ProvinceDTO> listProvinceToListProvinceDTO(List<Province> province);
		

}
