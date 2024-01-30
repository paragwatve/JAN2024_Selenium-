describe("Data Driven",()=>{

    it("Using Fixtures",()=>{
        cy.fixture('data_orangeHRM').then((data)=>{

        
        cy.visit(data.url)
        cy.get("input[name=username]").type(data.Username)
        cy.get("input[name=password]").type(data.Password)
        cy.get("button[type=submit]").click()

    })
    })
})