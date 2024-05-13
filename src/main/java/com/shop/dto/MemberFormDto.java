package com.shop.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

@Getter @Setter
public class MemberFormDto {

    @NotBlank(message = "Name is required.")
    private String name;

    @NotEmpty(message = "Email  is required.")
    @Email(message = "Must be Email format.")
    private String email;

    @NotEmpty(message = "Password  is required.")
    @Length(min=4, max=16, message = "Password is between 4 and 16 characters")
    private String password;

    @NotEmpty(message = "Address  is required.")
    private String address;
}