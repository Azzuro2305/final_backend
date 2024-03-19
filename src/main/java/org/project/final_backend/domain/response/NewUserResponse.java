package org.project.final_backend.domain.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class NewUserResponse {
    private UUID id;
    private String firstName;
    private String lastName;
    public String getUserName() {
        return firstName + " " + lastName;
    }
    private String mail;
    private String phoneNumber;
    private String password;
    private String address;
//    private Integer role;
    private LocalDate dob;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String gender;
    private boolean isDeleted;
}
