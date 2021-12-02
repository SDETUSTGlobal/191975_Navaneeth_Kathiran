describe('Freelancer inbox', ()=> {
    browser.driver.get('https://www.freelancer.in/dashboard');
    it('Should navigate to inbox Page',()=>  {
        element(By.xpath("/html/body/app-root/app-logged-in-shell/div/div[2]/ng-component/app-navigation-secondary-projects/app-bar/fl-container/nav/fl-scrollable-content/div/app-bar-item[4]/a")).click();
        console.log("inbox page");
            browser.getCurrentUrl().then((url) => {
                expect(url).toBe('https://www.freelancer.in/messages');
            });
            
        });
        
    });
