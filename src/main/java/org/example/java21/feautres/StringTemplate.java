package org.example.java21.feautres;

import static java.util.FormatProcessor.FMT;


class StringTemplate {

    public static void main() {

        StringTemplate obj = new StringTemplate();
        System.out.println(obj.interpolationUsingSTRProcessor("Great", "28", "Celsius"));
        System.out.println(obj.interpolationOfJSONBlock("Great", "28", "Celsius"));
        System.out.println(obj.interpolationOfJSONBlockWithFMT("Great", 28.533535f, "Celsius"));

    }

    String interpolationUsingSTRProcessor(String feelsLike, String temperature, String unit) {
        return STR
                ."Today's weather is \{feelsLike}, with a temperature of \{temperature} degrees \{unit}";
    }



    String interpolationOfJSONBlock(String feelsLike, String temperature, String unit) {
        return STR
                ."""
      {
        "feelsLike": "\{feelsLike}",
        "temperature": "\{temperature}",
        "unit": "\{unit}"
      }
      """;
    }

    String interpolationOfJSONBlockWithFMT(String feelsLike, float temperature, String unit) {
        return FMT
                ."""
      {
        "feelsLike": "%1s\{feelsLike}",
        "temperature": "%2.3f\{temperature}",
        "unit": "%1s\{unit}"
      }
      """;
    }

}
