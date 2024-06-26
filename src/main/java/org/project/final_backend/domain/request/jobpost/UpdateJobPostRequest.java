package org.project.final_backend.domain.request.jobpost;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class UpdateJobPostRequest {
    private UUID jobPostId;
    private String title;
    private String description;
    private String location;
    private String type; // eg: full time (or) part-time
    private String category;
    private String qualification;
    private String exp;
    private String salary;
    private String companyName;
    private boolean isDeleted;
}
