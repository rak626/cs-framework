package com.crowdseats.framework.common.schema.event;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShowTime {
    private String showTimeId;
    private Date showDate;
    private String startTime;
    private String endTime;
}
