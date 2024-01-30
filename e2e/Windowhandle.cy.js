describe('Example to demonstrate the handling of new browser windows in cypress', () => {

    it('Handling new Browser Tab', function () {
        cy.visit('https://demoqa.com/browser-windows')
        cy.wait(3000)
         cy.get('.example > a').invoke('removeAttr', 'target').click()
        cy.url()
            .should('include', '/windows/new')
        cy.get('h3')
            .should('have.text', 'New Window') 
    })

})
describe("Handle",()=>{
    it('Check',()=>{
        cy.visit("https://demoqa.com/browser-windows")
        cy.get('#tabButton').invoke('removeAttr','target').click();
    })
})