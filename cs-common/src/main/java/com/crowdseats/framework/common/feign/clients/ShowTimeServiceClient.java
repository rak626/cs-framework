package com.crowdseats.framework.common.feign.clients;

import com.crowdseats.framework.common.Response;
import com.crowdseats.framework.common.schema.event.EventRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "showtime-service")
public interface ShowTimeServiceClient {

    @PostMapping("/showtime/create")
    Response<?> createShowTime(@RequestBody EventRequest eventRequest);
}
