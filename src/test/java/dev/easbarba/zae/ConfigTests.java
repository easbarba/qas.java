package dev.easbarba.zae;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ConfigTests {
    private Config config = new Config();

    @Test
    void getConfigDir() {
        var files = new String[] { ".config/zae/apk.json", ".config/zae/apt.json", ".config/zae/dnf.json" };

        List<Path> filePathsFound = new ArrayList<Path>();
        filePathsFound.add(Path.of("/home/user/.config/zae/apk.json"));
        filePathsFound.add(Path.of("/home/user/.config/zae/apt.json"));
        filePathsFound.add(Path.of("/home/user/.config/zae/dnf.json"));

        assertEquals(filePathsFound, config.Found("/home/user", files));
    }
}
