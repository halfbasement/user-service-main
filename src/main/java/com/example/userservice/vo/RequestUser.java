package com.example.userservice.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestUser {

    @NotNull(message="이메일은 널이 될 수 없습니다")
    @Size(min = 2 , message = "이메일은 최소 두글자 이상 되어야 합니다")
    @Email
    private String email;

    @NotNull(message="이메일은 널이 될 수 없습니다")
    @Size(min = 2 , message = "이메일은 최소 두글자 이상 되어야 합니다")
    private String name;
    private String pwd;

}
