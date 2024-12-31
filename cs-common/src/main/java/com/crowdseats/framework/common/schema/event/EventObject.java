package com.crowdseats.framework.common.schema.event;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventObject {
    private String eventId;
    private String name;
    private String description;
    private String location;
    private Category category;
    private String organizer;
    private Date eventStartDate;
    private Date eventEndDate;
    private Integer totalSeats;
}
