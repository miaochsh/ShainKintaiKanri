package jp.co.bss.kintai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SharedFilesController {
    @GetMapping("/sharedFiles")
    public String showSharedFiles() {
        return "fileSearch";
    }
}
