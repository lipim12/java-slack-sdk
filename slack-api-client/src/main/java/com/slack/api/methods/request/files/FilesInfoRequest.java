package com.slack.api.methods.request.files;

import com.slack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FilesInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `files:read`
     */
    private String token;

    /**
     * Specify a file by providing its ID.
     */
    private String file;

    private Integer count;

    private Integer page;

}