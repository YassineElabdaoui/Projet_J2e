package ma.imad;

import proxy.BanqueService;
import proxy.BanqueWS;

public class Main {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();



        System.out.println(stub.convert(8));
    }
}