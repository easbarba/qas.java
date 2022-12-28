package dev.easbarba.zae;

import java.nio.file.Path;
import java.util.List;

public class Common {
    public List<Path> configuration() {
        var data = new Data();
        var config = new Config();

        return config.All(data.getConfigDir(), data.listOfConfigFiles());
    }
}
