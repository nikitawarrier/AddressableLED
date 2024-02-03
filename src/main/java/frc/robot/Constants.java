// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.util.Color8Bit;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  /**
   * Defines constant values for robot components.
   */
  public static class RobotConstants {
    /**
     * PMW Ports.
     */
    public static class PWMPort{
      public static final int LED = 2;
      public static final int LightningLED = 2;
    }

    /**
     * CAN Ids
     */
   
    /**
     * The number of LEDs on the addressable LED string.
     */
    public static final int LED_COUNT = 9;
  }
    public static class ColorConstants {
      public static final Color8Bit BLACK = new Color8Bit(0,0,0);
      public static final Color8Bit WHITE = new Color8Bit(200, 200, 200);
      public static final Color8Bit RED = new Color8Bit(204,0,0);
      public static final Color8Bit ORANGE = new Color8Bit(255,40,1);
      public static final Color8Bit YELLOW = new Color8Bit(200,70,0);
      public static final Color8Bit GREEN = new Color8Bit(10,204,0);
      public static final Color8Bit BLUE = new Color8Bit(0,0,250);
      public static final Color8Bit PURPLE = new Color8Bit(210, 10, 255);
      public static final Color8Bit PINK = new Color8Bit(255,5,100);
      public static final Color8Bit LIGHTBLUE = new Color8Bit(50,190,240);

      public static final Color8Bit COLORS[] = { BLACK, WHITE, RED, ORANGE, YELLOW, GREEN, BLUE, LIGHTBLUE, PURPLE, PINK};

     }
    
  

}
