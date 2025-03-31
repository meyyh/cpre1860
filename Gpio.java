import com.pi4j.Pi4J;
import com.pi4j.boardinfo.util.BoardInfoHelper;
import com.pi4j.io.gpio.digital.DigitalInput;
import com.pi4j.io.gpio.digital.DigitalState;
import com.pi4j.io.gpio.digital.PullResistance;
import com.pi4j.util.Console;





public class Gpio {
    private static final int PIN_LED = 22; // PIN 15 = BCM 22
    public static void gpiothing()
    {
        var pi4j = Pi4J.newAutoContext();
        var led = pi4j.digitalOutput().create(PIN_LED);
        led.high();
        try {
            Thread.sleep(1000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted: " + e.getMessage());
        }
        led.low();
    }
}
