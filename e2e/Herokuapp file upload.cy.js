import 'cypress-file-upload'
describe("Herokuapp file upload",()=>{

    it("Single file upload",()=>{
        cy.visit("https://the-internet.herokuapp.com/upload");
        cy.get("#file-upload").attachFile('exceldata.xlsx');
        cy.get("#file-submit").click();
        cy.wait(5000);
        cy.get("div[class='example'] h3").should('have.text',"File Uploaded!");
    })
    it.skip("File upload Rename",()=>{
        cy.visit("https://the-internet.herokuapp.com/upload");
        cy.get("#file-upload").attachFile({filepath:'exceldata.xlsx', filename:'myfilename.xlsx'});
        cy.get("#file-submit").click();
        cy.wait(5000);
        cy.get("div[class='example'] h3").should('have.text',"File Uploaded!");
   })
   it("Drag & Drop",()=>{
    cy.visit("https://the-internet.herokuapp.com/upload");
    cy.get('#drag-drop-upload').attachFile("exceldata.xlsx",{subjectType:'drag-n-drop'});
    cy.wait(5000);
  })
})