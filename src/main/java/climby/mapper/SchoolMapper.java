package climby.mapper;

import com.climbtogether.climby.domain.School;
import com.climbtogether.climby.dto.SchoolDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SchoolMapper {
	
	School schoolDTOToSchool(SchoolDTO schoolDTO);
	
	SchoolDTO schoolToSchoolDTO(School school);
	
	List<SchoolDTO> listSchoolToListSchoolDTO(List<School> school);

}
