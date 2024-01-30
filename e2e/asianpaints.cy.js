// describe("AsianPaints",()=>{
//     it("Shop",()=>{
//       cy.visit("https://www.asianpaints.com/")
//       cy.wait(2000)
//       cy.get(':nth-child(6) > .track_section > .iconTextLinks__text').trigger("Mouseover").click()
//       cy.get(':nth-child(6) > .track_section > .iconTextLinks__text').click()
//       cy.get(':nth-child(5) > .anchor-explore-stores > .imageWrapper > .image-explore-stores > img').click()
//       cy.get('[data-attr-price="4499.25"] > :nth-child(5) > .global-button-white').click()
//       cy.get('#cartPinCode').type(413003)
//       cy.get('.pin-code-form > .ctaComp > .ctaText').click()
//       cy.get('.cart-items-dropdowb > .iconLinks').click()
//     })
// })  
it.only("href attribute", ()=>{

  cy.visit("https://www.asianpaints.com/online-shop/colour-selection-tools.html")
  cy.wait(3000)
  cy.get('[href="https://www.asianpaints.com/online-shop/colour-selection-tools/woodtech-spectra-1600.html"] > p').then(newtab=>{
      const hreftab=newtab.prop('href')
      cy.log(hreftab)
      let length1=hreftab.length()
      let newtb=hreftab.substring(6,length1-6)
                  cy.visit(newtb)
cy.log(newtb)
      cy.url().should("eq","https://www.asianpaints.com/online-shop/colour-selection-tools/woodtech-spectra-1600.html")
  })
  
      })