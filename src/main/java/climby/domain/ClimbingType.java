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
@Table(name = "tb_climbing_type")
public class ClimbingType implements Serializable {

	private static final long serialVersionUID = 2351451415512875940L;
	
	@Id
	@Column(name = "climbing_type", unique = true, nullable = false, length = 50)
	private String name;
	
}
