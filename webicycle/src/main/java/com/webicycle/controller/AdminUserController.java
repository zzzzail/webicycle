package com.webicycle.controller;

import com.webicycle.SystemException;
import com.webicycle.service.AdminUserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangxq
 * @since 2023/11/1
 */
@Controller
@RequestMapping("/adminUser")
public class AdminUserController {
    
    @Autowired
    private AdminUserService adminUserService;
    
    @GetMapping("/test")
    @ResponseBody
    public String test(HttpServletRequest request) {
        try {
            
            HttpSession session = request.getSession();
            session.setAttribute("name", "Zail");
            
            var res = adminUserService.getById(1L);
            return res.toString();
        }
        catch (SystemException e) {
        
        }
        catch (Exception e) {
        
        }
        return "";
    }
    
    @GetMapping("/test2")
    @ResponseBody
    public String test2(HttpServletRequest request) {
        HttpSession session = request.getSession();
        System.out.println(session);
        return "111";
    }
}
