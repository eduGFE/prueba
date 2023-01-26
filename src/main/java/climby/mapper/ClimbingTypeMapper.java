package climby.mapper;

import com.climbtogether.climby.domain.ClimbingType;
import com.climbtogether.climby.dto.ClimbingTypeDTO;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface ClimbingTypeMapper {
	
	List<ClimbingTypeDTO> listClimbingTypeToListClimbingTypeDTO(List<ClimbingType> ClimbingType);

}