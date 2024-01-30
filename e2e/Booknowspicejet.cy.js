describe("spicejet BookNow",()=>{
    it("BookNow with spicejet",()=>{
        cy.visit("https://spicejet.com")
        cy.get('[data-testid="search-source-city-txt"]').click()
        cy.get(':nth-child(1) > [data-testid="auto-cmp-row-1"]').click()
        cy.get('[data-testid="search-destination-city-txt"]').click()
        cy.get(':nth-child(1) > [data-testid="auto-cmp-row-2"] > .css-1dbjc4n').click()
    
    })
  
})    