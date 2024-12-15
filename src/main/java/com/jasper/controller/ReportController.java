package com.jasper.controller;

import com.jasper.service.ReportService;
import lombok.RequiredArgsConstructor;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController

public class ReportController {

    @Autowired
    private  ReportService reportService;

    @GetMapping("/report/{reportFormat}")
    public String getReport(@PathVariable String reportFormat) throws JRException, FileNotFoundException {
        return reportService.exportReport(reportFormat);
    }
}
