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
@Table(name = "tb_school")
public class School implements Serializable {

	private static final long serialVersionUID = 2351451415512875940L;
	
	@Id
	@Column(name = "name_school", unique = true, nullable = false, length = 50)
	private String name;
	
}
