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
                LocalTime.of(5, 0),      // Monday time
                LocalTime.of(9, 30),     // Tuesday time
                LocalTime.of(8, 45),     // Wednesday time
                LocalTime.of(10, 0),     // Thursday time
                LocalTime.of(9, 15),     // Friday time
                LocalTime.of(0, 0),      // Saturday time (off day)
                LocalTime.of(0, 0) ,
                18,                      // Monday Date
                19,                      // Tuesday Date
                20,                      // Wednesday Date
                21,                      // Thursday Date
                22,                      // Friday Date
                23,                      // Saturday Date
                24                       // Sunday Date// Sunday time (off day)
        ));
        studentScoreDetails.add(new TimeSheetTableDetails(
                "Rohit",                  // Name
                "Python Developer",        // Role
                "Mar",                   // Month
                22,                      // Date
                LocalTime.of(9, 0),      // Monday time
                LocalTime.of(9, 30),     // Tuesday time
                LocalTime.of(8, 45),     // Wednesday time
                LocalTime.of(1, 0),     // Thursday time
                LocalTime.of(9, 15),     // Friday time
                LocalTime.of(0, 0),      // Saturday time (off day)
                LocalTime.of(0, 0) ,
                18,                      // Monday Date
                19,                      // Tuesday Date
                20,                      // Wednesday Date
                21,                      // Thursday Date
                22,                      // Friday Date
                23,                      // Saturday Date
                24  // Sunday time (off day)
        ));
        studentScoreDetails.add(new TimeSheetTableDetails(
                "Rana",                  // Name
                "C++ Developer",        // Role
                "Mar",                   // Month
                23,                      // Date
                LocalTime.of(9, 0),      // Monday time
                LocalTime.of(9, 30),     // Tuesday time
                LocalTime.of(8, 45),     // Wednesday time
                LocalTime.of(10, 0),     // Thursday time
                LocalTime.of(2, 15),     // Friday time
                LocalTime.of(0, 0),      // Saturday time (off day)
                LocalTime.of(0, 0),
                18,                      // Monday Date
                19,                      // Tuesday Date
                20,                      // Wednesday Date
                21,                      // Thursday Date
                22,                      // Friday Date
                23,                      // Saturday Date
                24  // Sunday time (off day)
        ));studentScoreDetails.add(new TimeSheetTableDetails(
                "Suman",                  // Name
                "C Developer",        // Role
                "Mar",                   // Month
                23,                      // Date
                LocalTime.of(9, 0),      // Monday time
                LocalTime.of(9, 30),     // Tuesday time
                LocalTime.of(8, 45),     // Wednesday time
                LocalTime.of(10, 0),     // Thursday time
                LocalTime.of(2, 15),     // Friday time
                LocalTime.of(0, 0),      // Saturday time (off day)
                LocalTime.of(0, 0),
                18,                      // Monday Date
                19,                      // Tuesday Date
                20,                      // Wednesday Date
                21,                      // Thursday Date
                22,                      // Friday Date
                23,                      // Saturday Date
                24  // Sunday time (off day)
        ));studentScoreDetails.add(new TimeSheetTableDetails(
                "Raman",                  // Name
                "Angular Developer",        // Role
                "Mar",                   // Month
                23,                      // Date
                LocalTime.of(9, 0),      // Monday time
                LocalTime.of(9, 30),     // Tuesday time
                LocalTime.of(8, 45),     // Wednesday time
                LocalTime.of(10, 0),     // Thursday time
                LocalTime.of(2, 15),     // Friday time
                LocalTime.of(0, 0),      // Saturday time (off day)
                LocalTime.of(0, 0),
                18,                      // Monday Date
                19,                      // Tuesday Date
                20,                      // Wednesday Date
                21,                      // Thursday Date
                22,                      // Friday Date
                23,                      // Saturday Date
                24  // Sunday time (off day)
        ));studentScoreDetails.add(new TimeSheetTableDetails(
                "Raju",                  // Name
                "DEVOPs Developer",        // Role
                "Mar",                   // Month
                23,                      // Date
                LocalTime.of(9, 0),      // Monday time
                LocalTime.of(9, 30),     // Tuesday time
                LocalTime.of(8, 45),     // Wednesday time
                LocalTime.of(10, 0),     // Thursday time
                LocalTime.of(2, 15),     // Friday time
                LocalTime.of(0, 0),      // Saturday time (off day)
                LocalTime.of(0, 0),
                18,                      // Monday Date
                19,                      // Tuesday Date
                20,                      // Wednesday Date
                21,                      // Thursday Date
                22,                      // Friday Date
                23,                      // Saturday Date
                24  // Sunday time (off day)
        ));studentScoreDetails.add(new TimeSheetTableDetails(
                "Virat",                  // Name
                "DEVOPs Developer",        // Role
                "Mar",                   // Month
                23,                      // Date
                LocalTime.of(9, 0),      // Monday time
                LocalTime.of(9, 30),     // Tuesday time
                LocalTime.of(8, 45),     // Wednesday time
                LocalTime.of(10, 0),     // Thursday time
                LocalTime.of(2, 15),     // Friday time
                LocalTime.of(0, 0),      // Saturday time (off day)
                LocalTime.of(0, 0),
                18,                      // Monday Date
                19,                      // Tuesday Date
                20,                      // Wednesday Date
                21,                      // Thursday Date
                22,                      // Friday Date
                23,                      // Saturday Date
                24  // Sunday time (off day)
        ));studentScoreDetails.add(new TimeSheetTableDetails(
                "Rahul",                  // Name
                "DEVOPs Developer",        // Role
                "Mar",                   // Month
                23,                      // Date
                LocalTime.of(9, 0),      // Monday time
                LocalTime.of(9, 30),     // Tuesday time
                LocalTime.of(8, 45),     // Wednesday time
                LocalTime.of(10, 0),     // Thursday time
                LocalTime.of(2, 15),     // Friday time
                LocalTime.of(0, 0),      // Saturday time (off day)
                LocalTime.of(0, 0),
                18,                      // Monday Date
                19,                      // Tuesday Date
                20,                      // Wednesday Date
                21,                      // Thursday Date
                22,                      // Friday Date
                23,                      // Saturday Date
                24  // Sunday time (off day)
        ));studentScoreDetails.add(new TimeSheetTableDetails(
                "Jaiswal",                  // Name
                "DEVOPs Developer",        // Role
                "Mar",                   // Month
                23,                      // Date
                LocalTime.of(9, 0),      // Monday time
                LocalTime.of(9, 30),     // Tuesday time
                LocalTime.of(8, 45),     // Wednesday time
                LocalTime.of(10, 0),     // Thursday time
                LocalTime.of(2, 15),     // Friday time
                LocalTime.of(0, 0),      // Saturday time (off day)
                LocalTime.of(0, 0),
                18,                      // Monday Date
                19,                      // Tuesday Date
                20,                      // Wednesday Date
                21,                      // Thursday Date
                22,                      // Friday Date
                23,                      // Saturday Date
                24  // Sunday time (off day)
        ));studentScoreDetails.add(new TimeSheetTableDetails(
                "Bumrah",                  // Name
                "DEVOPs Developer",        // Role
                "Mar",                   // Month
                23,                      // Date
                LocalTime.of(9, 0),      // Monday time
                LocalTime.of(9, 30),     // Tuesday time
                LocalTime.of(8, 45),     // Wednesday time
                LocalTime.of(10, 0),     // Thursday time
                LocalTime.of(2, 15),     // Friday time
                LocalTime.of(0, 0),      // Saturday time (off day)
                LocalTime.of(0, 0),
                18,                      // Monday Date
                19,                      // Tuesday Date
                20,                      // Wednesday Date
                21,                      // Thursday Date
                22,                      // Friday Date
                23,                      // Saturday Date
                24  // Sunday time (off day)
        ));studentScoreDetails.add(new TimeSheetTableDetails(
                "Naman",                  // Name
                "DEVOPs Developer",        // Role
                "Mar",                   // Month
                23,                      // Date
                LocalTime.of(9, 0),      // Monday time
                LocalTime.of(9, 30),     // Tuesday time
                LocalTime.of(8, 45),     // Wednesday time
                LocalTime.of(10, 0),     // Thursday time
                LocalTime.of(2, 15),     // Friday time
                LocalTime.of(0, 0),      // Saturday time (off day)
                LocalTime.of(0, 0),
                18,                      // Monday Date
                19,                      // Tuesday Date
                20,                      // Wednesday Date
                21,                      // Thursday Date
                22,                      // Friday Date
                23,                      // Saturday Date
                24  // Sunday time (off day)
        ));
studentScoreDetails.add(new TimeSheetTableDetails(
                "Modi",                  // Name
                "DEVOPs Developer",        // Role
                "Mar",                   // Month
                23,                      // Date
                LocalTime.of(9, 0),      // Monday time
                LocalTime.of(9, 30),     // Tuesday time
                LocalTime.of(8, 45),     // Wednesday time
                LocalTime.of(10, 0),     // Thursday time
                LocalTime.of(2, 15),     // Friday time
                LocalTime.of(0, 0),      // Saturday time (off day)
                LocalTime.of(0, 0),
                18,                      // Monday Date
                19,                      // Tuesday Date
                20,                      // Wednesday Date
                21,                      // Thursday Date
                22,                      // Friday Date
                23,                      // Saturday Date
                24  // Sunday time (off day)
        ));studentScoreDetails.add(new TimeSheetTableDetails(
                "Rahul Gandhi",                  // Name
                "DEVOPs Developer",        // Role
                "Mar",                   // Month
                23,                      // Date
                LocalTime.of(9, 0),      // Monday time
                LocalTime.of(9, 30),     // Tuesday time
                LocalTime.of(8, 45),     // Wednesday time
                LocalTime.of(10, 0),     // Thursday time
                LocalTime.of(2, 15),     // Friday time
                LocalTime.of(0, 0),      // Saturday time (off day)
                LocalTime.of(0, 0),
                18,                      // Monday Date
                19,                      // Tuesday Date
                20,                      // Wednesday Date
                21,                      // Thursday Date
                22,                      // Friday Date
                23,                      // Saturday Date
                24  // Sunday time (off day)
        ));studentScoreDetails.add(new TimeSheetTableDetails(
                "Sudhir Gandhi",                  // Name
                "DEVOPs Developer",        // Role
                "Mar",                   // Month
                23,                      // Date
                LocalTime.of(9, 0),      // Monday time
                LocalTime.of(9, 30),     // Tuesday time
                LocalTime.of(8, 45),     // Wednesday time
                LocalTime.of(10, 0),     // Thursday time
                LocalTime.of(2, 15),     // Friday time
                LocalTime.of(0, 0),      // Saturday time (off day)
                LocalTime.of(0, 0),
                18,                      // Monday Date
                19,                      // Tuesday Date
                20,                      // Wednesday Date
                21,                      // Thursday Date
                22,                      // Friday Date
                23,                      // Saturday Date
                24  // Sunday time (off day)
        ));

        int totalHours = 0;
        // Calculate total hours for each user (ignoring minutes)
        for (TimeSheetTableDetails user : studentScoreDetails) {

            // Sum up hours for each day worked (ignore minutes)
            totalHours += user.getTimeMon().getHour();
            totalHours += user.getTimeTue().getHour();
            totalHours += user.getTimeWed().getHour();
            totalHours += user.getTimeThu().getHour();
            totalHours += user.getTimeFri().getHour();
            // No need to add Saturday and Sunday as they are off days (time is 0)

            // Output the total hours as an integer
          //  System.out.println(user.getName() + " worked a total of " + totalHours + " hours.");
        }


        JRBeanCollectionDataSource tabledataSource = new JRBeanCollectionDataSource(studentScoreDetails);

        //create hashmap object  to store parameter
        Map<String,Object> parameters = new HashMap<>();
        parameters.put("TIME_SHEET",tabledataSource);
        parameters.put("companyName","Google");
        parameters.put("year",2009);
        parameters.put("week",12);
        parameters.put("totalhours",totalHours);

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
