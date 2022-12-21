package dev.easbarba.zae;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DataTests {
  private final Data data = new Data();

  @Test
  @DisplayName("😱")
  public void getConfigurationDirectory() {
    assertEquals(data.getHome() + "/.config/zae", data.getConfigDir());
  }
}
