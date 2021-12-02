//To view items in smartbears website

const { browser } = require("protractor");

describe('Web Orders Login', function()  {
	it('Should navigate to Login Page',function()  {
            
          browser.driver.findElement(by.xpath('/html/body/form/table/tbody/tr/td[1]/ul/li[3]/a')).click();
          console.log("order items");
          browser.driver.getTitle().then(function(pageTitle)
           {
               expect(pageTitle).toEqual('Web Orders');
           });

    
        	});
    
    });