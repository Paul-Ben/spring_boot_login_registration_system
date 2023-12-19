package com.app.log_reg.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;

    private String email, username, password;
}
