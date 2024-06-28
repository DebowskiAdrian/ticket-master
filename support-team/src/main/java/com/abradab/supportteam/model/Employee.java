package com.abradab.supportteam.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String shortLoginName;
    private String email;
    private String phone;
    private String department;
}
