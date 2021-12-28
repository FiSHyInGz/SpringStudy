package com.example.springBootessentials.request;

import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotEmpty;

@Data
public class AnimePostRequestBody {
    @NotEmpty(message = "The anime name cannot be empty")
    private String name;
    @URL(message = "The URL is not found")
    private String URL;
}
