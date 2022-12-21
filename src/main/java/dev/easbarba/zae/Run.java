package dev.easbarba.zae;

import java.nio.file.Path;
import java.util.List;

public class Run {
    public List<Path> configuration() {
        var data = new Data();
        var config = new Config();

        return config.Found(data.getConfigDir(), data.listOfConfigFiles());
    }
}
