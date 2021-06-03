package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;
import com.example.demo.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
// @RequestMapping("/account")
public class AccountController {

  // @Autowired
  // private AccountRepository accountRepository;

  // @RequestMapping(value = { "/index" }, method = RequestMethod.GET)
  // public String hello(Model model, @RequestParam String username) {
  //   public String hello(Model model) {
  //   List<Account> list = accountRepository.findAll();
  //   System.out.println(list.get(1));
  //   System.out.println("vao db tim account co username la "+username);
  //   System.out.println("da tim thay data account ten la vu pham, no co nick la vupham1996");
  //   model.addAttribute("test", list);
  //   model.addAttribute("user", "vupham1996");
  //   return "index";
  // }

  // @RequestMapping(value = { "/index/changeform" }, method = RequestMethod.GET)
  // public String changeForm() {
  //   return "changeForm";
  // }

  // @GetMapping("/test")
  // public RedirectView redirectWithUsingRedirectView(RedirectAttributes attributes) {
  //   attributes.addFlashAttribute("flashAttribute", "redirectWithRedirectView");
  //   attributes.addAttribute("username", "vupham");
  //   return new RedirectView("/account/index");
  // }

  @Autowired
  private AccountService accountService;

  @GetMapping("/")
  public String viewAccount(Model model){
    model.addAttribute("listAccounts", accountService.getAllAccounts());
    return "index";
  }

  @GetMapping("/showNewAccountForm")
  public String showNewAccountForm(Model model){
    Account account = new Account();
    model.addAttribute("account", account);
    return "new_account";
  }

  @PostMapping("/saveEmployee")
  public String saveAccount(@ModelAttribute("account") Account account){
    accountService.saveAccount(account);
    return "redirect:/";
  }
}