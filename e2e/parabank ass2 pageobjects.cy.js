import {Cust} from "D:\Dec2023\cypress\e2e\parabank ass2 repository.cy.js"
describe("Parabank pageobjects",()=>{
    it("Fixture",()=>{
        cy.fixture('data_parabank1.json').then((data)=>{
            cy.visit("https://parabank.parasoft.com/parabank/index.htm")

            const obj = new Cust()
            cy.get('#loginPanel > :nth-child(3) > a').click()
            obj.enterfirstname(data.firstname)
            obj.enterlastname(data.lastname)
            obj.enteraddress(data.address)
            obj.entercity(data.city)
            obj.enterstate(data.state)
            obj.enterzipcode(data.zipcode)
            obj.enterphone(data.phone)
            obj.enterssn(data.ssn)
            obj.enterusername(data.username)
            obj.enterpassword(data.password)
            obj.enterconfirmpassword(data.confirmpassword)
            obj.clickbutton()
            obj.logoutbutton()
        })
    })
})