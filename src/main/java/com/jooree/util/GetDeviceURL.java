package com.jooree.util;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class GetDeviceURL {
    private static final Logger logger = LoggerFactory.getLogger(GetDeviceURL.class);

    public static String getFullURL(String deviceNm, String dirURL) {

        return deviceNm + "_" + dirURL;

        /*try{
            return deviceNm + "/" + dirURL;
        }catch (Exception e) {
            logger.error(e.getMessage());
            return result;
        }*/
    }
}
