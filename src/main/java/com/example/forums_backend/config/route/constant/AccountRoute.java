package com.example.forums_backend.config.route.constant;

public class AccountRoute {
    public static final String PREFIX_ACCOUNT_ROUTE = "/api/account";

    public static final String GET_ALL_PATH = "/get-all";
    public static final String UPDATE_PATH = "/update/{id}";

    public static final String GET_ALL_ACCOUNT_ROUTE = PREFIX_ACCOUNT_ROUTE.concat(GET_ALL_PATH);
    public static final String UPDATE_ACCOUNT_ROUTE = PREFIX_ACCOUNT_ROUTE.concat(UPDATE_PATH);
}
