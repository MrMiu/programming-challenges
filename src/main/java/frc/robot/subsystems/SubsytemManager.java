package frc.robot.subsystems;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.SPI;
import frc.robot.Constants;
import frc.robot.devices.MotorWithEncoder;
import frc.robot.devices.real.AHRSDevice;
import frc.robot.devices.real.CANSparkMaxMotor;
import frc.robot.devices.real.RealDutyCycleEncoder;
import frc.robot.devices.real.TalonSRXFollower;
import frc.robot.devices.real.TalonSRXMotor;
import frc.robot.devices.real.TurretEncoder;
import frc.robot.util.CougarAxisCamera;

// can we remove all of the m_ 

public class SubsystemManager {
    
    protected static SubsystemManager instance = null;

    protected BoardSubsystem board; // write out name ex. driveTrain

    public SubsystemManager() {
        if(instance != null) {
            return;
        }
        instance = this;

        if () {
            //need different conversions for distance vs velocity
            MotorWithEncoder frontLeft = new CANSparkMaxMotor("DT Front Left Motor", "DT Front Left Encoder", Constants.neoFrontLeft, MotorType.kBrushless, Constants.dtConversionFactor * 60, Constants.dtConversionFactor );
            MotorWithEncoder frontRight = new CANSparkMaxMotor("DT Front Right Motor", "DT Front Right Encoder", Constants.neoFrontRight, MotorType.kBrushless, Constants.dtConversionFactor * 60, Constants.dtConversionFactor);
            
            board = new BoardSubsystem(
                new CANSparkMax(),
                new DigitalInput(),
                new Ultrasonic(),
            );
            
            board.register();
        }

    }

    public BoardSubsystem getBoard() {
        return board;
    }

    public static SubsystemManager getInstance() {
        return instance;
    }

    public void register(){
        board.register();
    }

}
