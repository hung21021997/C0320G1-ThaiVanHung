package codegym.com.module2_accountname_wbe.controllers;

import codegym.com.module2_accountname_wbe.entity.Contract;
import codegym.com.module2_accountname_wbe.entity.Customer;
import codegym.com.module2_accountname_wbe.entity.DetailContract;
import codegym.com.module2_accountname_wbe.entity.Service;
import codegym.com.module2_accountname_wbe.services.ContractService;
import codegym.com.module2_accountname_wbe.services.CustomerService;
import codegym.com.module2_accountname_wbe.services.DetailContractService;
import codegym.com.module2_accountname_wbe.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;

@Controller
@RequestMapping("furama")
public class FuramaResortController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ContractService contractService;

    @Autowired
    private ServiceService serviceService;

    @Autowired
    private DetailContractService detailContractService;

    @GetMapping("")
    public String showListFurama(){
        return "customers/home";
    }

    @GetMapping("/customer")
    public ModelAndView showListCustomer(Pageable pageable, @RequestParam(value = "nameCustomer", required = false, defaultValue = "") String nameCustomer,
                                         @RequestParam(value = "phoneCustomer", required = false, defaultValue = "") String phoneCustomer){
        Page<Customer> customers = customerService.getAllCustomerByName(pageable, nameCustomer, phoneCustomer);
        ModelAndView modelAndView = new ModelAndView("customers/list","customers", customers);
        modelAndView.addObject("nameCustomer",nameCustomer);
        modelAndView.addObject("phoneCustomer", phoneCustomer);
//        modelAndView.addObject("customers",customerService.getAllCustomer(pageable));
        return modelAndView;
    }

    @GetMapping("customer/create")
    public ModelAndView showFormCreateCustomer(){
        ModelAndView modelAndView = new ModelAndView("customers/create","customer",new Customer());
        modelAndView.addObject("services",serviceService.getAllServices());
        return modelAndView;
    }
    @PostMapping("customer/create")
    public String createCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("services",serviceService.getAllServices());
            return "customers/create";
        }
        if (customer==null){
            return "views/error-404";
        }
        try{
            customerService.saveCustomer(customer);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "redirect:";
    }

    @GetMapping("customer/edit/{idCustomer}")
    public ModelAndView showFormEditCustomer(@PathVariable("idCustomer") Long idCustomer){
        ModelAndView modelAndView = new ModelAndView("customers/edit","customer",customerService.getCustomerById(idCustomer));
        modelAndView.addObject("services",serviceService.getAllServices());
        return modelAndView;
    }
    @PostMapping("customer/edit")
    public String editCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("services",serviceService.getAllServices());
            return "customers/edit";
        }
        if (customer==null){
            return "views/error-404";
        }
        try{
            customerService.saveCustomer(customer);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "redirect:";
    }

    @GetMapping("customer/delete/{idCustomer}")
    public ModelAndView showFormDeleteCustomer(@PathVariable("idCustomer") Long idCustomer){
        ModelAndView modelAndView = new ModelAndView("customers/delete","customer",customerService.getCustomerById(idCustomer));
        return modelAndView;
    }
    @PostMapping("customer/delete")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer){
        try {
            customerService.deleteCustomer(customer);
        }catch (Exception e){
            return "views/error-404";
        }
        return "redirect:";
    }

    @GetMapping("/service")
    public ModelAndView showListService(Pageable pageable, @RequestParam(value = "nameServices", required = false, defaultValue = "") String nameServices,
                                        @RequestParam(value = "quantityServices", required = false, defaultValue = "") String quantityServices){
        Page<Service> services = serviceService.getAllServicesByName(pageable, nameServices, quantityServices);
        ModelAndView modelAndView = new ModelAndView("services/list","services", services);
        modelAndView.addObject("nameServices", nameServices);
        modelAndView.addObject("quantityServices", quantityServices);
//        modelAndView.addObject("services",serviceService.getAllServices());
        return modelAndView;
    }

    @GetMapping("service/create")
    public ModelAndView showFormCreateService(){
        ModelAndView modelAndView = new ModelAndView("services/create","service",new Service());
        return modelAndView;
    }
    @PostMapping("service/create")
    public String createService(@Valid @ModelAttribute("service") Service service, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "services/create";
        }
        if(service==null){
            return "views/error-404";
        }
        try {
            serviceService.saveService(service);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "redirect:";
    }

    @GetMapping("service/edit/{idService}")
    public ModelAndView showFormEditService(@PathVariable("idService") Long idService){
        ModelAndView modelAndView = new ModelAndView("services/edit","service",serviceService.getServiceById(idService));
        return modelAndView;
    }
    @PostMapping("service/edit")
    public String editService(@Valid @ModelAttribute("service") Service service, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "services/edit";
        }
        if (service==null){
            return "views/error-404";
        }
        try {
            serviceService.saveService(service);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "redirect:";
    }

    @GetMapping("service/delete/{idService}")
    public ModelAndView showFormDeleteService(@PathVariable("idService") Long idService){
        ModelAndView modelAndView = new ModelAndView("services/delete","service",serviceService.getServiceById(idService));
        return modelAndView;
    }
    @PostMapping("service/delete")
    public String deleteService(@ModelAttribute("service") Service service){
        try {
            serviceService.deleteService(service);
        }catch (Exception e){
            return "views/error-404";
        }
        return "redirect:";
    }

    @GetMapping("/contract")
    public ModelAndView showListContract(){
        ModelAndView modelAndView = new ModelAndView("contracts/list","contract", new Contract());
        modelAndView.addObject("contracts",contractService.getAllContract());
        return modelAndView;
    }

    @GetMapping("contract/create")
    public ModelAndView showFormCreateContract(){
        ModelAndView modelAndView = new ModelAndView("contracts/create","contract", new Contract());
        modelAndView.addObject("customers",customerService.getAllCustomer());
        return modelAndView;
    }
    @PostMapping("contract/create")
    public String createContract(@Valid @ModelAttribute("contract") Contract contract, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("customers",customerService.getAllCustomer());
            return "contracts/create";
        }
        if(contract==null){
            return "views/error-404";
        }
        try {
            contractService.saveContract(contract);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "redirect:";
    }
    @GetMapping("contract/edit/{idContract}")
    public ModelAndView showFormEditContract(@PathVariable("idContract") Long idContract){
        ModelAndView modelAndView = new ModelAndView("contracts/edit","contract",contractService.getContractById(idContract));
        modelAndView.addObject("customers",customerService.getAllCustomer());
        return modelAndView;
    }
    @PostMapping("contract/edit")
    public String editContract(@Valid @ModelAttribute("contract") Contract contract, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("customers",customerService.getAllCustomer());
            return "contracts/edit";
        }
        if (contract==null){
            return "views/error-404";
        }
        try {
            contractService.saveContract(contract);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "redirect:";
    }
    @GetMapping("contract/delete/{idContract}")
    public ModelAndView showFormDeleteContract(@PathVariable("idContract") Long idContract){
        ModelAndView modelAndView = new ModelAndView("contracts/delete","contract",contractService.getContractById(idContract));
        return modelAndView;
    }
    @PostMapping("contract/delete")
    public String deleteContract(@ModelAttribute("contract") Contract contract){
        try {
            contractService.deleteContract(contract);
        }catch (Exception e){
            return "views/error-404";
        }
        return "redirect:";
    }


    @GetMapping("/detail_contract")
    public ModelAndView showListDetailContract(){
        ModelAndView modelAndView = new ModelAndView("detail_contract/list","detailContract",new DetailContract());
        modelAndView.addObject("detailContracts",detailContractService.getAllDetailContract());
        return modelAndView;
    }
    @GetMapping("detail_contract/create")
    public ModelAndView showFormCreateDetailContract(){
        ModelAndView modelAndView = new ModelAndView("detail_contract/create","detailContract", new DetailContract());
        modelAndView.addObject("contracts",contractService.getAllContract());
        return modelAndView;
    }
    @PostMapping("detail_contract/create")
    public String createDetailContract(@Valid @ModelAttribute("detailContract") DetailContract detailContract, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("contracts",contractService.getAllContract());
            return "detail_contract/create";
        }
        if (detailContract==null){
            return "views/error-404";
        }
        try {
            detailContractService.saveDetailContract(detailContract);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "redirect:";
    }
    @GetMapping("detail_contract/edit/{idDetailContract}")
    public ModelAndView showFormEditDetailContract(@PathVariable("idDetailContract") Long idDetailContract){
        ModelAndView modelAndView = new ModelAndView("detail_contract/edit","detailContract",detailContractService.getDetailContractById(idDetailContract));
        modelAndView.addObject("contracts",contractService.getAllContract());
        return modelAndView;
    }
    @PostMapping("detail_contract/edit")
    public String editDetailContract(@Valid @ModelAttribute("detailContract") DetailContract detailContract,BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("contracts",contractService.getAllContract());
            return "detail_contract/edit";
        }
        if (detailContract==null){
            return "views/error-404";
        }
        try {
            detailContractService.saveDetailContract(detailContract);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "redirect:";
    }
    @GetMapping("detail_contract/delete/{idDetailContract}")
    public ModelAndView showFormDeleteDetailContract(@PathVariable("idDetailContract") Long idDetailContract){
        ModelAndView modelAndView = new ModelAndView("detail_contract/delete","detailContract",detailContractService.getDetailContractById(idDetailContract));
        return modelAndView;
    }
    @PostMapping("detail_contract/delete")
    public String deleteDetailContract(@ModelAttribute("detailContract") DetailContract detailContract){
        if(detailContract==null){
            return "views/error-404";
        }
        try {
            detailContractService.deleteDetailContract(detailContract);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "redirect:";
    }
}
