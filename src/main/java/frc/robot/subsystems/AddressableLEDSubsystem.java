// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import static frc.robot.Constants.ColorConstants.*;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.RobotConstants;
import frc.robot.Constants.RobotConstants.PWMPort;
import frc.robot.util.AddressableLEDs;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj.util.Color8Bit;

public class AddressableLEDSubsystem extends SubsystemBase {
  private AddressableLEDs leds = new AddressableLEDs(PWMPort.LED, RobotConstants.LED_COUNT);
  private boolean enabled;
  private boolean toggle = false;

  /** Creates a new AddressableLEDSubsystem. */
  public AddressableLEDSubsystem() {
    leds.start();
    leds.setColor(RED);
    leds.commitColor();
  }

  public void setColor(Color8Bit color, int index) {
    leds.setColor(color, index);
  }

  public void commitColor() {
    leds.commitColor();
  }

  public void fillColor(Color8Bit color){
    leds.setColor(color);
  }

  public void fillAndCommitColor(Color8Bit color) {
    leds.setColor(color);
    commitColor();
  }

  public void start() {
    leds.start();
    enabled = true;
  }

  public void stop() {
    enabled = false;
  }

  public boolean isEnabled() {
    return enabled;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
