/**
 * 
 */
package com.jba.release.endpoints;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author judebarnabasantony
 *
 */
@ExtendWith(SpringExtension.class)
@WebMvcTest(ReleaseGitHubActionRestController.class)
public class ReleaseGitHubActionRestControllerTest {

	private static final String API_V1_RELEASE_HEALTH = "/api/v1/release/health";
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testHealth() throws Exception {

		mockMvc.perform(get(API_V1_RELEASE_HEALTH)).andExpect(status().isOk());
		assertTrue(true);
	}

}
