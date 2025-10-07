package com.nhuhuy05.identity_service.exception;

public enum ErrorCode {

    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    INVALID_KEY(1001, "Invalid message key"),
    USER_EXISTED(1002, "User existed"),
    USERNAME_INVALID(1003, "Username must be least 3 character"),
    INTVALID_PASSWORD(1004, "Password must be least 8 character"),
    USER_NOT_EXISTED(1005, "User not existed"),
    UNAUTHENTICATED(1006,"Unauthenticated")
    ;

    ErrorCode(int code, String message) {
        this.message = message;
        this.code = code;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
