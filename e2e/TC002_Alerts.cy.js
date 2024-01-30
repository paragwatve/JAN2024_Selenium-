describe("Alerts",()=>{
    it("Simple Alert",()=>{

        cy.visit("https://letcode.in/alert")
        cy.get('#accept').click()
        cy.on('window:alert',(t)=>{
            expect(t).contains("Hey! Welcome LetCode")
        })
    })
})
