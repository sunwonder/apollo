package com.ctrip.framework.apollo.core.enums;

import com.ctrip.framework.apollo.core.utils.StringUtils;

public final class EnvUtils {
  
  public static Env transformEnv(String envName) {
    if (StringUtils.isBlank(envName)) {
      return Env.UNKNOWN;
    }
    switch (envName.trim().toUpperCase()) {
      case "LPT":
        return Env.LPT;
      case "FAT":
      case "FWS":
        return Env.FAT;
      case "UAT":
        return Env.UAT;
      case "PRO":
      case "PROD": //just in case
        return Env.PRO;
      case "DEV":
        return Env.DEV;
      case "LOCAL":
        return Env.LOCAL;
      case "TOOLS":
        return Env.TOOLS;
      case "SIT":
        return Env.SIT;
      case "BLIQ":
        return Env.BLIQ;
      case "CHNG":
        return Env.CHNG;
      case "DEMO":
        return Env.DEMO;
      case "FUN":
        return Env.FUN;
      case "PER":
        return Env.PER;
      case "STAGING":
        return Env.STAGING;
      case "IGEN":
        return Env.IGEN;
      case "IGEN2":
        return Env.IGEN2;
      case "IGEN3":
        return Env.IGEN3;
      case "IGEN4":
        return Env.IGEN4;
      case "IGEN5":
        return Env.IGEN5;
      default:
        return Env.UNKNOWN;
    }
  }
}
