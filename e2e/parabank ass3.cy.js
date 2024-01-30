describe("Parabank Ass3",()=>{
    it("Fixture",()=>{
        cy.fixture('data_parabank2.json').then((d)=>{
            cy.visit("https://parabank.parasoft.com/parabank/index.htm")
            cy.get(':nth-child(2) > .input').type("sayali513")
            cy.get(':nth-child(4) > .input').type("choudhari@123")
            cy.get(':nth-child(5) > .button').click()
        })
    })
})