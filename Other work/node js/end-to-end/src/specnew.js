
const { browser } = require("protractor");

describe('Web Orders Login', function()  {
	it('Should navigate to Login Page',function()  {
            //browser.ignoreSynchronization = true;
            browser.driver.get('http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx');

    browser.driver.findElement(by.id('ctl00_MainContent_username')).sendKeys('Tester');
    browser.driver.findElement(by.id('ctl00_MainContent_password')).sendKeys('test');
    browser.driver.findElement(by.id('ctl00_MainContent_login_button')).click();
          console.log("login successfull");
          browser.driver.getTitle().then(function(pageTitle)
           {
               expect(pageTitle).toEqual('Web Orders');
           });

    
        	});
    
    });
    
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
    describe('Web Orders Login', function()  {
        it('Should navigate to Login Page',function()  {
                
              browser.driver.findElement(by.xpath('/html/body/form/table/tbody/tr/td[1]/ul/li[3]/a')).click();
              console.log("items");
              browser.driver.getTitle().then(function(pageTitle)
               {
                   expect(pageTitle).toEqual('Web Orders');
               });
    
        
                });
        
        });
        describe('Web Orders Login', function()  {
            it('Should navigate to Login Page',function()  {
                    
                  browser.driver.findElement(by.xpath('/html/body/form/table/tbody/tr/td[1]/ul/li[2]/a')).click();
                  console.log("products");
                  browser.driver.getTitle().then(function(pageTitle)
                   {
                       expect(pageTitle).toEqual('Web Orders');
                   });
        
            
                    });
            
            });

            