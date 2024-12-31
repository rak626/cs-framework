package com.crowdseats.framework.common.schema.event;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pricing {
    private String showTimeId;
    private String seatCategory;
    private double price;
}
