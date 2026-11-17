package com.example.account;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/internal")
    public List<String> getInternalAccounts() {
        return List.of("Savings Account", "Current Account");
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String createAccount(@RequestBody CreateAccountRequest request) {
        return "Account created successfully: "
                + request.getAccountHolder() + " - "
                + request.getAccountType();
    }
}
