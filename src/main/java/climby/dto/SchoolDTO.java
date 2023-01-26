package climby.dto;

import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SchoolDTO implements Serializable {

	private static final long serialVersionUID = -9008106369861307152L;

	@ApiModelProperty(required = true, value = "Nombre escuela", example = "Albarracin")
	@NotNull
	private String name;

}
