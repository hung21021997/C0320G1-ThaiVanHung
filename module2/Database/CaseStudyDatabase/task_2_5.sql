 -- Yêu cầu 2:
select* from employees 
where (Name_employee like 'H%' or Name_employee like 'T%' or Name_employee like 'K%') and length(Name_employee)<=20;

-- Yêu cầu 3:
select * from customers
where (Address_customer in ('Đà Nẵng','Quảng Trị')) and ((curdate() - Birthday_customer) > (18*30*365)) and ((curdate() - Birthday_customer) < (50*30*365));

-- Yêu cầu 4:
select customers.Name_customer,
count(contracts.Id_contract) as So_lan_dat_phong from customers 
inner join contracts on customers.Id_customer = contracts.Id_customer
inner join types_of_customers on customers.Id_types_of_customer = types_of_customers.Id_types_of_customer
where types_of_customers.Name_types_of_customer = 'Diamond'
group by customers.Id_customer order by So_lan_dat_phong;

-- Yêu cầu 5:
select customers.Id_customer, customers.Name_customer, types_of_customers.Name_types_of_customer, 
contracts.Id_contract, contracts.Date_start_contract, contracts.Date_end_contract,
services.Name_services, 
sum(services.Rent_hire_services + detail_contract.Amount_contract*services_attach.Rent_attach) 
as TongTien from customers
left join types_of_customers on customers.Id_types_of_customer = types_of_customers.Id_types_of_customer
left join contracts on customers.Id_customer = contracts.Id_customer
left join services on contracts.Id_services = services.Id_services
left join detail_contract on contracts.Id_contract = detail_contract.Id_contract
left join services_attach on detail_contract.Id_attach = services_attach.Id_attach
group by contracts.Id_contract;


