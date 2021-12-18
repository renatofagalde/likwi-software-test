package br.com.likwi.test.bean;

import br.com.likwi.test.model.Customer;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CustomerRegistrationRequest {

    private final Customer customer;

    public CustomerRegistrationRequest(@JsonProperty("customer") Customer customer) {
        this.customer = customer;
    }
}