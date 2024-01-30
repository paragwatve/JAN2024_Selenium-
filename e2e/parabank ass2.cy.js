describe("Parabank Ass2",()=>{
    it("Fixture",()=>{
        cy.fixture('data_parabank1.json').then((d)=>{
            cy.visit("https://parabank.parasoft.com/parabank/index.htm")
            cy.get('#loginPanel > :nth-child(3) > a').click()
            cy.get(':nth-child(1) > [width="20%"]').type(d.firstname)
            cy.get(':nth-child(2) > [width="20%"]').type(d.lastname)
            cy.get(':nth-child(3) > [width="20%"]').type(d.address)
            cy.get(':nth-child(4) > [width="20%"]').type(d.city)
            cy.get(':nth-child(5) > [width="20%"]').type(d.state)
            cy.get(':nth-child(6) > [width="20%"]').type(d.zipcode)
            cy.get(':nth-child(7) > [width="20%"]').type(d.phone)
            cy.get(':nth-child(8) > [width="20%"]').type(d.ssn)
            cy.get(':nth-child(10) > [width="20%"]').type(d.username)
            cy.get(':nth-child(11) > [width="20%"]').type(d.password)
            cy.get(':nth-child(12) > [width="20%"]').type(d.confirmpassword)
            cy.get('[colspan="2"] > .button').click();
            cy.get('#leftPanel > ul > :nth-child(8) > a').click()

        })
    })
})    