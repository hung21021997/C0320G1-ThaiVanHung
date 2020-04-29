let Employee = function () {
    this.getName = function () {
        return this.name;
    }
    this.setName = function (name) {
        this.name = name;
    }
    this.getBirthday = function () {
        return this.birthday;
    }
    this.setBirthday = function (birthday) {
        this.birthday = birthday;
    }
    this.getPhone = function () {
        return this.phone;
    }
    this.setPhone = function (phone) {
        this.phone = phone;
    }
    this.getEmail = function () {
        return this.email;
    }
    this.setEmail = function (email) {
        this.email = email;
    }
    this.getCmnd = function () {
        return this.cmnd;
    }
    this.setCmnd = function (cmnd) {
        this.cmnd = cmnd;
    }
    this.getLevel = function () {
        return this.level;
    }
    this.setLevel = function (level) {
        this.level = level;
    }
    this.getLocaltion = function () {
        return this.localtion;
    }
    this.setLocaltion = function (localtion) {
        this.localtion = localtion;
    }
    this.getSalary = function () {
        if(this.getLocaltion()==="Manager"){
            this.salary = 500;
        }else if(this.getLocaltion()==="Sale"){
            this.salary = 300;
        }else if(this.getLocaltion()==="Makerting"){
            this.salary = 200;
        }
        return this.salary;
    }
    this.setSalary = function (salary) {
        this.salary = salary;
    }
}