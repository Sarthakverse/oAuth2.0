package com.authorization.oauth2.dto;

import com.authorization.oauth2.entity.Authority;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Oauth2UserInfoDto {
    private String id;
    private String name;
    private String email;
    private String picture;
    private String provider;
    private String providerId;
}
