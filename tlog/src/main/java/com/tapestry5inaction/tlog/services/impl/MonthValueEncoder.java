package com.tapestry5inaction.tlog.services.impl;


import com.tapestry5inaction.tlog.entities.Month;
import com.tapestry5inaction.tlog.utils.AppUtils;
import org.apache.tapestry5.ValueEncoder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MonthValueEncoder implements ValueEncoder<Month> {

    public String toClient(Month value) {
        Date start = value.getStart();
        return newFormat().format(start);
    }

    public Month toValue(String clientValue) {
        if(AppUtils.isBlank(clientValue)){
            return null;
        }

        try {
            return new Month(newFormat().parse(clientValue));
        } catch (ParseException e) {
            return null;
        }
    }

    private SimpleDateFormat newFormat(){
        return new SimpleDateFormat("yyyy-MM");
    }
}