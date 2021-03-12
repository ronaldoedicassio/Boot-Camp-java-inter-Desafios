package one.digitalinnovation.beerstock.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockMinException extends Exception{

    public BeerStockMinException(Long id, int quantityToDecrement){
        super(String.format("Beers with %s ID to decrement informed reach the min stock capacity: %s", id, quantityToDecrement));
    }
}
