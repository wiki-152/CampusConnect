package org.example.sda_project.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.util.Base64;

@Service
public class JiraService {

    @Value("${jira.base.url}")
    private String jiraBaseUrl;

    private final RestTemplate restTemplate;

    public JiraService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    //create
    public ResponseEntity<String> createIssue(String issueJson, String apiToken) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Basic " + Base64.getEncoder().encodeToString(apiToken.getBytes()));
        headers.set("Content-Type", "application/json");

        HttpEntity<String> entity = new HttpEntity<>(issueJson, headers);

        try {
            return restTemplate.exchange(jiraBaseUrl + "/rest/api/2/issue", HttpMethod.POST, entity, String.class);
        } catch (HttpClientErrorException e) {
            System.out.println("HTTP Status Code: " + e.getStatusCode());
            System.out.println("Response Body: " + e.getResponseBodyAsString());
            throw e; // Rethrow or handle the exception
        } catch (Exception e) {
            System.out.println("Error while creating issue: " + e.getMessage());
            throw e; // Rethrow or handle the exception
        }
    }


    // Add other methods for fetching/updating issues if needed
}
