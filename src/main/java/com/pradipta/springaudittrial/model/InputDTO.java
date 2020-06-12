package com.pradipta.springaudittrial.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InputDTO<T> {
    @JsonProperty(value = "userId", required = true)
    private String user;
    private T employee;
}
