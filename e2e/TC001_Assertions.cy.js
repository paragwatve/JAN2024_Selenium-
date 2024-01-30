// describe("Assertions",()=>{
//     it("Implicit Assertions",()=>{
//         cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
//         cy.url().should("eq","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
//         .and("include","orange")
//         .and("contain","orange")
        
//         //cy.url().should("include","orange")
//         //cy.url().should("contain","orange")
//         //cy.title().should("eq","OrangeHRM")


//         cy.get("input[name=username]").type("Admin")
//         cy.get("input[name=password]").type("admin123")
//         cy.get("button[type=submit]").click()

//     })
// })

    it.only("Explicit Assertions",()=>{
     cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
     cy.get("input[name=username]").type("Admin")
     cy.get("input[name=password]").type("admin123")
     cy.get("button[type=submit]").click()
     let expname="Admin"
     cy.get('.oxd-userdropdown-name').then((x)=>{
     let acname=x.text()
     //BDD
    expect(acname).to.equal("Burak İkinci")
    expect(expname).to.not.equal(expname)

    //TDD
    assert.equal(acname,expname)
    assert.notEqual(acname,expname)
     })
    })