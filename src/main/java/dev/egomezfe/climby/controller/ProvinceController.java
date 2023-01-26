package dev.egomezfe.climby.controller;


import dev.egomezfe.climby.dto.ProvinceDTO;
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

	@Autowired private ProvinceService provinceService;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/provinces", headers = "Accept=application/json")
	public List<ProvinceDTO> getProvinceFindAll(){
		return provinceService.getProvinceFindAll();
	}
		
	
}


