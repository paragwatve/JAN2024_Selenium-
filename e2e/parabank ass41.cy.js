import { afterEach } from "mocha";
import {paralogin} from "D:\Dec2023\cypress\e2e\Repo.paralogin.cy.js"
describe("Feature1 ParaBank", () => {
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
      cy.get('#leftPanel > ul > :nth-child(3) > a').click();
       cy.wait(2000);
       cy.get('#amount').click().type("12345");
       cy.get('#fromAccountId').select("24222");
       cy.get('#toAccountId').select("24222")
       cy.get(':nth-child(4) > .button').click();
       cy.log("Fund transfered Successful ")
       cy.get('.ng-scope > :nth-child(2)').should('contain','$12345.00 has been transferred from account')

      });
      afterEach(()=>{
        cy.wait(3000);
        cy.get('#leftPanel > ul > :nth-child(8) > a').click();
        cy.log("Visit Again");
      })
});