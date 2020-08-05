package com.example.demo;

import java.util.List;

public class PagingResponse {
    private List<UserResponse> usersResponseList;
    private int page;
    private int itemPerPage;

    public PagingResponse(int page, int itemPerPage) {
        this.page = page;
        this.itemPerPage = itemPerPage;
    }

    public void setUsersResponse(List<UserResponse> usersResponseList) {
        this.usersResponseList = usersResponseList;
    }

    public List<UserResponse> getUsersResponseList() {
        return usersResponseList;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getItemPerPage() {
        return itemPerPage;
    }

    public void setItemPerPage(int itemPerPage) {
        this.itemPerPage = itemPerPage;
    }
}
