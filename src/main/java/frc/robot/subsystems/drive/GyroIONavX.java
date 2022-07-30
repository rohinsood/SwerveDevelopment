// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drive;

import frc.robot.Constants;

public class GyroIONavX implements GyroIO {

  public GyroIONavX() {

    // The navX is the standard gyro that we've used on all of our existing robots. It's possible
    // that the swerve base will use a different sensor, but please fill in this implementation as a
    // backup (and because it's good practice).

    switch (Constants.getRobot()) {
      case ROBOT_SIMBOT:
        // Instantiate the navX - use the 2022 code as an example.
        break;
      default:
        throw new RuntimeException("Invalid robot for GyroIONavX");
    }
  }

  @Override
  public void updateInputs(GyroIOInputs inputs) {
    // Again, the 2022 code base has good examples for reading this data. We generally prefer to use
    // "getAngle" instead of "getYaw" (what's the difference?)
    //
    // Remember to pay attention to the UNITS.
  }
}
