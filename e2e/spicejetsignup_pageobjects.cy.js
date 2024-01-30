import {spicejetsignup}from "D:\\Dec2023\\cypress\\e2e\\spicejetsignup_repository.js"

describe("spicejet pageobjects",()=>{
    it("Using fixture",()=>{
        cy.fixture("data_spicejet.json").then((data)=>{
            let obj = new spicejetsignup()
            cy.visit(data.url)
            cy.url().should("eq","https://spiceclub.spicejet.com/signup")
            obj.title(data.title);
            obj.firstname(data.firstname);
            obj.Lastname(data.Lastname);
            obj.country(data.country);
            obj.date(data.date);
            obj.email(data.email);
            obj.password(data.password);
            obj.cpassword(data.cpassword);
            obj.submit()
        })

        })
    })   
    
    

        


        // cy.get('.col-sm-4>.form-control').should("be.visible")
        // cy.get('#first_name').should("be.visible").type("sahsafv asvfhasb")
        // cy.get('#last_name').should("be.visible").type("Dsa")
        // cy.get(':nth-child(3)>:nth-child(1)>.form-control').select('Germany')
        // cy.get('#dobDate').should("be.visible").click().type('15-September-1998')
        // cy.get('.react-tel-input>.form-control').should("be.visible").type('9683952842')
        // cy.get('#email_id').should("be.visible").click().type('parag@gmail.com')
        // cy.get('#new-password').should("be.visible").click().type('Sahd#1234')
        // cy.get('#c-password').should("be.visible").type('Sahd#1234')
        // cy.get('.register-form>:nth-child(6)').should("be.visible").click()
        // cy.get('.px-sm-4 > a > .btn').should("be.visible").click()

