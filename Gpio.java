import com.pi4j.Pi4J;
import com.pi4j.plugin.gpiod.provider.gpio.digital.GpioDDigitalInputProvider;
import com.pi4j.plugin.gpiod.provider.gpio.digital.GpioDDigitalOutputProvider;
import com.pi4j.boardinfo.util.BoardInfoHelper;
import com.pi4j.util.Console;
import com.pi4j.context.Context;





public class Gpio {
    private static final int PIN_LED = 22; // PIN 15 = BCM 22
    public static void gpiothing()
    {
        //final var console = new Console();

        // Print program title/header
        //console.title("<-- The Pi4J Project -->", "Minimal Example project");

        // ************************************************************
        //
        // WELCOME TO Pi4J:
        //
        // Here we will use this getting started example to
        // demonstrate the basic fundamentals of the Pi4J library.
        //
        // This example is to introduce you to the boilerplate
        // logic and concepts required for all applications using
        // the Pi4J library.  This example will do use some basic I/O.
        // Check the pi4j-examples project to learn about all the I/O
        // functions of Pi4J.
        //
        // ************************************************************

        // ------------------------------------------------------------
        // Initialize the Pi4J Runtime Context
        // ------------------------------------------------------------
        // Before you can use Pi4J you must initialize a new runtime
        // context.
        //
        // The 'Pi4J' static class includes a few helper context
        // creators for the most common use cases.  The 'newAutoContext()'
        // method will automatically load all available Pi4J
        // extensions found in the application's classpath which
        // may include 'Platforms' and 'I/O Providers'
        //var pi4j = Pi4J.newAutoContext();
        //Context pi4j = Pi4J.newContextBuilder()
        //    .add(GpioDDigitalInputProvider.newInstance())
        //    .setGpioChipName("gpiochip0")
        //    .build();
        Context pi4j = Pi4J.newAutoContext();
        // ------------------------------------------------------------
        // Output Pi4J Context information
        // ------------------------------------------------------------
        // The created Pi4J Context initializes platforms, providers
        // and the I/O registry. To help you to better understand this
        // approach, we print out the info of these. This can be removed
        // from your own application.
        // OPTIONAL
        

        // ------------------------------------------------------------
        // Output Pi4J Board information
        // ------------------------------------------------------------
        // When the Pi4J Context is initialized, a board detection is 
        // performed. You can use this info in case you need board-specific
        // functionality.
        // OPTIONAL
        //console.println("Board model: " + pi4j.boardInfo().getBoardModel().getLabel());
        //console.println("Operating system: " + pi4j.boardInfo().getOperatingSystem());
        //console.println("Java versions: " + pi4j.boardInfo().getJavaInfo());
        // This info is also available directly from the BoardInfoHelper, 
        // and with some additional realtime data.
        //console.println("Board model: " + BoardInfoHelper.current().getBoardModel().getLabel());
        //console.println("Raspberry Pi model with RP1 chip (Raspberry Pi 5): " + BoardInfoHelper.usesRP1());
        //console.println("OS is 64-bit: " + BoardInfoHelper.is64bit());
        //console.println("JVM memory used (MB): " + BoardInfoHelper.getJvmMemory().getUsedInMb());
        //console.println("Board temperature (°C): " + BoardInfoHelper.getBoardReading().getTemperatureInCelsius());
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
