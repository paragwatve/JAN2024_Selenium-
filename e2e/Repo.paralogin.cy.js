export {paralogin}
class paralogin{
    enterurl(url){
        cy.visit(url)
    }
    enteruname(username){
        cy.get(':nth-child(2) > .input').click().type(username)
    }
    enterpass(password){
        cy.get(':nth-child(4) > .input').click().type(password)
    }
    clicklogin(){
        cy.get(':nth-child(5) > .button').click()
    }
    clicklogout(){
        cy.get('#leftPanel > ul > :nth-child(8) > a').click()
    }
}