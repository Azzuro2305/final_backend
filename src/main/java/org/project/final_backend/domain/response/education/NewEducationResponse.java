package org.project.final_backend.domain.response.education;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class NewEducationResponse {
    private String school;
    private String degree;
    private String fieldOfStudy;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDateTime createdDate;
//    private boolean isDeleted;
}
