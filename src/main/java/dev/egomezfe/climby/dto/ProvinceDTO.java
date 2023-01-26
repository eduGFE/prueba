package dev.egomezfe.climby.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProvinceDTO implements Serializable {

	private static final long serialVersionUID = -9008106369861307152L;

	private String name;

	private Integer numberTravels;

}
