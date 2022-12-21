package dev.easbarba.zae;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConfigTests {
  private final Config config = new Config();

  @Test
  @DisplayName("😱")
  public void returnWord() {
    assertEquals("meh", config.meh());
  }
}
