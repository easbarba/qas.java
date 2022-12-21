package dev.easbarba.zae;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Data {
    private final Path userHome = Paths.get(System.getProperty("user.home"));
    private String ConfigDir = Paths.get(userHome.toString(), ".config", "zae").toString();

    public Path getHome() {
        return userHome;
    }

    public String getConfigDir() {
        return ConfigDir;
    }

    public String[] listOfConfigFiles() {
        return new File(ConfigDir).list();
    }
}
