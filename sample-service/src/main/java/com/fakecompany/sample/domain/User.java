package com.fakecompany.sample.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String name;

    private String username;
    private String password;

    private String phoneNumber;
    private OffsetDateTime lastLogin;
}