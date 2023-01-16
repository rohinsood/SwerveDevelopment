package frc.robot.subsystems.drive;

import org.littletonrobotics.junction.LogTable;
import org.littletonrobotics.junction.inputs.LoggableInputs;

public class GyroIOInputsAutoLogged extends GyroIO.GyroIOInputs
    implements LoggableInputs, Cloneable {
  public void toLog(LogTable table) {
    table.put("Connected", connected);
    table.put("PositionRad", positionRad);
    table.put("VelocityRadPerSec", velocityRadPerSec);
  }

  public void fromLog(LogTable table) {
    connected = table.getBoolean("Connected", connected);
    positionRad = table.getDouble("PositionRad", positionRad);
    velocityRadPerSec = table.getDouble("VelocityRadPerSec", velocityRadPerSec);
  }

  public GyroIOInputsAutoLogged clone() {
    GyroIOInputsAutoLogged copy = new GyroIOInputsAutoLogged();
    connected = connected;
    positionRad = positionRad;
    velocityRadPerSec = velocityRadPerSec;
    return copy;
  }
}
