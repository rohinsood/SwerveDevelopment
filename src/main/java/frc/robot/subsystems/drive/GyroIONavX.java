// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drive;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.SPI;

/** IO implementation for NavX */
public class GyroIONavX implements GyroIO {
  private final AHRS gyro;
  private final double[] xyzDps = new double[3]; // x, y, z in degrees/second

  public GyroIONavX() {
    gyro = new AHRS(SPI.Port.kMXP);
  }

  public void updateInputs(GyroIOInputs inputs) {
    // Again, the 2022 code base has good examples for reading this data. We generally prefer to use
    // "getAngle" instead of "getYaw" (what's the difference?)
    //
    // Remember to pay attention to the UNITS.
    xyzDps[0] = gyro.getRawGyroX();
    xyzDps[1] = gyro.getRawAccelY();
    xyzDps[2] = gyro.getRawAccelZ();
    inputs.connected = gyro.isConnected();
    inputs.positionRad = Units.degreesToRadians(gyro.getYaw());
    inputs.velocityRadPerSec = Units.degreesToRadians(xyzDps[2]);
  }
}
