import jakarta.xml.ws.Endpoint; // Correct import for JAX-WS
import ws.BanqueService; // Your web service class

public class ServerJWS {
    public static void main(String[] args) {
        try {
            // Publish the web service at the given URL
            Endpoint.publish("http://localhost:9191/BanqueService", new BanqueService());
            System.out.println("Web Service deployed at http://localhost:9191/BanqueService");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in deploying the web service.");
        }
    }
}
