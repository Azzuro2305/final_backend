package org.project.final_backend.domain.response.user;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class UpdateUserResponse {
    private UUID id;
    private String firstName;
    private String lastName;
    private String userName;
    private String mail;
    private String phoneNumber;
    private String address;
//    private Integer role;
    private LocalDate dob;
    private LocalDateTime updatedDate;
    private String gender;
    private boolean isDeleted;
}
