package utils;

import aquality.selenium.core.utilities.JsonSettingsFile;
import java.io.File;
import java.io.IOException;

public class GetDataFromJson {
    public static String getTestData(String value) {
        JsonSettingsFile jsonSettingsFile = null;
        try {
            jsonSettingsFile = new JsonSettingsFile(new File("testData.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return String.valueOf(jsonSettingsFile.getValue("/" + value));
    }

    public static String getSettingData(String value) {
        JsonSettingsFile jsonSettingsFile = null;
        try {
            jsonSettingsFile = new JsonSettingsFile(new File("settings.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return String.valueOf(jsonSettingsFile.getValue("/" + value));
    }

    public static Object getSettingObject(String value) {
        JsonSettingsFile jsonSettingsFile = null;
        try {
            jsonSettingsFile = new JsonSettingsFile(new File("settings.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonSettingsFile.getValue("/" + value);
    }
}