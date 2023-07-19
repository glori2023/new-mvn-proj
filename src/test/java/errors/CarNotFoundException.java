package errors;

public class CarNotFoundException extends Exception{
    public CarNotFoundException(){
        super("car is not found");
    }
    public CarNotFoundException(Exception e){
        super("car is not found", e);
    }
}
