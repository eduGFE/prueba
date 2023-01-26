package climby.service;

import com.climbtogether.climby.dto.MessageDTO;
import com.climbtogether.climby.exceptions.TravelNotFoundException;

import java.util.List;

public interface MessageService {
	
	MessageDTO resgisterMessage(MessageDTO createMessageDTO);
	
	List<MessageDTO> modifyMessageByTravelId(Integer id) throws TravelNotFoundException;
		
}
