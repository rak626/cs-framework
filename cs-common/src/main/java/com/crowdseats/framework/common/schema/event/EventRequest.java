package com.crowdseats.framework.common.schema.event;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventRequest {
    private EventObject event;
    private List<ShowTime> showTimes;
    private List<Pricing> pricing;
}

