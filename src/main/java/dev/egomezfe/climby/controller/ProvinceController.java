package dev.egomezfe.climby.controller;


import dev.egomezfe.climby.domain.Province;
import dev.egomezfe.climby.dto.ProvinceDTO;
import dev.egomezfe.climby.model.Post;
import dev.egomezfe.climby.repository.AuthorRepository;
import dev.egomezfe.climby.repository.PostRepository;
import dev.egomezfe.climby.repository.ProvinceRepository;
import dev.egomezfe.climby.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/province")
public class ProvinceController {

	@Autowired private ProvinceRepository provinceRepository;
	@Autowired private ProvinceService provinceService;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/provinces", headers = "Accept=application/json")
	public List<ProvinceDTO> getProvinceFindAll(){
		return provinceService.getProvinceFindAll();
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/prueba", headers = "Accept=application/json")
	public Iterable<Province> findAll() {
		return provinceRepository.findAll();
	}
		
	
}


