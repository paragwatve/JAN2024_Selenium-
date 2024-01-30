export{Cust}

class Cust{
    enterfirstname(firstname){
        cy.get(':nth-child(1) > [width="20%"]').type(firstname)
    }
    enterlastname(lastname){
        cy.get(':nth-child(2) > [width="20%"]').type(lastname)
    }
    enteraddress(address){
        cy.get(':nth-child(3) > [width="20%"]').type(address)
    }
    entercity(city){
        cy.get(':nth-child(4) > [width="20%"]').type(city)
    }
    enterstate(state){
        cy.get(':nth-child(5) > [width="20%"]').type(state)
    }
    enterzipcode(zipcode){
        cy.get(':nth-child(6) > [width="20%"]').type(zipcode)
    }
    enterphone(phone){
        cy.get(':nth-child(7) > [width="20%"]').type(phone)
    }
    enterssn(ssn){
        cy.get(':nth-child(8) > [width="20%"]').type(ssn)
    }
    enterusername(username){
        cy.get(':nth-child(10) > [width="20%"]').type(username)
    }
    enterpassword(password){
        cy.get(':nth-child(11) > [width="20%"]').type(password)
    }
    enterconfirmpassword(confirmpassword){
        cy.get(':nth-child(12) > [width="20%"]').type(confirmpassword)
    }
    clickbutton(){
        cy.get('[colspan="2"] > .button').click();
    }
    logoutbutton(){
        cy.get('#leftPanel > ul > :nth-child(8) > a').click()
    }
}