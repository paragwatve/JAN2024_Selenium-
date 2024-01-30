import { afterEach } from "mocha";
import {paralogin} from "D:\\Training\\Cypress\\cypress\\e2e\\Repo_paralogin.js"

describe("Hooks", () => {
    before(function () {
            cy.fixture("data_paralogin").then((data)=>{
                
                const obj = new paralogin();
                obj.enterurl(data.url)
                obj.enteruname(data.username)
                obj.enterpass(data.password)
                obj.clicklogin()
                // cy.get('tfoot > tr > td').should('contain','Balance includes')
                // cy.get('#rightPanel').should('contain','13677')
                // cy.wait(1000)
                // obj.clicklogout()
            })
    });
    it("Test1", () => {
        cy.get('#leftPanel > ul > :nth-child(1) > a').click();
        cy.get('#type').select("SAVINGS");
        cy.get('#fromAccountId').select("17673");
        cy.wait(2000);
        //cy.get('.ng-submitted > div > .button').click();
        cy.get('form.ng-valid > div > .button').click();
        cy.get('.title').should('contain','Account Opened!');
      });
      afterEach(()=>{
        cy.wait(3000);
        cy.get('#leftPanel > ul > :nth-child(8) > a').click();
        cy.log("Visit Again");
      })
});