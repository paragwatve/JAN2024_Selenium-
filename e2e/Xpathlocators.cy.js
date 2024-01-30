describe('Xpathlocators',()=>{

    it('find no of products',()=>{
        cy.visit("https://demo.opencart.com/")
        cy.xpath('//*[@id="product-list"]/div[1]/form/div').should('have.length',0)
    })
})