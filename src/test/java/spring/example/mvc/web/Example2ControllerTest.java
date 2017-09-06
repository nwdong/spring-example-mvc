package spring.example.mvc.web;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import spring.example.mvc.domain.Example2User;
import spring.example.mvc.service.Example2UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Example2ControllerTest {
	
	@Test
	public void shouldProcessRegister() throws Exception{
		
		Example2User saved = new Example2User();
		saved.setId(1L);
		saved.setEmail("a@b.c");
		saved.setUsername("tester");
		saved.setPassword("123456");
		
		Example2UserRepository mockRepo =  mock(Example2UserRepository.class);
		when(mockRepo.save(saved)).thenReturn(saved);
		
		Example2Controller controller = new Example2Controller(mockRepo);
		MockMvc mockMvc = standaloneSetup(controller).build();
		
		mockMvc.perform(post("/example2-register")
				.param("email", "a@b.c")
				.param("username", "tester")
				.param("password", "123456"))
		.andExpect(redirectedUrl("/example2/tester"));
	}
}
