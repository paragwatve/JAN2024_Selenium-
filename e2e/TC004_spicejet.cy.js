describe("spicejet",()=>{
    it("Using fixture",()=>{
        cy.fixture('data_spicejet').then((data)=>{
            cy.visit(data.Url);
            cy.url().should("eq","https://spicejetclub.spicejet.com/signup")
            cy.get('.title-black').should("contain","Member Enrollment")

        })
    })
})