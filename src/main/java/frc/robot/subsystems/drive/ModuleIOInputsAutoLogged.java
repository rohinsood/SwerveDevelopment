package frc.robot.subsystems.drive;

import org.littletonrobotics.junction.LogTable;
import org.littletonrobotics.junction.inputs.LoggableInputs;

public class ModuleIOInputsAutoLogged extends ModuleIO.ModuleIOInputs
    implements LoggableInputs, Cloneable {
  public void toLog(LogTable table) {
    table.put("DrivePositionRad", drivePositionRad);
    table.put("DriveVelocityRadPerSec", driveVelocityRadPerSec);
    table.put("DriveVelocityFilteredRadPerSec", driveVelocityFilteredRadPerSec);
    table.put("DriveAppliedVolts", driveAppliedVolts);
    table.put("DriveCurrentAmps", driveCurrentAmps);
    table.put("DriveTempCelcius", driveTempCelcius);
    table.put("TurnAbsolutePositionRad", turnAbsolutePositionRad);
    table.put("TurnPositionRad", turnPositionRad);
    table.put("TurnVelocityRadPerSec", turnVelocityRadPerSec);
    table.put("TurnAppliedVolts", turnAppliedVolts);
    table.put("TurnCurrentAmps", turnCurrentAmps);
    table.put("TurnTempCelcius", turnTempCelcius);
  }

  public void fromLog(LogTable table) {
    drivePositionRad = table.getDouble("DrivePositionRad", drivePositionRad);
    driveVelocityRadPerSec =
        table.getDouble("DriveVelocityRadPerSec", driveVelocityRadPerSec);
    driveVelocityFilteredRadPerSec = table.getDouble(
        "DriveVelocityFilteredRadPerSec", driveVelocityFilteredRadPerSec);
    driveAppliedVolts = table.getDouble("DriveAppliedVolts", driveAppliedVolts);
    driveCurrentAmps =
        table.getDoubleArray("DriveCurrentAmps", driveCurrentAmps);
    driveTempCelcius =
        table.getDoubleArray("DriveTempCelcius", driveTempCelcius);
    turnAbsolutePositionRad =
        table.getDouble("TurnAbsolutePositionRad", turnAbsolutePositionRad);
    turnPositionRad = table.getDouble("TurnPositionRad", turnPositionRad);
    turnVelocityRadPerSec =
        table.getDouble("TurnVelocityRadPerSec", turnVelocityRadPerSec);
    turnAppliedVolts = table.getDouble("TurnAppliedVolts", turnAppliedVolts);
    turnCurrentAmps = table.getDoubleArray("TurnCurrentAmps", turnCurrentAmps);
    turnTempCelcius = table.getDoubleArray("TurnTempCelcius", turnTempCelcius);
  }

  public ModuleIOInputsAutoLogged clone() {
    ModuleIOInputsAutoLogged copy = new ModuleIOInputsAutoLogged();
    drivePositionRad = drivePositionRad;
    driveVelocityRadPerSec = driveVelocityRadPerSec;
    driveVelocityFilteredRadPerSec = driveVelocityFilteredRadPerSec;
    driveAppliedVolts = driveAppliedVolts;
    driveCurrentAmps = ((double[]) driveCurrentAmps.clone());
    driveTempCelcius = ((double[]) driveTempCelcius.clone());
    turnAbsolutePositionRad = turnAbsolutePositionRad;
    turnPositionRad = turnPositionRad;
    turnVelocityRadPerSec = turnVelocityRadPerSec;
    turnAppliedVolts = turnAppliedVolts;
    turnCurrentAmps = ((double[]) turnCurrentAmps.clone());
    turnTempCelcius = ((double[]) turnTempCelcius.clone());
    return copy;
  }
}
