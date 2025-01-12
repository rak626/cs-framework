package com.crowdseats.framework.common.feign.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "event-service")
public interface EventServiceClient {
}
