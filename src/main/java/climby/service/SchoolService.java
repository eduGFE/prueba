package climby.service;

import com.climbtogether.climby.dto.SchoolDTO;

import java.util.List;

public interface SchoolService {

	SchoolDTO resgisterSchool(SchoolDTO createSchoolDTO);
	
	SchoolDTO getSchoolById(String name);
	
	List<SchoolDTO> getSchoolFindAll();

}
	