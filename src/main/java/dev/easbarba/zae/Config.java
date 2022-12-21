package dev.easbarba.zae;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Config {
    public List<Path> Found(String configDir, String[] listOfConfigFiles) {
        return Stream.of(listOfConfigFiles).filter(f -> f.endsWith(".json")).map(y -> Paths.get(configDir, y)).toList();
    }
}
