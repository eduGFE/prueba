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


	@Mapping(source = "nameprovince", target = "nameprovince")
	@Mapping(source = "numbertravels", target = "numbertravels")
	List<ProvinceDTO> listProvinceToListProvinceDTO(List<Province> province);
		

}
