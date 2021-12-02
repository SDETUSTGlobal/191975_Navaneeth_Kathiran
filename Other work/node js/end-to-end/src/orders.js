//To view orders in smartbears website

const { browser } = require("protractor");

describe('Web Orders Login', function()  {
	it('Should navigate to Login Page',function()  {
            
          browser.driver.findElement(by.id('ctl00_MainContent_btnCheckAll')).click();
          console.log("orders");
          browser.driver.getTitle().then(function(pageTitle)
           {
               expect(pageTitle).toEqual('Web Orders');
           });

    
        	});
    
    });