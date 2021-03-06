package com.slack.api.methods.response.emoji;

import com.slack.api.methods.SlackApiResponse;
import lombok.Data;

import java.util.Map;

@Data
public class EmojiListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private Map<String, String> emoji;
    private String cacheTs;
}