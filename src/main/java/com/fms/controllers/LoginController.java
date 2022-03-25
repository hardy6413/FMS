package com.fms.controllers;

import com.fms.models.Address;
import com.fms.models.PersonalData;
import com.fms.models.UserAccount;
import com.fms.service.AddressService;
import com.fms.service.FarmService;
import com.fms.service.LoginService;
import com.fms.service.PersonalDataService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

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

        log.debug("getting Index Page");
        return "account/login";
    }

    @GetMapping("/account/new")
    public String getAccountCreationForm(Model model) {

        model.addAttribute("account", new UserAccount());
        model.addAttribute("personalData", new PersonalData());
        model.addAttribute("address", new Address());

        log.debug("getting Account creation form");

        return "account/createAccount";
    }

    @PostMapping("/account/new")
    public String processAccountCreationForm(@Valid @ModelAttribute("account") UserAccount userAccount,
                                             BindingResult accountBindingResult,
                                             @Valid @ModelAttribute("personalData") PersonalData personalData,
                                             BindingResult personalDataBindingResult,
                                             @Valid @ModelAttribute("address") Address address,
                                             BindingResult addressBindingResult, Model model) {

        if (accountBindingResult.hasErrors() || personalDataBindingResult.hasErrors() || addressBindingResult.hasErrors()){

            accountBindingResult.getAllErrors().forEach(objectError -> log.debug(objectError.toString()));

            personalDataBindingResult.getAllErrors().forEach(objectError -> log.debug(objectError.toString()));

            addressBindingResult.getAllErrors().forEach(objectError -> log.debug(objectError.toString()));

            return "account/createAccount";
        }


        log.debug("Creating new account...");

        UserAccount savedUserAccount = loginService.saveUser(userAccount);

        PersonalData savedPersonalData = personalDataService.createOrUpdatePersonalData(personalData);

        Address savedAddress = addressService.createOrUpdateAddress(address);

        log.debug("Account created successfully, ID of the new user : " + savedUserAccount.getId() +
                " ID of the savedUser's Personal Data " + savedPersonalData.getId() +
                " and ID of the Address " + savedAddress.getId());

        model.addAttribute("farms",farmService.findAll());

        return "farms/farmsList";
    }
}
