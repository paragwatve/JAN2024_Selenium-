describe('my suite',()=>{

    it('Capture Screenshots and videos',()=>{
        cy.visit("https://demo.opencart.com/");
        cy.screenshot("homepage");
        cy.wait(5000);
        cy.get("img[title='Your Store']").screenshot("logo");
    })
})