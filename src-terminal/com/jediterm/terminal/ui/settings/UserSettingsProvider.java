package com.jediterm.terminal.ui.settings;

import java.awt.Font;

import com.jediterm.terminal.TextStyle;
import com.jediterm.terminal.TtyConnector;
import com.jediterm.terminal.emulator.ColorPalette;

public interface UserSettingsProvider {
  ColorPalette getTerminalColorPalette();

  Font getTerminalFont();

  float getTerminalFontSize();

  float getLineSpace();

  TextStyle getDefaultStyle();

  TextStyle getSelectionColor();

  boolean useInverseSelectionColor();

  public boolean emulateX11CopyPaste();

  boolean useAntialiasing();

  boolean shouldCloseTabOnLogout(TtyConnector ttyConnector);
  
  boolean audibleBell();
  
  boolean enableMouseReporting();
  
  int caretBlinkingMs();
}
