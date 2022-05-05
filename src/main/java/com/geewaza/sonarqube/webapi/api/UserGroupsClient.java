package com.geewaza.sonarqube.webapi.api;

import com.geewaza.sonarqube.webapi.api.usergroups.*;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.impl.AbstractSonarClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-02 23:52
 **/
public class UserGroupsClient extends AbstractSonarClient {

    public UserGroupsClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public AddUserService addUser() {
        return new AddUserService(this.httpClient);
    }
    public CreateUserGroupService createUserGroup() {
        return new CreateUserGroupService(this.httpClient);
    }
    public DeleteUserGroupService deleteUserGroup() {
        return new DeleteUserGroupService(this.httpClient);
    }
    public GetUsersService getUsers() {
        return new GetUsersService(this.httpClient);
    }
    public RemoveUserService removeUser() {
        return new RemoveUserService(this.httpClient);
    }
    public SearchUserGroupService searchUserGroup() {
        return new SearchUserGroupService(this.httpClient);
    }
    public UpdateUserGroupService updateUserGroup() {
        return new UpdateUserGroupService(this.httpClient);
    }


}
