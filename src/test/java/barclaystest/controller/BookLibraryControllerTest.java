package barclaystest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class BookLibraryControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testGetBooks() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/books").contentType("application/json"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
}