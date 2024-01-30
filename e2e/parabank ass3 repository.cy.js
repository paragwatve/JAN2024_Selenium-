export {Cust}

class Cust{
    enterusername(username){
        cy.get(':nth-child(2) > .input').type(username)
    }
    enterpassword(password){
        cy.get(':nth-child(4) > .input').type(password)
    }
    clickbutton(){
        cy.get(':nth-child(5) > .button').click()
    }
}