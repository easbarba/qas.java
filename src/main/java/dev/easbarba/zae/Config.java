package dev.easbarba.zae;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Config {
    public List<Path> All(String configDir, String[] ConfigFiles) {
        return Stream.of(ConfigFiles).filter(f -> f.endsWith(".json")).map(y -> Paths.get(configDir, y)).toList();
    }
}
