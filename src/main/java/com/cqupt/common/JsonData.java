package com.cqupt.common;

import lombok.Data;

import java.util.List;
@Data
public class JsonData {
    private Integer code = 0;
    private String msg = "";
    private long count;
    private List data;
}
