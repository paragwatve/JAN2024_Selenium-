import{Cust} from "D:\Dec2023\cypress\e2e\parabank ass1 repository.cy.js"

describe("Parabank pageobjects",()=>{
    it("Fixture",()=>{
        cy.fixture('data_parabank.json').then((data)=>{
            cy.visit("https://parabank.parasoft.com/parabank/index.htm")

            const obj = new Cust()
            cy.get('.contact > a').click()
            obj.entername(data.name)
            obj.enteremail(data.email)
            obj.enterphoneno(data.phoneno)
            obj.entermessage(data.message)
            obj.clickbutton()


        })
    })
})