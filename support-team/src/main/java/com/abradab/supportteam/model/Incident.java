package com.abradab.supportteam.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Incident {

    private long id;
    private String title;
    private String description;
    private SupportTeam supportTeam;
    private long sla;
}
