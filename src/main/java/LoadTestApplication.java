import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoadTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoadTestApplication.class, args);
    }

    // Simulate a simple REST endpoint
    @GetMapping("/performAction")
    public ResponseEntity<String> performAction() {
        try {
            Thread.sleep(200); // Simulate processing delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return ResponseEntity.ok("Action performed");
    }
}


// commands
# Test with default settings
java -XX:+FlightRecorder -XX:StartFlightRecording=filename=default_settings.jfr,duration=10m -jar YourApplication.jar

# Test with optimized GC settings
java -XX:+FlightRecorder -XX:StartFlightRecording=filename=gc_optimized.jfr,duration=10m -XX:+UseG1GC -jar YourApplication.jar
