package chap5;

public class Address {
    private String registerAdddress;
    private String currentAdddress;

    public Address(String registerAdddress) {
        this.registerAdddress = registerAdddress;
    }

    public String getRegisterAdddress() {
        return registerAdddress;
    }

    public void setRegisterAdddress(String registerAdddress) {
        this.registerAdddress = registerAdddress;
    }

    public String getCurrentAdddress() {
        return currentAdddress;
    }

    public void setCurrentAdddress(String currentAdddress) {
        this.currentAdddress = currentAdddress;
    }
    
    
}
