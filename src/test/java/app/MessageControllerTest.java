package app;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


@ExtendWith(MockitoExtension.class)
public class MessageControllerTest {
	
	@InjectMocks
	MessageController messageController;
     
    
     
    @Test
    public void testSendMessageSuccess()
    {
       
    }
    
    @Test(expected = Exception.class)
    public void testSendMessageFail()
    {
    	
        
        
       
       
    }
}
