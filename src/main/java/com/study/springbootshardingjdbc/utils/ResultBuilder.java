package com.study.springbootshardingjdbc.utils;

/**
 * @author kris
 */
public class ResultBuilder {

  public static ResultVo buildSuccess() {
    return new ResultVo();
  }

  public static ResultVo buildFail(String reason, String errorCode) {
    ResultVo resultVo = new ResultVo();
    resultVo.setResult(false);
    resultVo.setReason(reason);
    resultVo.setErrorCode(errorCode);
    return resultVo;
  }
}
