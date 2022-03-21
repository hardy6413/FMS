package com.fms.controllers;

import com.fms.models.UserAccount;
import com.fms.service.AddressService;
import com.fms.service.FarmService;
import com.fms.service.LoginService;
import com.fms.service.PersonalDataService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
@AllArgsConstructor
public class LoginController {

    private final LoginService loginService;
    private final AddressService addressService;
    private final PersonalDataService personalDataService;
    private final FarmService farmService;

    @GetMapping({"", "/", "/index"})
    public String getLoginPage() {

        log.debug("getting IndexPage");
        return "account/login";
    }

    @GetMapping("/account/new")
    public String getAccountCreationForm(Model model) {

        model.addAttribute("account", new UserAccount());

        log.debug("getting AccountCreationForm");

        return "account/createAccount";
    }

    @PostMapping("/account/new")
    public String processAccountCreationForm(@ModelAttribute("account") UserAccount userAccount, Model model) {

        log.debug("getting AccountCreationForm");

        loginService.createAccount(userAccount);
        personalDataService.createOrUpdatePersonalData(userAccount.getPersonalData());
        addressService.createOrUpdateAddress(userAccount.getPersonalData().getAddress());

        model.addAttribute("farms",farmService.findAll());
        return "farms/farmsList";
    }
}
