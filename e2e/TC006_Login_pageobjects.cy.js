import {loginpage} from "D:\\Dec2023\\cypress\\e2e\\login_repository.js"

describe("OrangeHRM",()=>{
    it("Login",()=>{
        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        cy.fixture("data_orangeHRM.json").then((d)=>{
            const obj = new loginpage()
            obj.enterusername(d.username)
            obj.enterpassword(d.password)
            obj.clickonsubmit()
        })
        // cy.get("input[name=username]").type("Admin")
        // cy.get("input[name=password]").type("admin123")
        // cy.get("button[type=submit]").click()

    })
})