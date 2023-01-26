package dev.egomezfe.climby.service.impl;



import dev.egomezfe.climby.domain.Province;
import dev.egomezfe.climby.dto.ProvinceDTO;
import dev.egomezfe.climby.mapper.ProvinceMapper;
import dev.egomezfe.climby.repository.ProvinceRepository;
import dev.egomezfe.climby.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {

	@Autowired
	private ProvinceRepository provinceRepository;

	@Autowired
	private ProvinceMapper provinceMapper;

	@Override
	public List<ProvinceDTO> getProvinceFindAll() {
		List<Province> provincesWithTravelsLater = provinceRepository.getProvincesWithTravelsLater();
		List<Province> provinces = (List<Province>) provinceRepository.findAll();

		for (Province province2 : provinces) {
			for (Province province3 : provincesWithTravelsLater) {
				if (province2.equals(province3)) {
					province2.setNumberTravels(province3.getNumberTravels());
				}
			}
		}
		//OrdenarArrayList.ordenarArrayListForNameProvince(provinces);
		provinces.add(0, new Province("Seleccione su provincia", 0));

		return provinceMapper.listProvinceToListProvinceDTO(provinces);
	}

	

}
