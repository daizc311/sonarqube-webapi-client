# sonarqube-webapi-client

A Java client for interacting with the SonarQube server via Sonarqube web apis. \
For SonarQube Version 9.5 .

# User Guide

```java
public class SonarClientTest {

    private static final String SERVER_URL = "http://sonarhost:9000/";
    private static final String USER = "username";
    private static final String PASSWORD = "password";
    private static final String TOKEN = "access_token";

    @Test
    public void createProject_01() throws URISyntaxException {
        String project = "test-002";
        System.out.println("project=" + project);
        SonarClient client = new SonarClient(new URI(SERVER_URL), USER, PASSWORD);
        ProjectResponse result = client.getProjectsClient().createProject().name(project).project(project).execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }

    @Test
    public void createProject_02() throws URISyntaxException {
        String project = "test-003";
        System.out.println("project=" + project);
        SonarClient client = new SonarClient(new URI(SERVER_URL), TOKEN);
        ProjectResponse result = client.getProjectsClient().createProject().name(project).project(project).execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }
}
```

# TODO List

| API                       | Coding | Testing |
|:--------------------------|--------|---------|
| api/alm_integrations      | [ ]    | [ ]     |
| api/alm_settings          | [ ]    | [ ]     |
| api/authentication        | [ ]    | [ ]     |
| api/ce                    | [ ]    | [ ]     |
| api/components            | [ ]    | [ ]     |
| api/duplications          | [ ]    | [ ]     |
| api/favorites             | [ ]    | [ ]     |
| api/hotspots              | [ ]    | [ ]     |
| api/issues                | [ ]    | [ ]     |
| api/languages             | [ ]    | [ ]     |
| api/measures              | [ ]    | [ ]     |
| api/metrics               | [ ]    | [ ]     |
| api/new_code_periods      | [ ]    | [ ]     |
| api/notifications         | [ ]    | [ ]     |
| api/permissions           | [ ]    | [ ]     |
| api/plugins               | [ ]    | [ ]     |
| api/project_analyses      | [ ]    | [ ]     |
| api/project_badges        | [ ]    | [ ]     |
| api/project_branches      | [ ]    | [ ]     |
| api/project_dump          | [ ]    | [ ]     |
| api/project_links         | [ ]    | [ ]     |
| api/project_pull_requests | [ ]    | [ ]     |
| api/project_tags          | [ ]    | [ ]     |
| api/projects              | [ ]    | [ ]     |
| api/qualitygates          | [ ]    | [ ]     |
| api/qualityprofiles       | [ ]    | [ ]     |
| api/rules                 | [ ]    | [ ]     |
| api/server                | [ ]    | [ ]     |
| api/settings              | [ ]    | [ ]     |
| api/sources               | [ ]    | [ ]     |
| api/updatecenter          | [ ]    | [ ]     |
| api/user_groups           | [ ]    | [ ]     |
| api/user_tokens           | [ ]    | [ ]     |
| api/users                 | [ ]    | [ ]     |
| api/webhooks              | [ ]    | [ ]     |
| api/webservices           | [ ]    | [ ]     |


| api/system                | [ ]    | [ ]     |


# Contribution

### Library

Contributing to standard library follows standard workflow. Create feature/bugfix branch, implement, create pull request
with me as a reviewer and merge after approval :-)

### Testing

The library is tested manually at this point. If you are interested in implementing any kind of testing, unit testing,
integration testing, end-to-end testing, potentially including some virtualization you are welcome to do so. Please
follow the same workflow as for any work on library itself.
