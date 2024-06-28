package com.abradab.supportteam.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SupportTeam {

    private long id;
    private String name;
    private String description;
    private String level;
    private List<Employee> members;
}
