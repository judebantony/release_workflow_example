package com.jba.release.endpoints;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author judebarnabasantony
 *
 */

@RestController
@RequestMapping("/api/v1/release")
public class ReleaseGitHubActionRestController {

	private static final String JUDE_S_GIT_HUB_ACTION_RELEASE_EXAMPLE = "Jude's GitHub Action e2e release workflow example";

	@GetMapping("/health")
    public String health() {
        return JUDE_S_GIT_HUB_ACTION_RELEASE_EXAMPLE;
    }

    
}
