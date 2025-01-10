package com.jooree.util;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CheckDevice {
    private static final Logger logger = LoggerFactory.getLogger(CheckDevice.class);

    public static String checkMobile(HttpServletRequest request) {
        String header = request.getHeader("User-Agent").toLowerCase().replaceAll(" ", "");
        String result = "pc";

        try{
            if(header.contains("mobile")){
                result = "mobile";
            }else if(header.contains("tablet")){
                result = "tablet";
            }else{
                result = "pc";
            }
            return result;
        }catch (Exception e) {
            logger.error(e.getMessage());
            return result;
        }
    }
}
