describe("spicejet Test1",()=>{
    it("signup with spicejet",()=>{
        cy.visit("https://spiceclub.spicejet.com/signup")
        cy.get('.col-sm-4>.form-control').should("be.visible")
        cy.get('#first_name').should("be.visible").type("sahsafv asvfhasb")
        cy.get('#last_name').should("be.visible").type("Dsa")
        cy.xpath('//*[@id="react-root"]/div/div/div[2]/div[2]/div/div[1]/div[3]/div[1]/select').select('Germany')
        cy.get('#dobDate').should("be.visible").click().type('15-September-1998')
        cy.get('.react-tel-input>.form-control').should("be.visible").type('9683952842')
        cy.get('#email_id').should("be.visible").click().type('parag@gmail.com')
        cy.get('#new-password').should("be.visible").click().type('Sahd#1234')
        cy.get('#c-password').should("be.visible").type('Sahd#1234')
        cy.get('.register-form>:nth-child(6)').should("be.visible").click()
        cy.xpath('//*[@id="react-root"]/div/div/div[2]/div[2]/div/div[1]/div[7]/div[1]/a/button').should("be.visible")
    })
})