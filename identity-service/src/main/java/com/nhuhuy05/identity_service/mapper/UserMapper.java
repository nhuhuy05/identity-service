package com.nhuhuy05.identity_service.mapper;

import com.nhuhuy05.identity_service.dto.request.UserCreationRequest;
import com.nhuhuy05.identity_service.dto.request.UserUpdateRequest;
import com.nhuhuy05.identity_service.dto.response.UserResponse;
import com.nhuhuy05.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    //    @Mapping(source = "firstName", target = "lastName") map lastName = firstName
    //    @Mapping(target = "lastName", ignore = true) ko map lastName
    UserResponse toUserResponse(User user);

    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
