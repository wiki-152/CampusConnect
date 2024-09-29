package org.example.sda_project.Controller;

import org.example.sda_project.Service.JiraService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/jira")
public class JiraController {

    private final JiraService jiraService;

    public JiraController(JiraService jiraService) {
        this.jiraService = jiraService;
    }
    //create
    @PostMapping("/createIssue")
    public ResponseEntity<String> createIssue(@RequestBody String issueJson) {
        System.out.println("Received issue JSON: " + issueJson); // Log the incoming JSON
        String apiToken = "EMAIL ADDRESS : ENTER ATTLASSION API TOKEN "; // Update with your Base64 token-----------------------------------------
        ResponseEntity<String> response = jiraService.createIssue(issueJson, apiToken);
        return response;
    }


    // Add other endpoints as needed
}
