package com.study.springbootshardingjdbc.utils;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

/**
 * @author kris
 */
@Data
public class ResultVo implements Serializable {

  private static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
  private boolean result = true;
  private String reason = "success";
  private String errorCode = "0";
  private int numRows = 0;
  private Object obj;

  public ResultVo() {
  }

  public ResultVo with(String key, Object value) {
    if (this.obj == null) {
      this.obj = new HashMap();
    }

    if (this.obj instanceof Map) {
      Map<String, Object> map = (Map) this.obj;
      map.put(key, value);
    }

    return this;
  }

  public String getServerTime() {
    return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date());
  }
}

