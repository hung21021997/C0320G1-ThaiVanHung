package com.codegym.demo.controllers;

import com.codegym.demo.entity.Customer;
import com.codegym.demo.sevices.CustomerService;
import com.codegym.demo.sevices.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProvinceService provinceService;

    @GetMapping("")
    public ModelAndView showListCustomer(Pageable pageable, @RequestParam(value = "lastName", required = false, defaultValue = "")String lastName,
                                         @RequestParam(value = "firstName", required = false, defaultValue = "")String firstName,
                                         @RequestParam(value = "nameProvince", required = false, defaultValue = "")String nameProvince){

        Page<Customer> customers = customerService.getAllCustomerByName(pageable, lastName,firstName,nameProvince);
        ModelAndView modelAndView = new ModelAndView("customers/list","customers",customers);
        modelAndView.addObject("lastName",lastName);
        modelAndView.addObject("firstName",firstName);
        modelAndView.addObject("nameProvince",nameProvince);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showFormCreateCustomer(){
        ModelAndView modelAndView = new ModelAndView("customers/create","customer", new Customer());
        modelAndView.addObject("provinces",provinceService.getAllProvince());
        return modelAndView;
    }
    @PostMapping("/create")
    public String createCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("provinces",provinceService.getAllProvince());
            return "customers/create";
        }

        if (customer==null){
            return "views/error-404";
        }
        try {
            customerService.saveCustomer(customer);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "redirect:";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showFormEditCustomer(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("customers/edit", "customer", customerService.getCustomerById(id));
        modelAndView.addObject("provinces", provinceService.getAllProvince());
        return modelAndView;
    }

    @PostMapping("/edit")
    public String editCustomer(@ModelAttribute("customer") Customer customer, RedirectAttributes redirect) {
        if (customer == null) {
            return "views/error-404";
        }
        try {
            customerService.saveCustomer(customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        redirect.addFlashAttribute("message", "Edit Successfully");
        return "redirect:";
    }

    @GetMapping("delete/{id}")
    public ModelAndView showFormDeleteCustomer(@PathVariable("id")Long id){
        return new ModelAndView("customers/delete","customer",customerService.getCustomerById(id));
    }
    @PostMapping("delete")
    public String deleteCustomer(@ModelAttribute("customer")Customer customer, RedirectAttributes redirect){
        try {
            customerService.deleteCustomer(customer);
        } catch (Exception e){
            return "views/error-500";
        }
        redirect.addFlashAttribute("message","Delete successfully");
        return "redirect:";
    }
}
