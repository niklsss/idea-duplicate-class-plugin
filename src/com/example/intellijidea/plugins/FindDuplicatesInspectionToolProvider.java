package com.example.intellijidea.plugins;

import com.intellij.codeInspection.InspectionToolProvider;

/**
 * @author niklsss
 */
public class FindDuplicatesInspectionToolProvider implements InspectionToolProvider {
  public Class[] getInspectionClasses() {
    return new Class[]{FindDuplicatesInspection.class};
  }
}
