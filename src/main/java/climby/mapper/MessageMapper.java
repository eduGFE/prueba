package climby.mapper;

import com.climbtogether.climby.domain.Message;
import com.climbtogether.climby.dto.MessageDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface MessageMapper {
	
	@Mapping(target = "id_message", source = "id_message")
	@Mapping(target = "textMessage", source = "textMessage")
	@Mapping(target = "read", source = "read")
	Message messageDTOToMessage(MessageDTO messageDTO);
	
	@Mapping(source = "id_message", target = "id_message")
	@Mapping(source = "textMessage", target = "textMessage")
	@Mapping(source= "read", target = "read")
	MessageDTO messageToMessageDTO(Message message);
}