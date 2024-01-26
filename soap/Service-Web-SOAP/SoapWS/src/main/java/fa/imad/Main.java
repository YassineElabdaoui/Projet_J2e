package fa.imad;

import jakarta.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {

        Endpoint.publish("http://0.0.0.0:9000/", new BanqueService());
        System.out.println("App is Running");

    }
}