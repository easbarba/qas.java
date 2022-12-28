package dev.easbarba.zae;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AppTests {
    @Test
    void getAllConfigFiles() {
        List<Path> files = new ArrayList<Path>();
        files.add(Path.of("/home/easbarba/.config/zae/apk.json"));
        files.add(Path.of("/home/easbarba/.config/zae/apt.json"));
        files.add(Path.of("/home/easbarba/.config/zae/dnf.json"));

        assertEquals(files, new Common().configuration());
    }

}
