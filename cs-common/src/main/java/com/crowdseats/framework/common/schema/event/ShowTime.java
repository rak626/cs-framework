package com.crowdseats.framework.common.schema.event;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShowTime {
    private String showTimeId;
    private String date;
    private String startTime;
    private String endTime;
}
