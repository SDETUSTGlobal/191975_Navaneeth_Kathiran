

describe('Freelancer  lists', ()=> {
    browser.driver.get('https://www.freelancer.in/dashboard');
    it('Should navigate to lists Page',()=>  {
        element(By.xpath("/html/body/app-root/app-logged-in-shell/div/div[2]/ng-component/app-navigation-secondary-projects/app-bar/fl-container/nav/fl-scrollable-content/div/app-bar-item[2]/a/fl-bit/fl-text/div")).click();
        console.log("my lists ");
            browser.getCurrentUrl().then((url) => {
                expect(url).toBe('https://www.freelancer.in/lists/favorites');
            });
            
        });
        
    });
