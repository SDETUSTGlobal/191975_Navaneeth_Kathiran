//login for smartbears website

const { element } = require("protractor");

/*describe('Web Orders Login', function()  {
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

    */

    describe('Freelancer login', ()=> {
        it('Should navigate to Login Page',()=>  {
            //browser.ignoreSynchronization = true;
            browser.driver.get('https://www.freelancer.in/login');
    
            //browser.driver.findElement(by.linkText('login')).click();
            element(by.xpath('/html/body/app-root/app-logged-out-shell/app-login-page/fl-container/fl-bit/app-login/app-credentials-form/form/fl-input[1]/fl-bit/fl-bit/input')).sendKeys('knavaneeth21@gmail.com');
            element(by.xpath('/html/body/app-root/app-logged-out-shell/app-login-page/fl-container/fl-bit/app-login/app-credentials-form/form/fl-input[2]/fl-bit/fl-bit/input')).sendKeys('nvneh@91');
            element(By.xpath("/html/body/app-root/app-logged-out-shell/app-login-page/fl-container/fl-bit/app-login/app-credentials-form/form/app-login-signup-button/fl-button/button")).click();
            console.log("login successfull");
            browser.getCurrentUrl().then((url) => {
                expect(url).toBe('https://www.freelancer.in/dashboard');
            })
                });
        
        });

        /*it('Should go to my list', () => {
            // browser.get('https://www.freelancer.in/dashboard');
            element(by.xpath('/html/body/app-root/app-logged-in-shell/div/div[2]/ng-component/app-navigation-secondary-projects/app-bar/fl-container/nav/fl-scrollable-content/div/app-bar-item[2]/a/fl-bit/fl-text/div')).click();
            browser.getCurrentUrl().then((url) => {
                expect(url).toBe('https://www.freelancer.in/lists/favorites');
            })
    
        });
        */

      /*  it('Should go to my project', () => {
            browser.get('https://www.freelancer.in/dashboard');
            element(by.xpath('/html/body/app-root/app-logged-in-shell/div/div[2]/ng-component/app-navigation-secondary-projects/app-bar/fl-container/nav/fl-scrollable-content/div/app-bar-item[3]/a')).click();
            browser.getCurrentUrl().then((url) => {
                expect(url).toBe('https://www.freelancer.in/manage/work/projects/open?query=&filter=All&show=10');
            })
    
        });
        */