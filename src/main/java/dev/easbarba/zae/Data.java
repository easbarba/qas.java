package dev.easbarba.zae;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Data {
    private final Path userHome = Paths.get(System.getProperty("user.home"));

    // Default configuration directory.
    private String ConfigDir = Paths.get(userHome.toString(), ".config", "zae").toString();

    // User set XDG_CONFIG_HOME value
    private String XDGConfigDir = Paths.get(System.getenv("XDG_CONFIG_HOME"), "zae").toString();

    public Path getHome() {
        return userHome;
    }

    // Return XDG_CONFIG_HOME value or default configuration directory.
    public String getConfigDir() {
        if (System.getenv("XDG_CONFIG_HOME") != null) {
            return XDGConfigDir;
        }

        return ConfigDir;
    }

    // List of configuration basename files found.
    public String[] ConfigFiles() {
        return new File(ConfigDir).list();
    }
}
