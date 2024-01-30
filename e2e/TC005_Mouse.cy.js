describe("Mouse Operations",()=>{
    it("Mousehover",()=>{
        cy.visit("https://demo.opencart.com/")
        cy.get('.nav > :nth-child(1) > .dropdown-toggle').trigger('Mousehover').click()
        cy.get(':nth-child(1) > .dropdown-menu > .dropdown-inner > .list-unstyled > :nth-child(2) > .nav-link')
        .should('be.visible')
        .click()

    })
})

it.skip("Right click",()=>{
    cy.visit("https://swisnl.github.io/jQuery-contextMenu/demo.html")
    cy.get('.context-menu-one').trigger("contextmenu")
    cy.get('.context-menu-icon-copy > span').click()

})
it.skip("Double click",()=>{
    cy.visit("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick")
    cy.iframe('#iframeResult').find()

})