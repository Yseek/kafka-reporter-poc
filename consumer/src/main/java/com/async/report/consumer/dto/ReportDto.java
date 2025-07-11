package com.async.report.consumer.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class ReportDto {

    private String reportName;
    private String reporter;
    private String content;
}
