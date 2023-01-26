package climby.controller;

import com.climbtogether.climby.dto.DataDTO;
import com.climbtogether.climby.dto.TravelDTO;
import com.climbtogether.climby.exceptions.TravelNotFoundException;
import com.climbtogether.climby.service.TravelService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "/", tags = "Gestor de viajes")
@RequestMapping("/travel")
public class TravelController {

	// Muestra todos los viajes excepto los del usuario indicado
	@Autowired
	private TravelService travelService;

	@ApiOperation(value = "Get all travels", notes = "Return the travel information")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "success"),@ApiResponse(code = 409, message = "conflict") })
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/travels", headers = "Accept=application/json")
	public List<TravelDTO> getTravelFindAll() {
		
		return travelService.getTravelFindAll();
	}

	@ApiOperation(value = "Get the trips of a user", notes = "Return the travel information")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "success"),@ApiResponse(code = 409, message = "conflict") })
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/users/{id}", headers = "Accept=application/json")
	public List<TravelDTO> getUsersTravels(@ApiParam(name = "id", type = "Integer", value = "Intake code or CIO that identifies a travel", required = true, example = "1") @PathVariable Integer id) {
		
		return travelService.getUsersTravels(id);
	}
	
	@ApiOperation(value = "Get trip by ID", notes = "Return the travel information")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "success"),@ApiResponse(code = 409, message = "conflict") })
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/travel/{id}", headers = "Accept=application/json")
	public TravelDTO getTravelById(@ApiParam(name = "id", type = "Integer", value = "Intake code or CIO that identifies a travel", required = true, example = "1") @PathVariable Integer id) throws TravelNotFoundException {
		 return new DataDTO<>( travelService.getTravelById(id)).getData();
	}

	@ApiOperation(value = "Displays trips booked by a given user", notes = "Return the travel information")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "success"),@ApiResponse(code = 409, message = "conflict") })
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "reservations/idUser/{id}", headers = "Accept=application/json")
	public List<TravelDTO> getTravelsWithUserReservation(@ApiParam(name = "id", type = "Integer", value = "Intake code or CIO that identifies a travel", required = true, example = "1") @PathVariable Integer id) {
		
		return travelService.getTravelsWithUserReservation(id);
	}

	@ApiOperation(value = "Travel creation", notes = "Travel creation operation required for the creation of available travel")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "created"),@ApiResponse(code = 409, message = "conflict") })
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public TravelDTO registerTravel(@Validated @RequestBody TravelDTO createTravelDTO) {
		
		return new DataDTO<>(travelService.resgisterTravel(createTravelDTO)).getData();
	}

	@ApiOperation(value = "Travel modification", notes = "Return Travel information modificated")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "success"),@ApiResponse(code = 409, message = "conflict") })
	@ResponseStatus(HttpStatus.OK)
	@PutMapping
	public TravelDTO modifyTravel(@ApiParam(name = "Travel", type = "Travel", value = "Travel type entity", required = true) @RequestBody @Validated TravelDTO modifiedTravelDTO)throws TravelNotFoundException {
		//test
		return new DataDTO<>(travelService.modifyTravel(modifiedTravelDTO)).getData();
	}

	@ApiOperation(value = "Travel deletion", notes = "Return travel information deleted")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Accepted") })
	@ResponseStatus(HttpStatus.OK)
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> removeTravel(@ApiParam(name = "id", type = "Integer", value = "Identification code of the travel to be removed", required = true, example = "1") @PathVariable Integer id)throws TravelNotFoundException {
		travelService.removeTravel(id);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

	
	
	
	
	
	
	
}