package climby.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_message")
public class Message implements Serializable{

	private static final long serialVersionUID = 433894867746767442L;
	
	@Id
	@SequenceGenerator(name = "idMessageSeqGenerator", sequenceName = "sc_message", allocationSize = 1)
	@GeneratedValue(generator = "idMessageSeqGenerator")
	private Integer id_message;
	
	@Column(name = "text_message", nullable = true, length = 300)
	private String textMessage;

	@Column(name = "read")
	private Boolean read;
	

}
