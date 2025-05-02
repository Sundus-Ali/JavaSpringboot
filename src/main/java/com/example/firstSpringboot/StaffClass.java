package com.example.firstSpringboot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
 public class StaffClass {
    public long id;
    public String name;
    public String role;
}
