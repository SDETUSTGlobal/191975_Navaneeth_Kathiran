describe('Freelancer login', ()=> {
    browser.driver.get('https://www.freelancer.in/dashboard');
    it('Should navigate to Login Page',()=>  {
        element(By.xpath("")).click();
        console.log("login successfull");
            browser.getCurrentUrl().then((url) => {
                expect(url).toBe('https://www.freelancer.in/lists/favorites');
            });
            
        });
        
    });
