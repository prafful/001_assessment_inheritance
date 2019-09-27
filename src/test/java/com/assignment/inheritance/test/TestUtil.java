package com.assignment.inheritance.test;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class TestUtil {
    
      public static String circlearea = "../inhProblem.properties";
      public static String cylbasearea = "../inhProblem.properties";
      public static String cylvol = "../inhProblem.properties";
      public static String surfarea = "../inhProblem.properties";
      
      public static Properties getForProblem1() throws Exception{
          Properties properties = new Properties();
          FileInputStream fis = new FileInputStream(new File(circlearea));
          properties.load(fis);  
          fis.close();
          return properties;
      }
      
      public static Properties getForProblem2() throws Exception{
          Properties properties = new Properties();
          FileInputStream fis = new FileInputStream(new File(cylbasearea));
          properties.load(fis);  
          fis.close();
          return properties;
      }
      
      public static Properties getForProblem3() throws Exception{
          Properties properties = new Properties();
          FileInputStream fis = new FileInputStream(new File(cylvol));
          properties.load(fis);  
          fis.close();
          return properties;
      }
      public static Properties getForProblem4() throws Exception{
          Properties properties = new Properties();
          FileInputStream fis = new FileInputStream(new File(surfarea));
          properties.load(fis);  
          fis.close();
          return properties;
      }
}
