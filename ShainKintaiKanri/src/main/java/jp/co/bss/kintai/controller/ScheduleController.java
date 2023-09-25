package jp.co.bss.kintai.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.bss.kintai.model.DayWithColor;

@Controller
public class ScheduleController {

    @GetMapping("/schedule")
    public String getSchedule(Model model) {
        model.addAttribute("weeks", generateMonthDays(getCurrentMonth()));
        return "schedule";
    }
    

    
    @GetMapping("/api/dates")
    @ResponseBody
    public List<List<DayWithColor>> getDates(@RequestParam(name = "month", required = false) Integer month) {
        return generateMonthDays(month);
    }
    
    private int getCurrentMonth() {
        return LocalDate.now().getMonthValue();
    }



    private List<List<DayWithColor>> generateMonthDays(int month) {
        List<List<DayWithColor>> weeks = new ArrayList<>();
        
        LocalDate today = LocalDate.now();
        LocalDate monthDate = today.withMonth(month); // 使用给定的月份
        LocalDate startOfMonth = monthDate.withDayOfMonth(1);
        
        int dayOfWeekStart = startOfMonth.getDayOfWeek().getValue() % 7;
        int daysInMonth = monthDate.lengthOfMonth();
        int daysOfLastMonth = (month == 1) ? LocalDate.of(monthDate.getYear() - 1, 12, 1).lengthOfMonth() : monthDate.minusMonths(1).lengthOfMonth();

        int dayCounter = 1 - dayOfWeekStart;

        for (int i = 0; i < 5; i++) {
            List<DayWithColor> week = new ArrayList<>();
            for (int j = 0; j < 7; j++, dayCounter++) {
                DayWithColor dwc = new DayWithColor();
                if (dayCounter > 0 && dayCounter <= daysInMonth) {
                    dwc.setDay(dayCounter);
                    dwc.setColor("black");
                } else {
                    if (dayCounter <= 0) {
                        dwc.setDay(daysOfLastMonth + dayCounter);
                    } else {
                        dwc.setDay(dayCounter - daysInMonth);
                    }
                    dwc.setColor("gray");
                }
                week.add(dwc);
            }
            weeks.add(week);
        }
        return weeks;
    }



}
