package com.example.demoday2.model;

import lombok.*;

@Data //getters,setters, tostring,equalshascode
@NoArgsConstructor
@AllArgsConstructor
public class Institute {
    private  int id;
    private String name;
    private String address;
    private String registrationNo;
}
