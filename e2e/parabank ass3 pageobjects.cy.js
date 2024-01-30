import {Cust} from "D:\Dec2023\cypress\e2e\parabank ass3 repository.cy.js"

describe("Parabank pageobjects",()=>{
    it("Fixture",()=>{
        cy.fixture('data_parabank2.json').then((data)=>{
            cy.visit("https://parabank.parasoft.com/parabank/index.htm")

            const obj = new Cust()
            obj.enterusername(data.username)
            obj.enterpassword(data.password)
            obj.clickbutton()
        })
    })
})
