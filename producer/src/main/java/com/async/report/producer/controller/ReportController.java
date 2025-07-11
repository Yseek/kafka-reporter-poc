package com.async.report.producer.controller;

import com.async.report.ReportDto;
import com.async.report.producer.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reports")
@RequiredArgsConstructor
public class ReportController {

    private final KafkaProducerService producerService;

    @PostMapping
    public String sendReport(@RequestBody ReportDto reportDto) {
        producerService.send(reportDto);
        return "리포트 전송 완료";
    }
}
