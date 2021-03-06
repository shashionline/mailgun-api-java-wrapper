package com.storakle.mailgun.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Webhook
{
    @JsonProperty(value = JsonConstants.URL)
    private String url;
}
