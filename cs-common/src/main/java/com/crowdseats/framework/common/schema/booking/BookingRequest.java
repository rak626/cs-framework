package com.crowdseats.framework.common.schema.booking;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingRequest {
    private String eventId;
    private String showTimeId;
    private String priceId;
    private Integer noOfSeats;
    private String userId;
}
