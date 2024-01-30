export{Cust}

class Cust{
    entername(name){
        cy.get('#name').type(name)
    }
    enteremail(email){
        cy.get('#email').type(email)
    }
    enterphoneno(phoneno){
        cy.get('#phone').type(phoneno)
    }
    entermessage(message){
        cy.get('#message').type(message)
    }
    clickbutton(){
        cy.get('[colspan="2"] > .button').click()
    }
}