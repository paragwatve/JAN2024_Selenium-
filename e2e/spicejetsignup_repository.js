export{spicejetsignup}
class spicejetsignup{
    geturl(url){
        cy.visit(url)
    }
    title(title){
        cy.get('.col-sm-4>.form-control').select(title);
    }
    firstname(fname){
        cy.get('#first_name').type(fname);
    }
    Lastname(Lname){
        cy.get('#last_name').type(Lname);
    }
    country(ctr){
        cy.get(':nth-child(3)>:nth-child(1)>.form-control').select(ctr);
    }
    date(date){
        cy.get('#dobDate').click().type(date);
    }
    mobile(mob){
        cy.get('.react-tel-input>.form-control').type(mob);
    }
    email(){
        cy.get('#email_id').click().type();
    }
    password(pass){
        cy.get('#new-password').click().type(pass);
    }
    cpassword(pass){
        cy.get('#c-password').click().type(pass);
    }
    submit(){
        cy.get('#defaultCheck1').check();
        cy.get('.px-sm-4 > a > .btn').click();
    }

}