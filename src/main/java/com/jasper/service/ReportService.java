package com.jasper.service;

import com.jasper.entity.TimeSheetDetails;
import com.jasper.entity.TimeSheetTableDetails;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {

    public String exportReport(String resportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Test app\\jasperReport\\template.jasper";
//        List<Student> student = studentRepository.findAll();
        // Optional<Student> byId = studentRepository.findById(1);
        JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(path);

        List<TimeSheetDetails> studentDetails = new ArrayList<>();
        studentDetails.add(new TimeSheetDetails("Google", 2023, 12, 34));
        studentDetails.add(new TimeSheetDetails("Microsoft", 2022, 10, 40));
        // studentDetails.add(byId.get());

//        File file = ResourceUtils.getFile("classpath:Blank_A4.jrxml");
//        JasperReport jr = JasperCompileManager.compileReport(file.getAbsolutePath());

        JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(studentDetails);

        List<TimeSheetTableDetails> studentScoreDetails = new ArrayList<>();
        studentScoreDetails.add(new TimeSheetTableDetails(
                "Ramu",                  // Name
                "JAVA Developer",        // Role
                "Mar",                   // Month
                21,                      // Date
                LocalTime.of(9, 0),      // Monday time
                LocalTime.of(9, 30),     // Tuesday time
                LocalTime.of(8, 45),     // Wednesday time
                LocalTime.of(10, 0),     // Thursday time
                LocalTime.of(9, 15),     // Friday time
                LocalTime.of(0, 0),      // Saturday time (off day)
                LocalTime.of(0, 0)       // Sunday time (off day)
        ));
        studentScoreDetails.add(new TimeSheetTableDetails(
                "Rohit",                  // Name
                "Python Developer",        // Role
                "Mar",                   // Month
                21,                      // Date
                LocalTime.of(9, 0),      // Monday time
                LocalTime.of(9, 30),     // Tuesday time
                LocalTime.of(8, 45),     // Wednesday time
                LocalTime.of(1, 0),     // Thursday time
                LocalTime.of(9, 15),     // Friday time
                LocalTime.of(0, 0),      // Saturday time (off day)
                LocalTime.of(0, 0)       // Sunday time (off day)
        ));
        studentScoreDetails.add(new TimeSheetTableDetails(
                "Rana",                  // Name
                "C++ Developer",        // Role
                "Mar",                   // Month
                21,                      // Date
                LocalTime.of(9, 0),      // Monday time
                LocalTime.of(9, 30),     // Tuesday time
                LocalTime.of(8, 45),     // Wednesday time
                LocalTime.of(10, 0),     // Thursday time
                LocalTime.of(2, 15),     // Friday time
                LocalTime.of(0, 0),      // Saturday time (off day)
                LocalTime.of(0, 0)       // Sunday time (off day)
        ));


        JRBeanCollectionDataSource tabledataSource = new JRBeanCollectionDataSource(studentScoreDetails);

        //create hashmap object  to store parameter
        Map<String,Object> parameters = new HashMap<>();
        parameters.put("TIME_SHEET",tabledataSource);
        parameters.put("companyName","Google");
        parameters.put("year",2009);
        parameters.put("week",12);
        parameters.put("totalhours",223);

        JasperPrint jp = JasperFillManager.fillReport(jasperReport,parameters,ds);

        if(resportFormat.equalsIgnoreCase("html")){
            JasperExportManager.exportReportToHtmlFile(jp,path+"\\students.html");
        }

//        if(resportFormat.equalsIgnoreCase("pdf")){
//            JasperExportManager.exportReportToPdfFile(jp,path+"\\students.pdf");
//        }

        JasperExportManager.exportReportToPdfFile(jp,"C:\\Test app\\generatedJasperReport\\StudentScoreCard.pdf");

        return "File Created success At Path"+path;
    }

}
