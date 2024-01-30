import { afterEach } from "mocha";
import {paralogin} from "D:\\Training\\Cypress\\cypress\\e2e\\Repo_paralogin.js"
describe("Feature2 ParaBank", () => {
    before(function () {
       cy.fixture("data_paralogin").then((data)=>{
                
         const obj = new paralogin();
         obj.enterurl(data.url) 
       })
    });
    after(function(){
      cy.log("This is Parabank Logout")
    })
    beforeEach(function () {
      cy.fixture("data_paralogin").then((data)=>{
          
        const obj = new paralogin();
        obj.enteruname(data.username)
        obj.enterpass(data.password)
        obj.clicklogin()
          
      })
    });
     it("Fund Transfer", () => {
        cy.wait(2000)
        cy.get('#leftPanel > ul > :nth-child(4) > a').click()
        cy.get(':nth-child(1) > [width="20%"] > .input').type("Ravan")
        cy.get(':nth-child(2) > [width="20%"] > .input').type("Lanka")
        cy.get(':nth-child(3) > [width="20%"] > .input').type("Ram setu")
        cy.get(':nth-child(4) > [width="20%"] > .input').type("Srilanka")
        cy.get(':nth-child(5) > [width="20%"] > .input').type("123123")
        cy.get(':nth-child(6) > [width="20%"]').type("12301230")
        cy.get(':nth-child(8) > :nth-child(2) > .input').type("24190")
        cy.get(':nth-child(9) > [width="20%"] > .input').type("24190")
        cy.get(':nth-child(11) > [width="20%"] > .input').type("1200")
        cy.get(':nth-child(13) > :nth-child(2) > .input').select("24777")
        cy.get(':nth-child(14) > :nth-child(2) > .button').click();
        cy.get('[ng-show="showResult"] > :nth-child(2)').should('contain','Bill Payment to Ravan in the amount of $1200.00 from account 24777 was successful.')

      });
      afterEach(()=>{
        cy.wait(3000);
        cy.get('#leftPanel > ul > :nth-child(8) > a').click();
        cy.log("Visit Again");
      })
});