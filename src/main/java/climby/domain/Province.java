package climby.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_province")
public class Province implements Serializable{

	private static final long serialVersionUID = -985853124316450362L;
	
	@Id
	@Column(name = "name_province", unique = true, nullable = false, length = 50)
	private String name;
	
	
	private Integer numberTravels;

}
