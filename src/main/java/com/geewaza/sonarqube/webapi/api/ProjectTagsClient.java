package com.geewaza.sonarqube.webapi.api;

import com.geewaza.sonarqube.webapi.api.projecttags.SearchProjectTagsService;
import com.geewaza.sonarqube.webapi.api.projecttags.SetProjectTagService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.impl.AbstractSonarClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 16:41
 **/
public class ProjectTagsClient extends AbstractSonarClient {
    public ProjectTagsClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public SearchProjectTagsService searchProjectTags() {
        return new SearchProjectTagsService(this.httpClient);
    }

    public SetProjectTagService setProjectTag() {
        return new SetProjectTagService(this.httpClient);
    }


}
