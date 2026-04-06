package NammaYatri;

public class TestRideDSL {
    public static void main(String[] args) {
        RideDSL.ride()
                .login("Aryan")
                .from("LPU")
                .to("Phagwara")
                .paymentMethod("UPI")
                .book()
                .verifySuccess();
    }
}

