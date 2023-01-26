package dev.egomezfe.climby.domain;



import lombok.*;


import java.io.Serializable;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Province implements Serializable{

	private static final long serialVersionUID = -985853124316450362L;

	private String nameprovince;

	private Integer numbertravels;

}
